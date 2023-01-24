@parametrizing1
Feature: Search_Feature

  Background: user_goes_to_google_page
    Given user is on the google home page

  Scenario: TC_01_tesla_search
    When user search for "tesla" on google
    Then verify page title contains "tesla"
    Then close the application

  Scenario: TC_02_togg_search
    When user search for "togg" on google
    Then verify page title contains "togg"
    Then close the application

  Scenario: TC_03_nio_search
    When user search for "nio" on google
    Then verify page title contains "nio"
    Then close the application

  Scenario: TC_04_mercedes_search
    When user search for "mercedes" on google
    Then verify page title contains "nio"
    Then close the application