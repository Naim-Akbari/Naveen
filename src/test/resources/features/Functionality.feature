Feature: Verify all the functions are working correctly


  Scenario: Search a product when the user is logged in
    Given the user navigates to home page
    And the user clicks on My Account
    And the user clicks on "Login"
    And the user enters credentials
    When the user searches for "mac"
    Then the search result shows only "Mac"

  Scenario: The user adds a product to the wishlist
    Given the user navigates to home page
    And the user clicks on My Account
    And the user clicks on "Login"
    And the user enters credentials
    When the user searches for "mac"
    And the user adds it to the wishlist
    Then the product "mac" is added to the wishlist


  @wip
  Scenario: The slide show works fine
  Given the user navigates to home page
  Then the slideshow shows different objects




#  Verify that the different pre-paid methods of payments are working fine.
#  Verify that the swiper slide works fine
#  Verify that the required/mandatory fields are marked with * against the field.


