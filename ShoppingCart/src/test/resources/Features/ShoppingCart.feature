#Author: Menaka.chandrasekar@tcs.com
#Sample Feature Definition Template
Feature: Shopping Cart Scenarios

  Scenario Outline: login to the website
    Given Shoppingcart website is open
    When user enters the <username> and <password>
    And clicks on the submit button
    Then user is navigated to homepage
    And list of categories are displayed

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
