@Grid
Feature: Title test

  @chrome
  Scenario: TC01_title_test_chrome
    Given User is on the home page "http://139.59.159.36:3000/" by Chrome
    Then User verifies title is "Managementon Schools"
    And User closes the remote driver


  @edge
  Scenario: TC01_title_test_edge
    Given User is on the home page "http://139.59.159.36:3000/" by Edge
    Then User verifies title is "Managementon Schools"
    And User closes the remote driver

  @firefox
  Scenario: TC01_title_test_firefox
    Given User is on the home page "http://139.59.159.36:3000/" by Firefox
    Then User verifies title is "Managementon Schools"
    And User closes the remote driver
