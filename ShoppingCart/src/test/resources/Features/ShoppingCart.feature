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

  Scenario Outline: User adds a product to the cart and proceeds to checkout
    Given User is on the product listing page
    When User selects with quantity adds it to the cart
    Then The product should be added to the cart
    When User proceeds to checkout
    Then User should enter the checkout Information <Firstname>,<Lastname> and <Postalcode>

    Examples: 
      | Firstname | Lastname | Postalcode |
      | AAA       | BBB      | "5678"     |
