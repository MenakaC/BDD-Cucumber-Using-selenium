#Author
#Date
#Description
Feature: feature to test fblogin functionality

  Scenario Outline: Check fblogin is successful with  valid credentials
    Given user is on fblogin page
    When user enters the <username> and <password>
    And user clicks on submit button
    Then user is navigated to fbhomepage

    Examples: 
      | username            | password     |
      | menaka.c1@gmail.com | Beyourself3@ |
