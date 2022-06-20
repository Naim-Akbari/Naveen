package com.ECommerceNaveen.pages;

import com.ECommerceNaveen.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage (){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy (xpath = "(//button[@data-toggle='dropdown'])[1]")
    public WebElement currencyButton;

    @FindBy (xpath = "//button[@name='EUR']")
    public WebElement EURButton;

    @FindBy (xpath = "//button[@name='GBP']")
    public WebElement GBPButton;

    @FindBy (xpath = "//button[@name='USD']")
    public WebElement USDButton;

    @FindBy (xpath = "//a[@title='My Account']")
    public WebElement myAccountButton;

    @FindBy (partialLinkText = "Register")
    public WebElement registerButton;

    @FindBy (partialLinkText = "Login")
    public WebElement loginButton;

    @FindBy (xpath = "(//div[@data-swiper-slide-index='0'])[2]")
    public WebElement slideShow;



    public void clickonElement(String webElementToBeClicked){

        Driver.get().findElement(By.partialLinkText(webElementToBeClicked)).click();

    }

}
