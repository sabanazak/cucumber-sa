@blue_rental_cars
Feature: Blue_Rental_Cars_Login

  Scenario Outline: TC Login And Verify User  Logged In
    Given user is on the "https://www.bluerentalcars.com/" page
    When user navigates to the login page
    And enter username "<username>"
    And enter password "<password>"
    And click on login button
    Then verify the login is successful
    And user logout
    And close the blue rental cars application

    Examples: test_data
      |username|password|
      |sam.walker@bluerentalcars.com|c!fas_art|
      |kate.brown@bluerentalcars.com|tad1$Fas|
      |raj.khan@bluerentalcars.com|v7Hg_va^|
      |pam.raymond@bluerentalcars.com|Nga^g6!|