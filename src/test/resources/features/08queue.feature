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
  
  
  
  @tag  @queue
  Feature: to test functionality of queue
  
  @tag1 
  Scenario: An existing user logged in with valid credentials in homepage
	  Given An existing user is in the Home page
	  When The user clicks the Getting Started button in queue Pane
	  Then The user will directed to queue Page
	  
	@tag2
  Scenario:  An existing user logged in with valid credentials in homepage
  	Given( A valid user is in the Home page after logged in
	  When The user select the option queue from the datastructure drop down menu
	  Then The user will directed to queue Page using dropdown
    
  @tag3
  Scenario: A logged in user is in the queue page
    Given The user is in the queue page
    When The user clicks Implementation of Queue in Python link
    Then The user should be directed to queue/implementation-lists Page
    
	@tag4  
  Scenario: A logged in user is in the queue/implementation-lists page
    When The user clicks Try Here button for queue/implementation-lists
    Then The user should be redirected to a tryEditor page for queue/implementation-lists
  
  @tag5
  Scenario: A logged in user is in the tryEditor page from implementation-lists page
    When user write some valid java code for implementation-lists page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for implementation-lists page
    
    @tag6
  Scenario: A logged in user is in the tryEditor page from implementation-lists page
    When user write some invalid code for implementation-lists then click run button
    Then an alert with SyntaxError: bad input on line 1 will display for implementation-lists
    
  @tag7
  Scenario: A logged in user is in the tryEditor page from implementation-lists page
    When user write some python code for implementation-lists page as input then click run button
    Then The output will be display in the editor for implementation-lists page
    
  @tag8
  Scenario: A logged in user is in the queue/implementation-lists Page
    Given The user is in the queue/implementation-lists Page
    When The user clicks Implementation using collections link
    Then The user should be directed to queue/implementation-collectionss Page
    
	@tag9  
  Scenario: A logged in user is in the queue/implementation-collections page
    When The user clicks Try Here button from queue/implementation-collections page
    Then The user should be redirected to a tryEditor page for queue/implementation-collections
  
  @tag10
  Scenario: A logged in user is in the tryEditor page from implementation-collectionss page
    When user write some valid java code for implementation-collectionss page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for implementation-collectionss page
    
  @tag11
  Scenario: A logged in user is in the tryEditor page from implementation-collectionss page
    When user write some invalid code for implementation-collectionss then click run button
    Then an alert with SyntaxError: bad input on line 1 will display for implementation-collectionss
    
  @tag12
  Scenario: A logged in user is in the tryEditor page from implementation-collectionss page
    When user write some python code for implementation-collectionss page as input then click run button
    Then The output will be display in the editor for implementation-collectionss page
    
   @tag13
  Scenario: A logged in user is in the queue/implementation-collections  page
    Given The user is in the queue page queue/implementation-collections  page
    When The user clicks implementation using array link
    Then The user should be directed to queue/implementation using array Page
    
	@tag14
  Scenario: A logged in user is in the  queue/implementation using array page
    When The user clicks Try Here button button from queue/implementation using array page
    Then The user should be redirected to a tryEditor for queue/implementation using array
  
 @tag15
  Scenario: A logged in user is in the tryEditor page from implementation using array page
    When user write some valid java code for implementation using array page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for implementation using array page
    
  @tag16
  Scenario: A logged in user is in the tryEditor page from implementation using array page
    When user write some invalid code for implementation using array then click run button
    Then an alert with SyntaxError: bad input on line 1 will display for implementation using array
    
  @tag17
  Scenario: A logged in user is in the tryEditor page from implementation using array page
    When user write some python code for implementation using array page as input then click run button
    Then The output will be display in the editor for implementation using array page
    
  @tag18
  Scenario:  A logged in user is in the queue/implementation using array page
    Given The user is in the queue/implementation using array page
    When The user clicks Queue Operations link
    Then The user should be directed to queue/Queue Operations Page
    
	@tag19  
  Scenario: A logged in user is in the  queue/Queue Operations page
    When The user clicks Try Here button for queue/Queue Operations
    Then The user should be redirected to a tryEditor page for queue/Queue Operations
  
  @tag20
  Scenario: A logged in user is in the tryEditor page from Queue Operations page
    When user write some valid java code for Queue Operations page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for Queue Operations page
    
 	@tag21
  Scenario: A logged in user is in the tryEditor page from Queue Operations page
    When user write some invalid code for Queue Operations then click run button
    Then an alert with SyntaxError: bad input on line 1 will display for Queue Operations
    
  @tag22
  Scenario: A logged in user is in the tryEditor page from Queue Operations page
    When user write some python code for Queue Operations page as input then click run button
    Then The output will be display in the editor for Queue Operations page
    
  @tag23
  Scenario: A logged in user is in the Queue Operations page
  	Given A logged in user is in the Queue Operations page
    When The user clicks Practice questions link from queue
    Then The user should be directed to practice questions Page for queue
    
    


    