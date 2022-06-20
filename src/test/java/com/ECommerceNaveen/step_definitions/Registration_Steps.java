package com.ECommerceNaveen.step_definitions;

import com.ECommerceNaveen.pages.LoginPage;
import com.ECommerceNaveen.pages.RegistrationPage;
import com.ECommerceNaveen.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Registration_Steps {

    @Then("the user fills the application form")
    public void the_user_fills_the_application_form() {


        new RegistrationPage().fillTheForm();
        Assert.assertEquals("Your Account Has Been Created!", new RegistrationPage().successMessage.getText());

    }

    @When("the user enters credentials")
    public void the_user_enters_credentials() {

        LoginPage loginPage = new LoginPage();
        loginPage.emailInput.sendKeys(ConfigurationReader.get("loginuseremail"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.get("loginuserpassword"));
        loginPage.loginButton.click();

    }

    @Then("the page title should be {string}")
    public void the_page_title_should_be(String loginMessage) {

        Assert.assertEquals(loginMessage, new LoginPage().pageTitle.getText());

    }

    @When("the user clicks on Continue")
    public void the_user_clicks_on_Continue() {
        new RegistrationPage().continueButton.click();
    }

    @Then("the error message is shown")
    public void the_error_message_is_shown() {
        RegistrationPage registrationPage = new RegistrationPage();
        String errorMessage = registrationPage.firstNameErrorMessage.getText();
        Assert.assertEquals("First Name must be between 1 and 32 characters!", errorMessage);
        System.out.println(errorMessage);
    }


}
