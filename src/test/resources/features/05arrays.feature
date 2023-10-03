Feature: To validate the  Array Page

  @tag1
  Scenario: user enters into Array page after logged in
    Given user is in home page
    When clicks Get Started button under Array
    Then user is directed to array page
    
   @tag2
  Scenario:  An existing user logged in with valid credentials in homepage to check the option array from the datastructure drop down menu 
  	Given( A valid user is in the Home page for array
	  When The user select the option array from the datastructure drop down menu
	  Then The user will directed to array Page

  @tag3
  Scenario: to test arrays-in-python page
    Given user is in array page
    When clicks Arrays in Python button
    Then user is directed to arrays-in-python page
    
  @tag4  
  Scenario: A logged in user is in the  arrays-in-python page page to check tryeditor
    When The user clicks Try Here button for arrays-in-python page
    Then The user should be redirected to a tryEditor page for  arrays-in-python page page
    
  @tag5
  Scenario: A logged in user is in the tryEditor page from  arrays-in-python page to check valid java code
    When user write some valid java code for arrays-in-python page  page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for  arrays-in-python page  page
    
  @tag6
  Scenario: to test writing invalid code in tryEditor
    Given user is already in tryeditor page to check invalid code for arrays-in-python page 
    When user enters invalid code in tryeditor box then clicks Run button
    Then an alert with SyntaxError: bad input on line 1 will display for arrays-in-python
    
  @tag7
  Scenario: to test writing valid code in the try Editor
    Given user is already in tryeditor page to check valid code for arrays-in-python page 
    When user enters valid code in tryEditor box then clicks Run button for arrays-in-python
    Then user gets valid output for arrays-in-python

  @tag8
  Scenario: to click Arrays Using List text and navigate into arrays-using-list page after logged in
    Given User is in arrays-in-python page
    When clicks Array Using List link
    Then user is directed to arrays-using-list page
    
   @tag9  
  Scenario: A logged in user is in the  arrays-using-list page to check tryeditor
    When The user clicks Try Here button for arrays-using-list page
    Then The user should be redirected to a tryEditor page for arrays-using-list page
    
  @tag10
  Scenario: A logged in user is in the tryEditor page from  arrays-using-list page to check valid java code
    When user write some valid java code for arrays-using-list page  page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for arrays-using-list  page
    
  @tag11
  Scenario: to test writing invalid code in tryEditor
    Given user is already in tryeditor page to check invalid code for arrays-using-list page 
    When user enters invalid code in tryeditor box then clicks Run button to test array using list
    Then an alert with SyntaxError: bad input on line 1 will display for arrays-using-list
    
  @tag12
  Scenario: to test writing valid code in the try Editor
    Given user is already in tryeditor page to check valid code for arrays-using-list page 
    When user enters valid code in tryEditor box then clicks Run button for arrays-using-list
    Then user gets valid output for arrays-using-list

  @tag13
  Scenario: to navigate into Basic Operations in Lists Page
    Given user is already in arrays-using-List page
    When clicks Basic Operations in Lists Page link
    Then user is directed into basic-operations-in-lists page
    
  @tag14  
  Scenario: A logged in user is in the  basic-operations-in-lists page to check tryeditor
    When The user clicks Try Here button for basic-operations-in-lists page
    Then The user should be redirected to a tryEditor page for basic-operations-in-lists page
    
  @tag15
  Scenario: A logged in user is in the tryEditor page from  basic-operations-in-lists page to check valid java code
    When user write some valid java code for basic-operations-in-lists page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for basic-operations-in-lists page
    
  @tag16
  Scenario: to test writing invalid code in tryEditor for basic-operations-in-lists
    Given user is already in tryeditor page to check invalid code for basic-operations-in-lists page 
    When user enters invalid code in tryeditor box then clicks Run button to test basic-operations-in-lists
    Then an alert with SyntaxError: bad input on line 1 will display for basic-operations-in-lists
    
  @tag17
  Scenario: to test writing valid code in the try Editor for basic-operations-in-lists
    Given user is already in tryeditor page to check valid code for basic-operations-in-lists page 
    When user enters valid code in tryEditor box then clicks Run button for basic-operations-in-lists
    Then user gets valid output for basic-operations-in-lists
    
  @tag18
  Scenario: to navigate into Applications of Array page
    Given user is already in basic-operations-in-lists page
    When clicks Applications of Array link
    Then user is directed to applications-of-array page
    
  @tag19  
  Scenario: A logged in user is in the applications-of-array page to check tryeditor
    When The user clicks Try Here button for applications-of-array page
    Then The user should be redirected to a tryEditor page forapplications-of-array page
    
  @tag20
  Scenario: A logged in user is in the tryEditor page from  applications-of-array page to check valid java code
    When user write some valid java code for applications-of-array page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for applications-of-array page
    
  @tag21
  Scenario: to test writing invalid code in tryEditor for applications-of-array
    Given user is already in tryeditor page to check invalid code for applications-of-array page 
    When user enters invalid code in tryeditor box then clicks Run button to test applications-of-array
    Then an alert with SyntaxError: bad input on line 1 will display for applications-of-array
    
  @tag22
  Scenario: to test writing valid code in the try Editor for applications-of-array
    Given user is already in tryeditor page to check valid code forapplications-of-array page 
    When user enters valid code in tryEditor box then clicks Run button for applications-of-array
    Then user gets valid output for applications-of-array
    
 @tag23
  Scenario: A logged in user is in the applications-of-array  page to check practice questions Page for array page
  	Given A logged in user is in the applications-of-array page
    When The user clicks Practice questions link for array page
    Then The user should be directed to practice questions Page for array page
