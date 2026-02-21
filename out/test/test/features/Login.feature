Feature: Login functionality

  @Login
  Scenario: Valid login
    Given User is on login page
    When User enters username and password
    Then User should see homepage