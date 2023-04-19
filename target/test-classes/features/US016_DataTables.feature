
@data_tables
Feature: US016 data_tables

  Scenario: TC01 admin login test
    Given User goes to "brcUrl" page
    #When Clicks Log in
    # | => use the create for dataTable.Also dataTable use with Scenario Outline:
    Then  User enters email and password
          |   email                       | password |
          |sam.walker@bluerentalcars.com  | c!fas_art |
    And Closes the page
