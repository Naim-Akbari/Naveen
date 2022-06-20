package com.ECommerceNaveen.step_definitions;

import com.ECommerceNaveen.pages.MyAccountPage;
import com.ECommerceNaveen.pages.RegistrationPage;
import com.ECommerceNaveen.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Locale;

public class Search_Steps {

    @When("the user searches for {string}")
    public void the_user_searches_for(String item) {

        MyAccountPage myAccountPage = new MyAccountPage();
        myAccountPage.searchInput.sendKeys(item);
        myAccountPage.searchButton.click();

    }

    @Then("the search result shows only {string}")
    public void the_search_result_shows_only_mac(String item) {

        MyAccountPage myAccountPage = new MyAccountPage();
        List<String> searchResult = BrowserUtils.getElementsText(myAccountPage.searchResults);
        BrowserUtils.waitFor(3);


        for (String s : searchResult) {
            System.out.println(s);
            Assert.assertTrue(s.contains(item));
        }


    }

    @When("the user adds it to the wishlist")
    public void the_user_adds_it_to_the_wishlist() {

        new MyAccountPage().AddToWishlistButton.click();

    }

    @Then("the product {string} is added to the wishlist")
    public void the_product_is_added_to_the_wishlist(String item) {

     MyAccountPage myAccountPage = new MyAccountPage();
     myAccountPage.wishListShortCut.click();
     BrowserUtils.waitFor(1);

     List <String> wishListItems = BrowserUtils.getElementsText(myAccountPage.wishListItems);

        Assert.assertTrue(wishListItems.toString().toLowerCase().contains(item));
        System.out.println(wishListItems.toString().toLowerCase());





    }




}
