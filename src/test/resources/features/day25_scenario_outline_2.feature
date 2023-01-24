@data_tables
Feature: data_tables

  Scenario Outline: TC Create And Verify Test Data Creation
    #Crating a reusable step that accept url and goes to that url
    Given user is on "https://editor.datatables.net/" page
    And user clicks on the new button
    And user enters the first name "<firstname>"
    And user enters the last name "<lastname>"
    And user enters the position "<position>"
    And user enters the office "<office>"
    And user enters the extention "<extention>"
    And user enters the start date "<start_date>"
    And user enters the salary "<salary>"
    And click on create button
    And search for the first name "<firstname>"
    Then Verify the name field contains the first name "<firstname>"

    Examples: test_date
    |firstname|lastname|position|office|extention|start_date|salary|
    |Ali|AZAK|Tester|NYC|2134|2023-01-24|20000|
    |Sena|AZAKLI|Dev|NYT|2135|2023-02-02|40000|




