Feature: US014 Classwork

  Scenario: TC01 Test of Usage and Url
    Given User goes homepage that "webUrl"
    Then User scroll down until Login Portal
    And Click on Login Portal
    And Switch to the  other Window
    And Enter values in the "username"
    And Enter values in the  "password"
    And Click on the Login button
    And User waits 1 seconds
    And Test that the text in Popup is validation failed
    And User waits 1 seconds
    And Close the Popup by saying OK
    And User waits 1 seconds
    And Back to the first page
    And Test whether back to the first page