Feature: US012 Usage Hooks&Screenshot Class

  @grup5
  Scenario: TC01  Hooks&Screenshot Usage
    Given User enters the page "https://www.trendyol.com"
    Then User waits 3 seconds
    When User tests that the URL contains "amazon"
    And Closes the page