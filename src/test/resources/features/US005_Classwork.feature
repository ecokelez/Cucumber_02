Feature: US005 Ck Hotels Login


  Scenario: TC01 User logs in with valid information
    Given User on the "brcUrl" homepage
    Then Clicks Login
    And Enters invalid username
    And Enters invalid password
    And Presses the Login button
    Then Checks that the page cannot be accessed
    And The user closes the page
