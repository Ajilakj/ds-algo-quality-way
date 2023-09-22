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
  Scenario: A logged in user is in the  queue/implementation-lists page
    When The user clicks Try Here button from implementation-lists
    Then The user should be redirected to a tryEditor page for queue/implementation-lists
  
  @tag5
  Scenario: A logged in user is in the tryEditor page for queue/implementation-lists  page
    When some python as input then click run button for queue/implementation-lists
    Then The output will be display in the editor for queue/implementation-lists
    
    @tag6
  Scenario: A logged in user is in the queue/implementation-lists Page
    Given The user is in the queue/implementation-lists Page
    When The user clicks Implementation using collections link
    Then The user should be directed to queue/implementation-collectionss Page
    
	@tag7  
  Scenario: A logged in user is in the queue/implementation-collections page
    When The user clicks Try Here button from queue/implementation-collections page
    Then The user should be redirected to a tryEditor page for queue/implementation-collections
  
  @tag8
  Scenario: A logged in user is in the tryEditor page from queue/implementation-collections  page
    When some python as input then click run button for queue/implementation-collections
    Then The output will be display in the editor for queue/implementation-collections
    
   @tag9
  Scenario: A logged in user is in the queue/implementation-collections  page
    Given The user is in the queue page queue/implementation-collections  page
    When The user clicks implementation using array link
    Then The user should be directed to queue/implementation using array Page
    
	@tag10  
  Scenario: A logged in user is in the  queue/implementation using array page
    When The user clicks Try Here button button from queue/implementation using array page
    Then The user should be redirected to a tryEditor for queue/implementation using array
  
  @tag11
  Scenario: A logged in user is in the tryEditor page from queue/implementation using array page
    When some python as input then click run button for queue/implementation using array
    Then The output will be display in the editor for queue/implementation using array
    
  @tag12
  Scenario:  A logged in user is in the queue/implementation using array page
    Given The user is in the queue/implementation using array page
    When The user clicks Queue Operations link
    Then The user should be directed to queue/Queue Operations Page
    
	@tag13  
  Scenario: A logged in user is in the  queue/Queue Operations page
    When The user clicks Try Here button for queue/Queue Operations
    Then The user should be redirected to a tryEditor page for queue/Queue Operations
  
  @tag14
  Scenario: A logged in user is in the tryEditor page from queue/Queue Operations page
    When some python as input then click run button for queue/Queue Operations
    Then The output will be display in the editor  for queue/Queue Operations
    
    @tag15
  Scenario: A logged in user is in the Queue Operations page
  	Given A logged in user is in the Queue Operations page
    When The user clicks Practice questions link from queue
    Then The user should be directed to practice questions Page for queue
    
    


    