Feature: Login functionality

  @Login
  Scenario: Valid login
    Given User is on login page
    When we enter firstName, email, address
    Then choose gender
    And select day

  @Login
  Scenario: Valid login
    Given User is on homepage
    Then Select country
    And Choose colour
