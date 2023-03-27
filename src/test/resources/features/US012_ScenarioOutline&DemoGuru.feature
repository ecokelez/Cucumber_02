Feature: US012 Usage ScenarioOutline with Demo Guru Page

 Scenario Outline: TC_01_user_should_be_able_to_get_list_with_column_title
    Given User on the "guruUrl" web page
    Then "<Titles>", prints all values in the column
   Examples:
     | Titles |
     | Company |
     | Group |
     | Prev Close (Rs)|
     | Current Price (Rs) |
     | % Change |

   Scenario: User close the page
     Given Close the page