package com.rapsodo.stepDefinition;

import com.github.javafaker.Faker;
import com.rapsodo.pages.fillInTheBlankPage;
import com.rapsodo.utilities.CommonSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class FillInTheBlank_stepdefinition {

    fillInTheBlankPage fillInTheBlankPage=new fillInTheBlankPage();
    Faker faker=new Faker();
    @When("user enter email")
    public void userEnterEmail() {
        String email= faker.internet().emailAddress();
        fillInTheBlankPage.email.sendKeys(email);
    }


    @And("user enter firstname")
    public void userEnterFirstname() {
        String firstname=faker.name().firstName();
        fillInTheBlankPage.firstName.sendKeys(firstname);
    }

    @And("user enter lastname")
    public void userEnterLastname() {
        String lastname=faker.name().lastName();
        fillInTheBlankPage.lastName.sendKeys(lastname);
    }

    @And("user enter address")
    public void userEnterAddress() {
        String address= faker.address().fullAddress();
        fillInTheBlankPage.Address.sendKeys(address);
    }

    @And("user enter city")
    public void userEnterCity() {
        String city = faker.address().cityName();
        fillInTheBlankPage.Address.sendKeys(city);
    }

    @When("user select state from the state box")
    public void userSelectStateFromTheStateBox() {
        Select stateChoose =new Select(fillInTheBlankPage.state);
        stateChoose.selectByIndex(2);
        CommonSteps.clickWithJS(fillInTheBlankPage.state);
    }

    @And("user enter zipcode")
    public void userEnterZipcode() {
        String zipcode = faker.address().zipCode();
        fillInTheBlankPage.Address.sendKeys(zipcode);
    }

    @And("user enter phoneNumber")
    public void userEnterPhoneNumber() {
        String phone = faker.phoneNumber().cellPhone();
        fillInTheBlankPage.phone.sendKeys(phone);

    }

    @Then("user enter coupon in the discount box")
    public void userEnterCouponInTheDiscountBox() {

        String coupon ="BASEBALLBEST";
        fillInTheBlankPage.discountCode.click();
        fillInTheBlankPage.discountCode.sendKeys(coupon);
    }



}
