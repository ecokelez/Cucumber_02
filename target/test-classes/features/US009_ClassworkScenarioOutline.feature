

Feature: US009 Classwork Scenario Outline usage

  Scenario Outline: TC01 User can add data

    When User goes to "edtUrl"
    Then presses the New button
    And enters "<first name>" in the Name section
    Then User waits 1 seconds
    And enters "<last name>" in the last name section
    Then User waits 1 seconds
    And enters "<position>" in the Position section
    Then User waits 1 seconds
    And enters "<office info>" in the Office section
    Then User waits 1 seconds
    And enters "<extension>" in the Extension section
    Then User waits 1 seconds
    And Startdate enters "<Start date>"
    Then User waits 1 seconds
    And Salary enters "<Salary>"
    Then User waits 1 seconds
    And presses the Create button
    When User searches with "<first name>"
    Then confirms that there is "<first name>" in the Name section
    Examples:
      | first name | last name | position | office info | extension  | Start date | Salary |
      | Ersoy      | COKELEZ   | QA       | Amazon        | Senior   | 2022-12-17 | 20000  |
      | Ali        | COKELEZ   | QA       | Google        | Senior   | 2022-12-17 | 20000  |
      | Zafer      | COKELEZ   | QA       | Amazon        | Senior   | 2022-12-17 | 20000  |
      | Gokhan     | COKELEZ   | QA       | Facebook      | Senior   | 2022-12-17 | 20000  |
      | Emre       | COKELEZ   | QA       | Trendyol      | Senior   | 2022-12-17 | 20000  |