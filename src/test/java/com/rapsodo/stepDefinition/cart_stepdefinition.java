package com.rapsodo.stepDefinition;

import com.rapsodo.pages.cartPage;
import com.rapsodo.utilities.CommonSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class cart_stepdefinition {

    cartPage cartPage= new cartPage();

    @When("user increases quantity")
    public void userIncreasesQuantity() {
        CommonSteps.clickWithJS(cartPage.quantityButton);
        cartPage.quantityButton.sendKeys(Keys.CLEAR);
        String quantity= "2";
        cartPage.quantityButton.sendKeys(quantity);

        String actualPrice= cartPage.price.getText();
        String expectedPrice= "$5,500.00";

        Assert.assertEquals(expectedPrice,actualPrice);
    }

    @And("user chooses Organization Type")
    public void userChoosesOrganizationType() {
        Select orgTypeDropdown =new Select(cartPage.organizationType);
        orgTypeDropdown.selectByIndex(2);
        CommonSteps.clickWithJS(cartPage.checkBox);
    }

    @And("user clicks Checkout button.")
    public void userClicksCheckoutButton() {
        cartPage.CheckOut.click();

    }




}
