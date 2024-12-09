@Regression_TCs
Feature:F03-Quick Meeting | users can create quick meeting
  Scenario: user can create Quick meeting 'meet'
    When user goes to login page
    And user login using valid credentials
    Given user add valid meeting name
    And user choose to create meet
    And user run the created meeting
    And user user accept terms and condition
    Then user start the created meeting

