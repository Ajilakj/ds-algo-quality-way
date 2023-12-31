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
  
  
  
  @tag  @tree
  Feature: to test functionality of tree
  
  @tag1 
  Scenario: An existing user logged in with valid credentials in homepage to check Getting Started button in tree Pane
	  Given An existing user is in the Home page for tree
	  When The user clicks the Getting Started button in tree Pane
	  Then The user will directed to tree Page
	  
	@tag2
  Scenario:  An existing user logged in with valid credentials in homepage to check the option tree from the datastructure drop down menu
  	Given( An existing user is in the Home page for tree
	  When The user select the option tree from the datastructure drop down menu
	  Then The user will directed to tree Page using dropdown
    
  @tag3
  Scenario: A logged in user is in the tree page
    Given The user is in the tree page
    When The user clicks Overview of Trees link
    Then The user should be directed to Overview of Trees Page
    
	@tag4  
  Scenario: A logged in user is in the Overview of Trees page
    When The user clicks Try Here button for Overview of Trees
    Then The user should be redirected to a tryEditor page for Overview of Trees
  
  @tag5
  Scenario: A logged in user is in the tryEditor page from Overview of Trees page to check valid java code
    When user write some valid java code for Overview of Trees page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for Overview of Trees page
    
  @tag6
  Scenario: A logged in user is in the tryEditor page from Overview of Trees page to check invalid code
    When user write some invalid code for Overview of Trees then click run button
    Then an alert with SyntaxError: bad input on line 1 will display for Overview of Trees
    
  @tag7
  Scenario: A logged in user is in the tryEditor page from Overview of Trees page to check valid python code
    When user write some python code for Overview of Trees page as input then click run button
    Then The output will be display in the editor for Overview of Trees page
    
  @tag8
  Scenario: A logged in user is in the Overview of Trees Page
    Given The user is in the Overview of Trees Page
    When The user clicks Terminologies link
    Then The user should be directed to Terminologiess Page
    
	@tag9  
  Scenario: A logged in user is in the Terminologies page
    When The user clicks Try Here button from Terminologies page
    Then The user should be redirected to a tryEditor page for Terminologies
  
 @tag10
  Scenario: A logged in user is in the tryEditor page from Terminologiess page to check valid java code
    When user write some valid java code for Terminologiess page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for Terminologiess page
    
  @tag11
  Scenario: A logged in user is in the tryEditor page from Terminologiess page to check invalid code
    When user write some invalid code for Terminologiess then click run button
    Then an alert with SyntaxError: bad input on line 1 will display for Terminologiess
    
  @tag12
  Scenario: A logged in user is in the tryEditor page from Terminologiess page to check valid python code
    When user write some python code for Terminologiess page as input then click run button
    Then The output will be display in the editor for Terminologiess page
    
   @tag13
  Scenario: A logged in user is in the Terminologies  page
    Given The user is in the queue page Terminologies page
    When The user clicks Types of Trees link
    Then The user should be directed to Types of Trees Page
    
	@tag14  
  Scenario: A logged in user is in the  Types of Trees page
    When The user clicks Try Here button button from Types of Trees page
    Then The user should be redirected to a tryEditor for Types of Trees
  
  @tag15
  Scenario: A logged in user is in the tryEditor page from Types of Trees page to check valid java code
    When user write some valid java code for Types of Trees page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for Types of Trees page
    
  @tag16
  Scenario: A logged in user is in the tryEditor page from Types of Trees page to check invalid code
    When user write some invalid code for Types of Trees then click run button
    Then an alert with SyntaxError: bad input on line 1 will display for Types of Trees
    
  @tag17
  Scenario: A logged in user is in the tryEditor page from Types of Trees page to check valid python code
    When user write some python code for Types of Trees page as input then click run button
    Then The output will be display in the editor for Types of Trees page
    
  @tag18
  Scenario:  A logged in user is in the Types of Trees page
    Given The user is in the Types of Trees page
    When The user clicks Tree Traversals link
    Then The user should be directed to Tree Traversals Page
    
	@tag19  
  Scenario: A logged in user is in the  Tree Traversals page
    When The user clicks Try Here button for Tree Traversals
    Then The user should be redirected to a tryEditor page for Tree Traversals
  
 @tag20
  Scenario: A logged in user is in the tryEditor page from Tree Traversals page to check valid java code
    When user write some valid java code for Tree Traversals page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for Tree Traversals page
    
  @tag21
  Scenario: A logged in user is in the tryEditor page from Tree Traversals page to check invalid code
    When user write some invalid code for Tree Traversals then click run button
    Then an alert with SyntaxError: bad input on line 1 will display for Tree Traversals
    
  @tag22
  Scenario: A logged in user is in the tryEditor page from Tree Traversals page to check valid python code
    When user write some python code for Tree Traversals page as input then click run button
    Then The output will be display in the editor for Tree Traversals page
    
 	@tag23
  Scenario: A logged in user is in the Tree Traversals page
    Given The user is in the Tree Traversals
    When The user clicks Traversals-Illustration link
    Then The user should be directed to Traversals-Illustration
    
	@tag24  
  Scenario: A logged in user is in the Traversals-Illustration page
    When The user clicks Try Here button for Traversals-Illustration
    Then The user should be redirected to a tryEditor page for Traversals-Illustration
  
  @tag25
  Scenario: A logged in user is in the tryEditor page from Traversals-Illustration page to check valid java code
    When user write some valid java code for Traversals-Illustration page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for Traversals-Illustration page
    
  @tag26
  Scenario: A logged in user is in the tryEditor page from Traversals-Illustration page to check invalid code
    When user write some invalid code for Traversals-Illustration then click run button
    Then an alert with SyntaxError: bad input on line 1 will display for Traversals-Illustration
    
  @tag27
  Scenario: A logged in user is in the tryEditor page from Traversals-Illustration page to check valid python code
    When user write some python code for Traversals-Illustration page as input then click run button
    Then The output will be display in the editor for Traversals-Illustration page
    
   @tag28
  Scenario: A logged in user is in the Traversals-Illustration Page
    Given The user is in the Traversals-Illustration Page
    When The user clicks Binary Trees link
    Then The user should be directed to Binary Trees Page
    
	@tag29  
  Scenario: A logged in user is in the Binary Trees page
    When The user clicks Try Here button from Binary Trees page
    Then The user should be redirected to a tryEditor page for Binary Trees
  
  @tag30
  Scenario: A logged in user is in the tryEditor page from Binary Trees page to check valid java code
    When user write some valid java code for Binary Trees page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for Binary Trees page
    
  @tag31
  Scenario: A logged in user is in the tryEditor page from Binary Trees page to check invalid code
    When user write some invalid code for Binary Trees then click run button
    Then an alert with SyntaxError: bad input on line 1 will display for Binary Trees
    
  @tag32
  Scenario: A logged in user is in the tryEditor page from Binary Trees page to check valid python code
    When user write some python code for Binary Trees page as input then click run button
    Then The output will be display in the editor for Binary Trees page
    
   @tag33
  Scenario: A logged in user is in the Binary Trees  page
    Given The user is in the queue page Binary Trees page
    When The user clicks Types of Binary Trees link
    Then The user should be directed to Types of Binary Trees Page
    
	@tag34  
  Scenario: A logged in user is in the  Types of Binary Trees page
    When The user clicks Try Here button button from Types of Binary Trees
    Then The user should be redirected to a tryEditor for Types of Binary Trees
  
 @tag35
  Scenario: A logged in user is in the tryEditor page from Types of Binary Trees page to check valid java code
    When user write some valid java code for Types of Binary Trees page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for Types of Binary Trees page
    
  @tag36
  Scenario: A logged in user is in the tryEditor page from Types of Binary Trees page to check invalid code
    When user write some invalid code for Types of Binary Trees then click run button
    Then an alert with SyntaxError: bad input on line 1 will display for Types of Binary Trees
    
  @tag37
  Scenario: A logged in user is in the tryEditor page from Types of Binary Trees page to check valid python code
    When user write some python code for Types of Binary Trees page as input then click run button
    Then The output will be display in the editor for Types of Binary Trees page
    
  @tag38
  Scenario:  A logged in user is in the Types of Binary Trees page
    Given The user is in the Types of Binary Trees
    When The user clicks Implementation in Python
    Then The user should be directed to Implementation in Python Page
    
	@tag39  
  Scenario: A logged in user is in the  Implementation in Python page
    When The user clicks Try Here button for Implementation in Python
    Then The user should be redirected to a tryEditor page for Implementation in Python
  
 @tag40
  Scenario: A logged in user is in the tryEditor page from Implementation in Python page to check valid java code
    When user write some valid java code for Implementation in Python page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for Implementation in Python page
    
  @tag41
  Scenario: A logged in user is in the tryEditor page from Implementation in Python page to check invalid code
    When user write some invalid code for Implementation in Python then click run button
    Then an alert with SyntaxError: bad input on line 1 will display for Implementation in Python
    
  @tag42
  Scenario: A logged in user is in the tryEditor page from Implementation in Python page to check valid python code
    When user write some python code for Implementation in Python page as input then click run button
    Then The output will be display in the editor for Implementation in Python page
    
  @tag43
  Scenario: A logged in user is in the Implementation in Python page
    Given The user is in the Implementation in Python page
    When The user clicks Binary Tree Traversalslink
    Then The user should be directed to Binary Tree Traversals Page
    
	@tag44  
  Scenario: A logged in user is in the Binary Tree Traversals page
    When The user clicks Try Here button for Binary Tree Traversals
    Then The user should be redirected to a tryEditor page for Binary Tree Traversals
  
  @tag45
  Scenario: A logged in user is in the tryEditor page from Binary Tree Traversals page to check valid java code
    When user write some valid java code for Binary Tree Traversals page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for Binary Tree Traversals page
    
    @tag46
  Scenario: A logged in user is in the tryEditor page from Binary Tree Traversals page to check invalid code
    When user write some invalid code for Binary Tree Traversals then click run button
    Then an alert with SyntaxError: bad input on line 1 will display for Binary Tree Traversals
    
  @tag47
  Scenario: A logged in user is in the tryEditor page from Binary Tree Traversals page to check valid python code
    When user write some python code for Binary Tree Traversals page as input then click run button
    Then The output will be display in the editor for Binary Tree Traversals page
    
  @tag48
  Scenario: A logged in user is in the Binary Tree Traversals Page
    Given The user is in the Binary Tree Traversals Page
    When The user clicks Implementation of Binary Trees link
    Then The user should be directed to Implementation of Binary Trees page Page
    
	@tag49  
  Scenario: A logged in user is in the Implementation of Binary Trees page
    When The user clicks Try Here button from Implementation of Binary Trees page
    Then The user should be redirected to a tryEditor page for Implementation of Binary Trees
  
  @tag50
  Scenario: A logged in user is in the tryEditor page from Implementation of Binary Trees page to check valid java code
    When user write some valid java code for Implementation of Binary Trees page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for Implementation of Binary Trees page
    
  @tag51
  Scenario: A logged in user is in the tryEditor page from Implementation of Binary Trees page to check invalid code
    When user write some invalid code for Implementation of Binary Trees then click run button
    Then an alert with SyntaxError: bad input on line 1 will display for Implementation of Binary Trees
    
  @tag52
  Scenario: A logged in user is in the tryEditor page from Implementation of Binary Trees page to check valid python code
    When user write some python code for Implementation of Binary Trees page as input then click run button
    Then The output will be display in the editor for Implementation of Binary Trees page
    
   @tag53
  Scenario: A logged in user is in the Implementation of Binary Trees  page
    Given The user is in the queue page Implementation of Binary Trees page
    When The user clicks Applications of Binary trees link
    Then The user should be directed to Applications of Binary trees Page
    
	@tag54  
  Scenario: A logged in user is in the  Applications of Binary trees page
    When The user clicks Try Here button button from Applications of Binary trees page
    Then The user should be redirected to a tryEditor for Applications of Binary trees
  
 @tag55
  Scenario: A logged in user is in the tryEditor page from Applications of Binary trees page to check valid java code
    When user write some valid java code for Applications of Binary trees page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for Applications of Binary trees page
    
  @tag56
  Scenario: A logged in user is in the tryEditor page from Applications of Binary trees page to check invalid code
    When user write some invalid code for Applications of Binary trees then click run button
    Then an alert with SyntaxError: bad input on line 1 will display for Applications of Binary trees
    
  @tag57
  Scenario: A logged in user is in the tryEditor page from Applications of Binary trees page to check valid python code
    When user write some python code for Applications of Binary trees page as input then click run button
    Then The output will be display in the editor for Applications of Binary trees page
    
  @tag58
  Scenario:  A logged in user is in the Applications of Binary trees page
    Given The user is in the Applications of Binary trees page
    When The user clicks Binary Search Trees link
    Then The user should be directed to Binary Search Trees Page
    
	@tag59  
  Scenario: A logged in user is in the Binary Search Trees page
    When The user clicks Try Here button for Binary Search Trees
    Then The user should be redirected to a tryEditor page for Binary Search Trees
  
  @tag60
  Scenario: A logged in user is in the tryEditor page from Binary Search Trees page to check valid java code
    When user write some valid java code for Binary Search Trees page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for Binary Search Trees page
    
  @tag61
  Scenario: A logged in user is in the tryEditor page from Binary Search Trees page to check invalid code
    When user write some invalid code for Binary Search Trees then click run button
    Then an alert with SyntaxError: bad input on line 1 will display for Binary Search Trees
    
  @tag62
  Scenario: A logged in user is in the tryEditor page from Binary Search Trees page to check valid python code
    When some python as input then click run button for Binary Search Trees page
    Then The output will be display in the editor for Binary Search Tree page
    
  @tag63
  Scenario:  A logged in user is in the Binary Search Trees page
    Given The user is in the Binary Search Trees page
    When The user clicks Implementation Of BST link
    Then The user should be directed to Implementation Of BST Page
    
	@tag64 
  Scenario: A logged in user is in the Implementation Of BST page
    When The user clicks Try Here button for Implementation Of BST
    Then The user should be redirected to a tryEditor page for Implementation Of BST
  
  @tag65
  Scenario: A logged in user is in the tryEditor page from Implementation Of BST page to check valid java code
    When user write some valid java code for Implementation Of BST page then click run button
    Then an alert with NameError: name System is not defined on line 1 will display for Implementation Of BST page
    
  @tag66
  Scenario: A logged in user is in the tryEditor page from Implementation Of BST page to check invalid code
    When user write some invalid code for Implementation Of BST then click run button
    Then an alert with SyntaxError: bad input on line 1 will display for Implementation Of BST
    
  @tag67
  Scenario: A logged in user is in the tryEditor page from Implementation Of BST page to check valid python code
    When user write some python code for Implementation Of BST page as input then click run button
    Then The output will be display in the editor for Implementation Of BST page
    
  @tag68
  Scenario: A logged in user is in Implementation Of BST page
  	Given A logged in user is in theImplementation Of BST page
    When The user clicks Practice questions link from tree
    Then The user should be directed to practice questions Page for tree
    
    


    