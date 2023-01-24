@google_search
Feature: first feature file

  Background: user_goes_to_google_page
    Given user is on the google home page

  @iphone_search
  Scenario: TC_01_iphone_search
    When user search for iPhone
    Then verify page title contains iPhone
    Then close the application

  @teapot_search
  Scenario: TC_02_teapot_search
    When user search for TeaPot
    Then verify page title contains TeaPot
    Then close the application

#  All feature files must begin with "Feature:" keyword
#  Feature : To declare the file as a cucumber feature file. Mandatory. There can be ONLY one Feature: keyword
#  Scenario : To create test case. In a feature file there may be more than one Scenario:
#  Runner : To run the feature files.
#  Background : Used to run Before each scenario. This is used for repeated pre-conditions
#  CUCUMBER STEPS:
#  1. create feature file and test scenarios
#  2. run the feature file and generate step definitions. dryRun=true
#  3. use the step definitions to complete the java code
#  4. dryRun=false to execute test cases