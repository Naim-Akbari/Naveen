Feature: Homepage Test

  Scenario: Buttons are available and work
    Given the user navigates to home page
    When the user clicks on Currency Button
    Then the elements are "€ Euro" "£ Pound Sterling" and "$ US Dollar"


  @wip
  Scenario: Account Registration
    Given the user navigates to home page
    When the user clicks on My Account
    And the user clicks on "Register"
    Then the user should be redirected to "https://naveenautomationlabs.com/opencart/index.php?route=account/register"
    And the user fills the application form
