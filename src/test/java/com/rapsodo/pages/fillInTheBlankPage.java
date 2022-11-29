package com.rapsodo.pages;

import com.rapsodo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fillInTheBlankPage {

    public fillInTheBlankPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='checkout_email']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='checkout_shipping_address_first_name']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='checkout_shipping_address_last_name']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='checkout_shipping_address_address1']")
    public WebElement Address;

    @FindBy(xpath = "//input[@id='checkout_shipping_address_city']")
    public WebElement City;

    @FindBy(xpath = "//select[@id='checkout_shipping_address_province']")
    public WebElement state;

    @FindBy(xpath = "//input[@id='checkout_shipping_address_zip']")
    public WebElement zipCode;

    @FindBy(xpath = "//input[@id='checkout_shipping_address_phone']")
    public WebElement phone;

    @FindBy(xpath = "//input[@id='checkout_reduction_code']")
    public WebElement discountCode;
}
