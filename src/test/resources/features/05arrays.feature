#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

# Feature: Title of your feature
# I want to use this template for my feature file
  
  
  
  @tag  @array
Feature: To validate the  Array Page

  @tag1 
  Scenario: user enters into Array page after logged in
    Given user is in home page to test array
    When clicks Get Started button under Array
    Then user is directed to array page
    
   @tag2
  Scenario: An existing user logged in with valid credentials in homepage to check the option array from the datastructure drop down menu 
  	Given( A valid user is in the Home page for array
	  When The user select the option array from the datastructure drop down menu
	  Then The user will directed to array Page

  @tag3
  Scenario: to test arrays-in-python page
    Given user is in array page
    When clicks Arrays in Python link
    Then user will directed to arrays-in-python page
    
  @tag4  
  Scenario: A logged in user is in the  arrays-in-python page page to check tryeditor
    When The user clicks Try Here button for arrays-in-python page
    Then The user should be redirected to a tryEditor page for  arrays-in-python page page
    
  @tag5
  Scenario: A logged in user is in the tryEditor page from  arrays-in-python page to check valid java code
    When user write some valid java code for arrays-in-python page  page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for  arrays-in-python page  page
    
  @tag6
  Scenario: to test writing invalid code in tryEditor for arrays-in-python
    When user enters invalid code in tryeditor box then clicks Run button
    Then an alert with SyntaxError: bad input on line 1 will display for arrays-in-python
    
  @tag7
  Scenario: to test writing valid code in the try Editor for arrays-in-python
    When user enters valid code in tryEditor box then clicks Run button for arrays-in-python
    Then user gets valid output for arrays-in-python

  @tag8
  Scenario: to click Arrays Using List text and navigate into arrays-using-list page after logged in
    Given User is in arrays-in-python page
    When clicks Array Using List link
    Then user will directed to arrays-using-list page
    
   @tag9  
  Scenario: A logged in user is in the  arrays-using-list page to check tryeditor
    When The user clicks Try Here button for arrays-using-list page
    Then The user should be redirected to a tryEditor page for arrays-using-list page
    
  @tag10
  Scenario: A logged in user is in the tryEditor page from  arrays-using-list page to check valid java code
    When user write some valid java code for arrays-using-list page  page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for arrays-using-list  page
    
  @tag11
  Scenario: to test writing invalid code in tryEditor Run button to test array using list
    When user enters invalid code in tryeditor box then clicks Run button to test array using list
    Then an alert with SyntaxError: bad input on line 1 will display for arrays-using-list
    
  @tag12
  Scenario: to test writing valid code in the try Editor for arrays-using-list
    When user enters valid code in tryEditor box then clicks Run button for arrays-using-list
    Then user gets valid output for arrays-using-list

  @tag13
  Scenario: to navigate into Basic Operations in Lists Page
    Given user is in arrays-using-List page
    When clicks Basic Operations in Lists Page link
    Then user will directed into basic-operations-in-lists page
    
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
    When user enters invalid code in tryeditor box then clicks Run button to test basic-operations-in-lists
    Then an alert with SyntaxError: bad input on line 1 will display for basic-operations-in-lists
    
  @tag17
  Scenario: to test writing valid code in the try Editor for basic-operations-in-lists
    When user enters valid code in tryEditor box then clicks Run button for basic-operations-in-lists
    Then user gets valid output for basic-operations-in-lists
    
  @tag18
  Scenario: to navigate into Applications of Array page
    Given user is in basic-operations-in-lists page
    When clicks Applications of Array link
    Then user will directed to applications-of-array page
    
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
    When user enters invalid code in tryeditor box then clicks Run button to test applications-of-array
    Then an alert with SyntaxError: bad input on line 1 will display for applications-of-array
    
  @tag22
  Scenario: to test writing valid code in the try Editor for applications-of-array
    When user enters valid code in tryEditor box then clicks Run button for applications-of-array
    Then user gets valid output for applications-of-array
    
 @tag23
  Scenario: A logged in user is in the applications-of-array  page to check practice questions Page for array page
  	Given A logged in user is in the applications-of-array page
    When The user clicks Practice questions link for array page
    Then The user should be directed to practice questions Page for array page
    
  @tag24
  Scenario: The user already in practice questions Page to check links
    Given The user already in practice questions Page for array page
    When user select search the Array link
    Then user will directed to a text editor for search the Array
    
   @tag25
  Scenario: A user is in the question page from  for search the Array page to check valid java code
    When user write some valid java code for for search the Array page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for for search the Array page
    
   @tag26
  Scenario: to test writing valid java code in the try Editor for for search the Array to test submit
    When user enters valid code  then clicks submit button for for search the Array
    Then user gets No tests were collected message for for search the Array for valid code
    
  @tag27
  Scenario:  A user is in the question page from  for search the Array page to check invalid code
    When user enters invalid code then clicks Run button to test for search the Array
    Then an alert with SyntaxError: bad input on line 1 will display for for search the Array
    
  @tag28 
  Scenario: to test writing invalid code in the try Editor for for search the Array to test submit
    When user enters invalid code  then clicks submit button for for search the Array
    Then user gets No tests were collected message forfor search the Array for invalid code
    
  @tag29 
  Scenario: to test writing valid python code in the try Editor for for search the Array
    When user enters valid python code then clicks Run button for for search the Array
    Then user gets valid output for for search the Array
    
   @tag30  
  Scenario: to test writing valid python code in the try Editor for for search the Array to test submit
    When user enters valid python code  then clicks submit button for for search the Array
    Then user gets No tests were collected message for Squares of a for search the Array
    
   @tag31
  Scenario: The user already in practice questions Page to check Max Consecutive Ones link
    Given The user already in practice questions Page for Max Consecutive Ones
    When user select Max Consecutive Ones link
    Then user will directed to a text editor for Max Consecutive Ones
    
  @tag32
  Scenario: A user is in the question page from  Squares of a Max Consecutive Ones page to check valid java code
    When user write some valid java code for Squares of a Max Consecutive Ones then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for SMax Consecutive Ones
    
  @tag33
  Scenario: to test writing valid java code in the try Editor for Max Consecutive Ones to test submit
    When user enters valid code  then clicks submit button for Max Consecutive Ones
    Then user gets No tests were collected message for Max Consecutive Ones for valid code
    
  @tag34
  Scenario:  A user is in the question page from Max Consecutive Ones page to check invalid code
    When user enters invalid code then clicks Run button to test Max Consecutive Ones
    Then an alert with SyntaxError: bad input on line 1 will display for Max Consecutive Ones
    
  @tag35 
  Scenario: to test writing invalid code in the try Editor for Max Consecutive Ones to test submit
    When user enters invalid code  then clicks submit button for Max Consecutive Ones
    Then user gets No tests were collected message for Max Consecutive Ones for invalid code
    
  @tag36
  Scenario: to test writing valid python code in the try Editor for Max Consecutive Ones
    When user enters valid python code then clicks Run button for Max Consecutive Ones
    Then user gets valid output for Max Consecutive Ones
    
   @tag37  
  Scenario: to test writing valid python code in the try Editor for Max Consecutive Ones to test submit
    When user enters valid python code  then clicks submit button for Max Consecutive Ones
    Then user gets No tests were collected message for Max Consecutive Ones for python code
    
     @tag38
  Scenario: The user already in practice questions Page to check Find Numbers with Even Number of Digits link
    Given The user already in practice questions Page for Find Numbers with Even Number of Digits
    When user select Find Numbers with Even Number of Digits link
    Then user will directed to a text editor for Find Numbers with Even Number of Digits
    
   @tag39
  Scenario: A user is in the question page from Find Numbers with Even Number of Digits page to check valid java code
    When user write some valid java code for Find Numbers with Even Number of Digits page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for Find Numbers with Even Number of Digits page
    
   @tag40
  Scenario: to test writing valid java code in the try Editor for Find Numbers with Even Number of Digits to test submit
    When user enters valid code  then clicks submit button for Find Numbers with Even Number of Digits
    Then user gets No tests were collected message for Find Numbers with Even Number of Digits for valid code
    
   @tag41
  Scenario:  A user is in the question page from  Find Numbers with Even Number of Digits page to check invalid code
    When user enters invalid code then clicks Run button to test Find Numbers with Even Number of Digits
    Then an alert with SyntaxError: bad input on line 1 will display for Find Numbers with Even Number of Digits
    
   @tag42
  Scenario: to test writing invalid code in the try Editor for Find Numbers with Even Number of Digits to test submit
    When user enters invalid code  then clicks submit button for Find Numbers with Even Number of Digits
    Then user gets No tests were collected message for Find Numbers with Even Number of Digits for invalid code
    
   @tag43
  Scenario: to test writing valid python code in the try Editor for Find Numbers with Even Number of Digits
    When user enters valid python code then clicks Run button for Find Numbers with Even Number of Digits
    Then user gets valid output for Find Numbers with Even Number of Digits
    
   @tag44
  Scenario: to test writing valid python code in the try Editor for Find Numbers with Even Number of Digits to test submit
    When user enters valid python code  then clicks submit button for Find Numbers with Even Number of Digits
    Then user gets No tests were collected message for Find Numbers with Even Number of Digits for python code
    
   @tag45
  Scenario: The user already in practice questions Page to check Squares of a Sorted Array links
    Given The user already in practice questions Page for Squares of a Sorted Array
    When user select Squares of a Sorted Array link
    Then user will directed to a text editor for Squares of a Sorted Array
    
   @tag46
  Scenario: A user is in the question page from  Squares of a Sorted Array page to check valid java code
    When user write some valid java code for Squares of a Sorted page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for Squares of a Sorted page
    
   @tag47
  Scenario: to test writing valid java code in the try Editor for Squares of a Sorted to test submit
    When user enters valid code  then clicks submit button for Squares of a Sorted
    Then user gets No tests were collected message for Squares of a Sorted for valid code
    
   @tag48
  Scenario:  A user is in the question page from  Squares of a Sorted Array page to check invalid code
    When user enters invalid code then clicks Run button to test Squares of a Sorted
    Then an alert with SyntaxError: bad input on line 1 will display for Squares of a Sorted
    
   @tag49
  Scenario: to test writing invalid code in the try Editor for Squares of a Sorted to test submit
    When user enters invalid code  then clicks submit button for Squares of a Sorted
    Then user gets No tests were collected message for Squares of a Sorted for invalid code
    
   @tag50
  Scenario: to test writing valid python code in the try Editor for Squares of a Sorted
    When user enters valid python code then clicks Run button for Squares of a Sorted
    Then user gets valid output for Squares of a Sorted
    
   @tag51
  Scenario: to test writing valid python code in the try Editor for Squares of a Sorted to test submit
    When user enters valid python code  then clicks submit button for Squares of a Sorted
    Then user gets No tests were collected message for Squares of a Sorted for python code
