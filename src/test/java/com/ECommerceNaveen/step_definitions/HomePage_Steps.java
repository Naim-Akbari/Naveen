package com.ECommerceNaveen.step_definitions;

import com.ECommerceNaveen.pages.BasePage;
import com.ECommerceNaveen.pages.RegistrationPage;
import com.ECommerceNaveen.utilities.ConfigurationReader;
import com.ECommerceNaveen.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomePage_Steps {

    @Given("the user navigates to home page")
    public void the_user_navigates_to_home_page() {

        Driver.get().get(ConfigurationReader.get("url"));

    }

    @When("the user clicks on Currency Button")
    public void the_user_clicks_on_Currency_Button() {
        BasePage basePage = new BasePage();
        basePage.currencyButton.click();
    }


    @Then("the elements are {string} {string} and {string}")
    public void the_elements_are_and(String euro, String pound, String dollar) {

        BasePage basePage = new BasePage();

        Assert.assertEquals(euro, basePage.EURButton.getText());
        Assert.assertEquals(pound, basePage.GBPButton.getText());
        Assert.assertEquals(dollar, basePage.USDButton.getText());

    }

    @When("the user clicks on My Account")
    public void the_user_clicks_on_My_Account() {

        new BasePage().myAccountButton.click();

    }

    @When("the user clicks on {string}")
    public void the_user_clicks_on(String RegOrLog) {

        new BasePage().clickonElement(RegOrLog);

    }

    @Then("the user should be redirected to {string}")
    public void the_user_should_be_redirected_to(String expectedURL) {

        Assert.assertEquals(expectedURL, Driver.get().getCurrentUrl());

    }




}
