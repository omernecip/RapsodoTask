package com.rapsodo.stepDefinition;

import com.rapsodo.pages.rapsodaPage;
import com.rapsodo.utilities.CommonSteps;
import com.rapsodo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class rapsodo_stepdefinition {

    Actions actions=new Actions(Driver.getDriver());
    rapsodaPage rapsodaPage=new rapsodaPage();

    @Given("user goes to the rapsodo home page and verifies that they went to this address")
    public void user_goes_to_the_rapsodo_home_page_and_verifies_that_they_went_to_this_address() {
        Driver.getDriver().get("https://rapsodo.com");
        rapsodaPage.closeAdv.click();

    }
    @When("user clicks on the Cart icon at the top right area.")
    public void user_clicks_on_the_cart_icon_at_the_top_right_area() {
        rapsodaPage.chartButton.click();
    }
    @When("user verifies that shopping cart empty")
    public void user_verifies_that_shopping_cart_empty() {
        // Assert.assertTrue(Driver.getDriver().getTitle().contains("Shopping"));

        String ActualResult= "Your cart is currently empty.";
        String ExpectedResult= rapsodaPage.CartEmptyAssertion.getText();

        Assert.assertEquals(ExpectedResult,ActualResult);
    }


    @And("user clicks on the Baseball button and chooses the Pitching.")
    public void userClicksOnTheBaseballButtonAndChoosesThePitching() {
        rapsodaPage.baseballButton.click();
        rapsodaPage.Pitching.click();

        String actualTitle= Driver.getDriver().getTitle();
        String expectedTitle= "Baseball Pitching Analysis Software | Rapsodo®";

        Assert.assertEquals(expectedTitle,actualTitle);





    }

    @When("user clicks on the Shop Now button")
    public void userClicksOnTheShopNowButton() throws InterruptedException {
        if(rapsodaPage.GotIt.size()>0){
            rapsodaPage.GotIt.get(0).click();
        }
        if(rapsodaPage.shopNowButton.size()>0){
            rapsodaPage.shopNowButton.get(0).click();
        }else {
            Thread.sleep(5000);
        }
//                CommonSteps.scrollToElement(rapsodaPage.shopNowButton);
//                CommonSteps.clickWithJS(rapsodaPage.shopNowButton);
    }

    @And("User chooses Pitching")
    public void userChoosesPitching() {
        CommonSteps.waitForVisibility(rapsodaPage.choosePitching, 10);
        rapsodaPage.choosePitching.click();

        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("rapsodo-pitching"));
    }

    @And("User adds to cart")
    public void userAddsToCart() {
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        CommonSteps.clickWithJS(rapsodaPage.addTocart);
    }


}
