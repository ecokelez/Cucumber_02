@failed_scenario
Feature: US002 Parameter Usage with failed_scenario

  Background: Common Steps
    Given User goes to Amazon page

  Scenario:  TC01 User searches with parameters on  Amazon

    Then User searches for "Nutella"
    And User tests whether the resutls contain "Tadella"
    And Closes the page

  Scenario:  TC02 User searches with parameters on  Amazon

    Then User searches for "Tofaş"
    And User tests whether the resutls contain "Toros"
    And Closes the page