Feature: US008 BlueRentACar Scenario Outline usage


  Scenario Outline : TC01 User logs in with valid information
    Given user goes to "brcUrl" homepage
    Then Clicks Log in
    And enters the  invalid "<wrongUsername>"
    And enters invalid "<wrongPassword>"
    And Presses on the Login button
    Then checks that the page cannot be accessed
    And user waits 3 seconds
    And closes the page
    Examples:
      | wrongUsername    | wrongPassword |
      | a@gmail.com      |   1234        |
      | b@gmail.com      |   1235        |
      | c@gmail.com      |   1236        |
      | d@gmail.com      |   1237        |