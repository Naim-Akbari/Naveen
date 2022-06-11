package com.ECommerceNaveen.step_definitions;

import com.ECommerceNaveen.pages.RegistrationPage;
import io.cucumber.java.en.Then;

public class Registration_Steps {

    @Then("the user fills the application form")
    public void the_user_fills_the_application_form() {


        new RegistrationPage().fillTheForm();


    }

}
