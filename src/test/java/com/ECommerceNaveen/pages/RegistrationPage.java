package com.ECommerceNaveen.pages;

import com.ECommerceNaveen.utilities.BrowserUtils;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

    @FindBy (xpath = "//h1[text()='Register Account']")
    public WebElement pageTitle;

    @FindBy (css = "#input-firstname")
    public WebElement firstNameInput;

    @FindBy (css = "#input-lastname")
    public WebElement lastNameInput;

    @FindBy (css = "#input-email")
    public WebElement emailInput;

    @FindBy (css = "#input-telephone")
    public WebElement phoneInput;

    @FindBy (css = "#input-password")
    public WebElement passwordInput;

    @FindBy (css = "#input-confirm")
    public WebElement confirmPasswordInput;

    @FindBy (xpath = "//input[@name='agree']")
    public WebElement agreeCheckBox;

    @FindBy (xpath = "//input[@type='submit']")
    public WebElement continueButton;


    Faker faker = new Faker();
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String phone = faker.numerify("##########");
    String password = faker.internet().password();


    public void fillTheForm () {

        firstNameInput.sendKeys(firstName);
        lastNameInput.sendKeys(lastName);
        emailInput.sendKeys(firstName+lastName+"@gmail.com");
        phoneInput.sendKeys(phone);
        passwordInput.sendKeys(password);
        confirmPasswordInput.sendKeys(password);

        agreeCheckBox.click();
        BrowserUtils.waitFor(1);
        continueButton.click();
        BrowserUtils.waitFor(5);

    }




}
