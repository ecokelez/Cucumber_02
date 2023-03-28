Feature: US015 User login test

  Scenario: TC01 User create an account on the site
    Given User go to the "autoUrl" web page
    Then User click the Sign in link
    And User enter email adress on the Create and account section
    And User click Create and account button
    And User enter personel nformation and contact details
    And Click Register button
    And Verify account creation
    And User close the page




