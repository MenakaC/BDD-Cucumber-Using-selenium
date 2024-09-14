#Author
#Date
#Description
Feature: feature to test Amazonlogin functionality

  Scenario Outline: Check login is successful with  valid credentials
    Given user is on login page
    When user enters the mobileno <mobilenumber>
    And user clicks on the submit button
    And user enters the pwd <password>
    And user clicks on the Signin button
    Then user is navigated to homepage

    Examples: 
      | mobilenumber  | password  |
      | +919500160952 | amazon123 |
