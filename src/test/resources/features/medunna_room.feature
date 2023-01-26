@MedunnaRoom
Feature: Medunna Room Creation

  Background: Signin Medunna
    Given user is on "https://medunna.com" page
    When click on user icon
    And click on Sign In option
    And enter username in username input
    And enter password in password input
    And click on Remember Me checkbox
    And click on Sign In submit button

  Scenario: Create Room
    When clikc on Items&Titles