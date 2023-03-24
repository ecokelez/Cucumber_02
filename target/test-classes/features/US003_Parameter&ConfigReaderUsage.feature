Feature: US003 Parameter Usage

  Scenario: TC01 Using ConfigRedaer in parameter usage
    Given User goes to "amazonUrl" page
    Then User waits 3 seconds
    When User tests that the URL contains "amazon"
    And Closes the page

  Scenario: TC02 Using ConfigRedaer in parameter usage
    Given User goes to "faceUrl" page
    Then User waits 3 seconds
    When User tests that the URL contains "facebook"
    And Closes the page

  Scenario: TC03 Using ConfigRedaer in parameter usage
    Given User goes to "brcUrl" page
    Then User waits 3 seconds
    When User tests that the URL contains "blue"
    And Closes the page


  Scenario: TC04 Using ConfigRedaer in parameter usage
    Given User goes to "googleUrl" page
    Then User waits 3 seconds
    When User tests that the URL contains "google"
    And Closes the page
