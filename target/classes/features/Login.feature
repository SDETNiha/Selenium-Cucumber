Feature: Login functionality

  @test1 @smoke
  Scenario: Valid login
    Given User is on login page
    When we enter firstName, email, address
    Then choose gender
    And select day

  @test2 @smoke
  Scenario:Verify country selection functionality
    Given User is on homepage
    Then Select country
    And Choose colour

  @test3 @smoke
  Scenario: Verify date functionality
    Given User is on homepage
    Then Select Date
    Then Upload Files
    Then  select Table element

  @test4 @smoke
  Scenario: Verify pagination of web element
    Given User is on homepage
    Then  select elememt of next page

  @test5 @smoke
  Scenario:Verify wikipedia search functionality
    Given User is on homepage
    Then  Search Data

  @test6 @smoke
  Scenario:Handle Dynamic buttons
    Given User is on homepage
    Then  Handle Dynamic button

  @test7 @smoke
  Scenario:verify drag and Drop Functionality
    Given User is on homepage
    Then  Drag and Drop
    Then Double Click
    Then mouse Hover


  @test8 @smoke
  Scenario:verify drag and Drop Functionality
    Given User is on homepage
    Then Verify Simple Alert
    Then Verify Confirmation Alert
    Then Verify Prompt Alert


