Feature: feature to test module1: DataStructures-Introduction

   @tag1 @ds
  Scenario: An existing user logged in with valid credentials in homepage to check Getting Started button in DataStructures Pane
	  Given An existing user is in the Home page after logged in to check Getting Started button in DataStructures Pane
	  When The user clicks the Getting Started button in DataStructures Pane
	  Then The user will directed to DataStructures Page
	  
  @tag2
  Scenario: to test Time Complexity button
    Given user is in Data Structures-Introduction page
    When clicks Time Complexity button
    Then user enters time-complexity page

	@tag3  
  Scenario: A logged in user is in the Data Structures-Introduction page to check tryeditor
    When The user clicks Try Here button for Data Structures-Introduction page
    Then The user should be redirected to a tryEditor page for Data Structures-Introduction page
    
  @tag4
  Scenario: to test with Valid java code
    When user write some valid java code for Data Structures-Introduction page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for Data Structures-Introduction page
    
  @tag5
  Scenario: 5to test with invalid code
    When user write some invalid code for  Data Structures-Introduction then click run button
    Then an alert with SyntaxError: bad input on line 1 will display for Data Structures-Introduction
    
 @tag6
  Scenario: to test valid Python code
     When user write some python code for Data Structures-Introduction page as input then click run button
    Then The output will be display in the editor for Data Structures-Introduction page

  @tag7
  Scenario: to validate user can navigate to Practice Questions
    Given user is in time complexity page
    When clicks practice Questions for  Data Structures-Introduction
    Then user is navigated to Practice page for Data Structures-Introduction
