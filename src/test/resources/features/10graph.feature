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
  
  
  
  @tag  @graph
  Feature: to test functionality of graph
  
  @tag1 
  Scenario: An existing user logged in with valid credentials in homepage
	  Given An existing user is in the Home page after logged in
	  When The user clicks the Getting Started button in Graph Pane
	  Then The user will directed to Graph Page
	  
	@tag2
  Scenario:  An existing user logged in with valid credentials in homepage
  	Given( A valid user is in the Home page for graph
	  When The user select the option Graph from the datastructure drop down menu
	  Then The user will directed to graph Page
    
  @tag3
  Scenario: A logged in user is in the Graph page
    Given The user is in the Graph page
    When The user clicks Graph link
    Then The user should be directed to graph/graph Page
    
	@tag4  
  Scenario: A logged in user is in the Graph page
    When The user clicks Try Here button for Graph page
    Then The user should be redirected to a tryEditor page for Graph page
    
   @tag5
  Scenario: A logged in user is in the tryEditor page from Graph/Graph page
    When user write some valid java code for Graph page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for Graph page
    
    @tag6
  Scenario: A logged in user is in the tryEditor page from Graph/Graph page
    When user write some invalid code for Graph then click run button
    Then an alert with SyntaxError: bad input on line 1 will display for Graph
    
  @tag7
  Scenario: A logged in user is in the tryEditor page from Graph/Graph page
    When user write some python code for Graph page as input then click run button
    Then The output will be display in the editor for Graph page
    
   @tag8 
  Scenario: A logged in user is in the Graph page
  	Given The user is in the Graph page for Graph Representations
    When The user clicks Graph Representations link
    Then The user should be directed to Graph Representations Page
    
    @tag9
  Scenario: The user is in the graph Representations page
    Given The user is in the graph Representations page
    When The user clicks Try Here button for Graph Representations
    Then A tryEditor page with run button will appear for Graph Representations page
    
     @tag10
  Scenario: A logged in user is in the tryEditor page from Graph/Graph Representations page
    When user write some valid java code for Graph Representations then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for Graph Representations 
    
    @tag11
  Scenario: A logged in user is in the tryEditor page from Graph/Graph Representations page
    When user write some invalid java code for Graph Representations then click run button
    Then an alert with SyntaxError: bad input on line 1 will display for Graph Representations 
    
     @tag12
  Scenario: A logged in user is in the tryEditor page from Graph/Graph Representations page
    When The user enter some code in python for Graph Representations and click run button
    Then The output from the pyton code will display in the editor for Graph Representations
    
    @tag13
  Scenario: A logged in user is in the Graph page
  	Given A logged in user is in the graph home page
    When The user clicks Practice questions link for Graph page
    Then The user should be directed to practice questions Page for Graph page
    
    


    