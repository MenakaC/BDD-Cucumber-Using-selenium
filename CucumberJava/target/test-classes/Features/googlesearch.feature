Feature: Feature to test google search functionality

  Scenario: Validate google seatch is working
    Given ChromeBrowser is open
    And User is on google search webpage
    When User enters a text in search page
    And hits enter
    Then user is navigated to search results
