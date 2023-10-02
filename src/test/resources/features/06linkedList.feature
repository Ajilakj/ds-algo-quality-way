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
  
  
  
  @tag  @llist
  Feature: to test functionality of linked list
  
  @tag1 
  Scenario: An existing user logged in with valid credentials in homepage to check Getting Started button in linked list Pane
	  Given An existing user is in the Home page for linked list
	  When The user clicks the Getting Started button in linked list Pane
	  Then The user will directed to linked list Page
	  
	@tag2
  Scenario:  An existing user logged in with valid credentials in homepage to check the option linked list from the datastructure drop down menu
  	Given( An existing user is in the Home page for linked list
	  When The user select the option linked list from the datastructure drop down menu
	  Then The user will directed to linked list Page using dropdown
    
  @tag3
  Scenario: A logged in user is in the linked list page
    Given The user is in the linked list page
    When The user clicks Introduction link
    Then The user should be directed to Introduction Page
    
	@tag4  
  Scenario: A logged in user is in the Introduction page
    When The user clicks Try Here button for Introduction
    Then The user should be redirected to a tryEditor page for Introduction
  
  @tag5
  Scenario: A logged in user is in the tryEditor page from Introduction page to check valid java code
    When user write some valid java code for Introduction page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for Introduction page
    
  @tag6
  Scenario: A logged in user is in the tryEditor page from Introduction page to check invalid code
    When user write some invalid code for Introduction then click run button
    Then an alert with SyntaxError: bad input on line 1 will display for Introduction
    
  @tag7
  Scenario: A logged in user is in the tryEditor page from Introduction page to check valid python code
    When user write some python code for RegisterDataExcel page as input then click run button
    Then The output will be display in the editor for Introduction page
    
  @tag8
  Scenario: A logged in user is in the Introduction Page
    Given The user is in the Introduction Page
    When The user clicks Creating Linked LIst link
    Then The user should be directed to Creating Linked LIsts Page
    
	@tag9  
  Scenario: A logged in user is in the Creating Linked LIst page
    When The user clicks Try Here button from Creating Linked LIst page
    Then The user should be redirected to a tryEditor page for Creating Linked LIst
  
 @tag10
  Scenario: A logged in user is in the tryEditor page from Creating Linked LIsts page to check valid java code
    When user write some valid java code for Creating Linked LIsts page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for Creating Linked LIsts page
    
  @tag11
  Scenario: A logged in user is in the tryEditor page from Creating Linked LIsts page to check invalid code
    When user write some invalid code for Creating Linked LIsts then click run button
    Then an alert with SyntaxError: bad input on line 1 will display for Creating Linked LIsts
    
  @tag12
  Scenario: A logged in user is in the tryEditor page from Creating Linked LIsts page to check valid python code
    When user write some python code for Creating Linked LIsts page as input then click run button
    Then The output will be display in the editor for Creating Linked LIsts page
    
   @tag13
  Scenario: A logged in user is in the Creating Linked LIst  page
    Given The user is in the Creating Linked LIst page
    When The user clicks Types of linked lists link
    Then The user should be directed to Types of linked lists Page
    
	@tag14  
  Scenario: A logged in user is in the  Types of linked lists page
    When The user clicks Try Here button button from Types of linked lists page
    Then The user should be redirected to a tryEditor for Types of linked lists
  
  @tag15
  Scenario: A logged in user is in the tryEditor page from Types of linked lists page to check valid java code
    When user write some valid java code for Types of linked lists page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for Types of linked lists page
    
  @tag16
  Scenario: A logged in user is in the tryEditor page from Types of linked lists page to check invalid code
    When user write some invalid code for Types of linked lists then click run button
    Then an alert with SyntaxError: bad input on line 1 will display for Types of linked lists
    
  @tag17
  Scenario: A logged in user is in the tryEditor page from Types of linked lists page to check valid python code
    When user write some python code for Types of linked lists page as input then click run button
    Then The output will be display in the editor for Types of linked lists page
    
  @tag18
  Scenario:  A logged in user is in the Types of linked lists page
    Given The user is in the Types of linked lists page
    When The user clicks Implement Linked List in Python link
    Then The user should be directed to Implement Linked List in Python Page
    
	@tag19  
  Scenario: A logged in user is in the  Implement Linked List in Python page
    When The user clicks Try Here button for Implement Linked List in Python
    Then The user should be redirected to a tryEditor page for Implement Linked List in Python
  
 @tag20
  Scenario: A logged in user is in the tryEditor page from Implement Linked List in Python page to check valid java code
    When user write some valid java code for Implement Linked List in Python page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for Implement Linked List in Python page
    
  @tag21
  Scenario: A logged in user is in the tryEditor page from Implement Linked List in Python page to check invalid code
    When user write some invalid code for Implement Linked List in Python then click run button
    Then an alert with SyntaxError: bad input on line 1 will display for Implement Linked List in Python
    
  @tag22
  Scenario: A logged in user is in the tryEditor page from Implement Linked List in Python page to check valid python code
    When user write some python code for Implement Linked List in Python page as input then click run button
    Then The output will be display in the editor for Implement Linked List in Python page
    
 	@tag23
  Scenario: A logged in user is in the Implement Linked List in Python page
    Given The user is in the Implement Linked List in Python
    When The user clicks Traversal link
    Then The user should be directed to Traversal
    
	@tag24  
  Scenario: A logged in user is in the Traversal page
    When The user clicks Try Here button for Traversal
    Then The user should be redirected to a tryEditor page for Traversal
  
  @tag25
  Scenario: A logged in user is in the tryEditor page from Traversal page to check valid java code
    When user write some valid java code for Traversal page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for Traversal page
    
  @tag26
  Scenario: A logged in user is in the tryEditor page from Traversal page to check invalid code
    When user write some invalid code for Traversal then click run button
    Then an alert with SyntaxError: bad input on line 1 will display for Traversal
    
  @tag27
  Scenario: A logged in user is in the tryEditor page from Traversal page to check valid python code
    When user write some python code for Traversal page as input then click run button
    Then The output will be display in the editor for Traversal page
    
   @tag28
  Scenario: A logged in user is in the Traversal Page
    Given The user is in the Traversal Page
    When The user clicks Insertion link
    Then The user should be directed to Insertion Page
    
	@tag29  
  Scenario: A logged in user is in the Insertion page
    When The user clicks Try Here button from Insertion page
    Then The user should be redirected to a tryEditor page for Insertion
  
  @tag30
  Scenario: A logged in user is in the tryEditor page from Insertion page to check valid java code
    When user write some valid java code for Insertion page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for Insertion page
    
  @tag31
  Scenario: A logged in user is in the tryEditor page from Insertion page to check invalid code
    When user write some invalid code for Insertion then click run button
    Then an alert with SyntaxError: bad input on line 1 will display for Insertion
    
  @tag32
  Scenario: A logged in user is in the tryEditor page from Insertion page to check valid python code
    When user write some python code for Insertion page as input then click run button
    Then The output will be display in the editor for Insertion page
    
   @tag33
  Scenario: A logged in user is in the Insertion  page
    Given The user is in the linked list Insertion page
    When The user clicks Deletion link
    Then The user should be directed to Deletion Page
    
	@tag34  
  Scenario: A logged in user is in the  Deletion page
    When The user clicks Try Here button button from Deletion
    Then The user should be redirected to a tryEditor for Deletion
  
 @tag35
  Scenario: A logged in user is in the tryEditor page from Deletion page to check valid java code
    When user write some valid java code for Deletion page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for Deletion page
    
  @tag36
  Scenario: A logged in user is in the tryEditor page from Deletion page to check invalid code
    When user write some invalid code for Deletion then click run button
    Then an alert with SyntaxError: bad input on line 1 will display for Deletion
    
  @tag37
  Scenario: A logged in user is in the tryEditor page from Deletion page to check valid python code
    When user write some python code for Deletion page as input then click run button
    Then The output will be display in the editor for Deletion page
    
  @tag38
  Scenario:  A logged in user is in the Deletion page
    Given The user is in the Deletion
    When The user clicks Practice questions link from linked list
    Then The user should be directed to practice questions Page for linked list
    
    


    