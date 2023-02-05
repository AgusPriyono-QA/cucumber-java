Feature: Login User

  Scenario: User valid login
    When User go to Web demoqa
    And User enter username password
    And User click button login
    Then User valid credentials 