Feature: US010 Classwork

  Scenario: TC01 herokuapp site button scan
    Given User goes to "herokuUrl"
    Then Press the  Add Element button
    And Wait until the Delete button is visible
    And Test whether the Delete button is visible
    And Delete button by pressing the  button
    And Test that the AddRemove Element font is visibility
    And Test that  the Delete button is not visible
    And Close the page