Feature: Amazon Search

  @grup1
  Scenario: TC01 User searchs for Nutella on the Amazon

    Given User goes to Amazon page
    Then User searches for Nutella
    And User tests whether the resutls contain Nutella
    And Closes the page
  @grup2
    Scenario: TC02 User searches for Seleniun on the Amazon

      Given User goes to Amazon page
      Then User searches for Selenium
      And User tests whether the results contain Selenium
      And Closes the page

    @grup3
      Scenario: TC03 User searches for Ipone ont the Amazon
        Given User goes to Amazon page
        Then User searches for Ipone
        And User tests whether the resutls contain Iphone
        And Closes the page



