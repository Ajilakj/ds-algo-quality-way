Feature: feature to test module1: DataStructures-Introduction

  @tag1
  Scenario: to validate user gets into data structure-introduction page
    Given the user is in homepage
    And clicks datastructure Get started button
    Then user enters data structure-introduction page

  @tag2
  Scenario: to test Time Complexity button
    Given user is in Data Structures-Introduction page
    When clicks Time Complexity button
    Then user enters time-complexity page

  @tag3
  Scenario: to test Python code is working
    Given user is in time complexity page
    And clicks Try here>>> button
    When enters valid python code in tryEditor box
    And clicks Run button
    Then the code is executed successfully.

  @tag4
  Scenario: to test with invalid python code
    Given user is in time complexity page
    And clicks Try here>>> button
    When enters invalid python code in tryEditor box
    And clicks Run button
    Then an error message is displayed

  @tag5
  Scenario: to validate user can navigate to Practice Questions
    Given user is in time complexity page
    When clicks practice Questions
    Then user is navigated to Practice page
