package com.ECommerceNaveen.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {


    @FindBy (xpath = "//input[@value='register']")
    public WebElement registerButton;

    @FindBy (xpath = "//input[@value='guest']")
    public WebElement guestButton;

    @FindBy (xpath = "//input[@value='Continue']")
    public WebElement continueButton;

    @FindBy (css = "#input-email")
    public WebElement emailInput;

    @FindBy (css = "#input-password")
    public WebElement passwordInput;

    @FindBy (xpath = "//a[text()='Forgotten Password']")
    public WebElement forgotPasswordLink;

    @FindBy (xpath = "//input[@value='Login']")
    public WebElement loginButton;



}
