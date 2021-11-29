Feature: feature to test login functionality

  @unsuccessfullogin
  Scenario: check login is unscuccessful using invalid email
    Given User is on login page
    When User enters the invalid email address
    And User click continue button
    Then User should get that the notification that the email address is invalid

  @successfullogin
  Scenario: check login is scuccessful using valid account
    Given User is on login page again
    When User enters the email address again
    Then User clicks continue button again
    And User enters password
    Then User clicks signin button
    And User create new note
    Then User writes note
    And User clicks account
    Then User clicks logout

  @Loginagain
  Scenario: Signin again and verify the saved note
    Given User is on signin page to verify
    When User enter mail address and clicks continue to verify
    Then User enter password and click signin to verify
    And User verify note
