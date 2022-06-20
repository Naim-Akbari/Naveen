package com.ECommerceNaveen.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {


    @FindBy (css = "#input-email")
    public WebElement emailInput;

    @FindBy (css = "#input-password")
    public WebElement passwordInput;

    @FindBy (xpath = "//input[@type='submit']")
    public WebElement loginButton;

    @FindBy (xpath = "//h2[text()='My Account']")
    public WebElement pageTitle;

}
