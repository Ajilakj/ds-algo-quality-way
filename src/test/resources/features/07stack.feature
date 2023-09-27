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
  
  
  
  @tag  @stack
  Feature: to test functionality of stack
  
  @tag1 
  Scenario: An existing user logged in with valid credentials in homepage
	  Given An existing user is in the Home page
	  When The user clicks the Getting Started button in stack Pane
	  Then The user will directed to stack Page
	  
	@tag2
  Scenario:  An existing user logged in with valid credentials in homepage
  	Given( A valid user is in the Home page after logged in
	  When The user select the option stack from the datastructure drop down menu
	  Then The user will directed to stack Page using dropdown
	  

  @tag3
  Scenario: A logged in user is in the stack page
    Given The user is in the stack page
    When The user clicks Operations in Stack link
    Then The user should be directed to Operations in Stack Page

  @tag4
  Scenario: User is in the Operations in Stack page
    When The user clicks Try Here button for Operations in Stack
    Then The user should be redirected to a tryEditor page for Operations in Stack
  

   @tag5
  Scenario: A logged in user is in the tryEditor page from Operations in Stack
    When user write some valid java code for Operations in Stack page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for Operations in Stack page
    
   @tag6
  Scenario: A logged in user is in the tryEditor page from Operations in Stack page
    When user write some invalid code for Operations in Stack then click run button
    Then an alert with SyntaxError: bad input on line 1 will display for Operations in Stack
    
  @tag7
  Scenario: A logged in user is in the tryEditor page from Operations in Stack page
    When user write some python code for Operations in Stack page as input then click run button
    Then The output will be display in the editor for Operations in Stack page
    

  @tag8
  Scenario: A logged in user is in the Operations in Stack Page
    Given The user is in the Operations in Stack Page
    When The user clicks Implementation link
    Then The user should be directed to Implementation Page
    
	@tag9  
  Scenario: A logged in user is in the Implementation page
    When The user clicks Try Here button from Implementation page
    Then The user should be redirected to a tryEditor page for Implementation
  
  @tag10
  Scenario: A logged in user is in the tryEditor page from Implementation page
    When user write some valid java code for Implementation page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for Implementation page
    
  @tag11
  Scenario: A logged in user is in the tryEditor page from Implementation page
    When user write some invalid code for Implementation then click run button
    Then an alert with SyntaxError: bad input on line 1 will display for Implementation
    
  @tag12
  Scenario: A logged in user is in the tryEditor page from Implementation page
    When user write some python code for Implementation page as input then click run button
    Then The output will be display in the editor for Implementation page
    
  @tag13
  Scenario: A logged in user is in the Implementation page
    Given The user is in the Implementation page
    When The user clicks Applications link
    Then The user should be directed to Applications Page
    
	@tag14 
  Scenario: A logged in user is in the  Applications page
    When The user clicks Try Here button from Applications page
    Then The user should be redirected to a tryEditor for Applications
  
  @tag15
  Scenario: A logged in user is in the tryEditor page from Applications page
    When user write some valid java code for Applications page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for Applications page
    
  @tag16
  Scenario: A logged in user is in the tryEditor page from Applications page
    When user write some invalid code for Applications then click run button
    Then an alert with SyntaxError: bad input on line 1 will display for Applications
    
  @tag17
  Scenario: A logged in user is in the tryEditor page from Applications page
    When user write some python code for Applications page as input then click run button
    Then The output will be display in the editor for Applications page
    
  @tag18
  Scenario:  A logged in user is in the Applications page
    Given The user is in the Applications page
    When The user clicks Practice questions link from stack
    Then The user should be directed to practice questions Page for stack
    
    


    