Feature: US004 Parametre Kullanimi

Scenario: TC01 Parameter Usage
    Given User enters the page "https://www.trendyol.com"
    Then User waits 3 seconds
    When User tests that the URL contains "trend"
    And Closes the page