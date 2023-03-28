Feature: US014 Classwork

  Scenario: TC01 Test of Usage and Url
    Given User goes homepage that "webUrl"
    Then User scroll down until Login Portal
    When User waits 1 seconds
    And Click on Login Portal
    When User waits 1 seconds
    And Switch to the  other Window
    And Enter values in the "username"
    When User waits 1 seconds
    And Enter values in the  "password"
    And Click on the Login button
    When User waits 1 seconds
    And Test that the text in Popup is validation failed
    When User waits 1 seconds
    And Close the Popup by saying OK
    When User waits 1 seconds
    And Back to the first page
    When User waits 1 seconds
    And Test whether back to the first page