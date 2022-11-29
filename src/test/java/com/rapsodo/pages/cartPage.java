package com.rapsodo.pages;

import com.rapsodo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartPage {

    public cartPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement quantityButton;

    @FindBy(xpath = "//div[.='$5,500.00']")
    public WebElement price;

    @FindBy(xpath = "//select[@class='required']")
    public WebElement organizationType;

    @FindBy(xpath = "//input[@id='CartTerms']")
    public WebElement checkBox;

    @FindBy(xpath = "//button[contains(text(),'Checkout')]")
    public WebElement CheckOut;

}
