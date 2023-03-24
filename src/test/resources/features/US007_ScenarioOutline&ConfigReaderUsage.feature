Feature: US007 Scenario Outline & ConfigReader Usage

  Scenario Outline : TC01 Using Scenario Outline & ConfigReader Usage usage
    Given User goes to "<requestedWorld>" page
    Then User waits 3 seconds
    When User tests that the URL contains "<requestedWorldCheck>"
    And Closes the page
    Examples:
      | requestedWorld | requestedWorldCheck |
      | amazonUrl      | amazon     |
      | faceUrl        | face       |
      | brcUrl         | blue       |
      | googleUrl      | google     |
