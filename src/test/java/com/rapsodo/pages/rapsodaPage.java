package com.rapsodo.pages;

import com.rapsodo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class rapsodaPage {
    public rapsodaPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/img[1]")
    public WebElement closeAdv;

    @FindBy(xpath = "//header/div[1]/div[1]/div[3]/div[1]/div[1]/a[2]/span[1]/img[1]")
    public WebElement chartButton;

    @FindBy(xpath = "//p[contains(text(),'Your cart is currently empty.')]")
    public WebElement CartEmptyAssertion;

    @FindBy(linkText = "Baseball")
    public WebElement baseballButton;

    @FindBy(xpath = "//span[.='PITCHING 2.0']")
    public WebElement Pitching;

    @FindBy(xpath = "//a[.='Got it!']")
    public List<WebElement> GotIt;

    //   @FindBy(xpath = "(//a[@href=\"/products/rapsodo-pitching-monitor\"])[4]")
    @FindBy(xpath = "//a[.='Shop Now']")
    public List<WebElement> shopNowButton;

    @FindBy(xpath = "//body/div[@id='PageContainer']/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]/div[1]/div[2]/img[1]")
    public WebElement choosePitching;

    // @FindBy(xpath = "(//input[@value='ADD TO CART'])[1]")
    //@FindBy(xpath = "(//form[@method='post'])[1]")
    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/main[1]/div[2]/div[1]/div[1]/div[5]/div[2]/div[2]/form[1]/input[3]")
    public WebElement addTocart;




}
