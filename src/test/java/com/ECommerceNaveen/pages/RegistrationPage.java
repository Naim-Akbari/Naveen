package com.ECommerceNaveen.pages;

import com.ECommerceNaveen.utilities.BrowserUtils;
import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

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

    @FindBy (xpath = "(//*[text()='Your Account Has Been Created!'])[2]")
    public WebElement successMessage;

    @FindBy (xpath = "//label[@class='col-sm-2 control-label']")
    public List<WebElement> asterisks;

    @FindBy (xpath = "//div[@class='text-danger' and contains(text(), 'First Name')]")
    public WebElement firstNameErrorMessage;

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
        BrowserUtils.waitFor(1);


    }




}
