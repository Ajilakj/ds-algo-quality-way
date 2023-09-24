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
  Scenario: An existing user logged in with valid credentials in homepage
	  Given An existing user is in the Home page for tree
	  When The user clicks the Getting Started button in tree Pane
	  Then The user will directed to tree Page
	  
	@tag2
  Scenario:  An existing user logged in with valid credentials in homepage
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
  Scenario: A logged in user is in the tryEditor page for Overview of Trees page
    When some python as input then click run button for Overview of Trees
    Then The output will be display in the editor for Overview of Trees
    
    @tag6
  Scenario: A logged in user is in the Overview of Trees Page
    Given The user is in the Overview of Trees Page
    When The user clicks Terminologies link
    Then The user should be directed to Terminologiess Page
    
	@tag7  
  Scenario: A logged in user is in the Terminologies page
    When The user clicks Try Here button from Terminologies page
    Then The user should be redirected to a tryEditor page for Terminologies
  
  @tag8
  Scenario: A logged in user is in the tryEditor page from Terminologies  page
    When some python as input then click run button for Terminologies
    Then The output will be display in the editor for Terminologies
    
   @tag9
  Scenario: A logged in user is in the Terminologies  page
    Given The user is in the queue page Terminologies page
    When The user clicks Types of Trees link
    Then The user should be directed to Types of Trees Page
    
	@tag10  
  Scenario: A logged in user is in the  Types of Trees page
    When The user clicks Try Here button button from Types of Trees page
    Then The user should be redirected to a tryEditor for Types of Trees
  
  @tag11
  Scenario: A logged in user is in the tryEditor page from Types of Trees page
    When some python as input then click run button for Types of Trees
    Then The output will be display in the editor for Types of Trees
    
  @tag12
  Scenario:  A logged in user is in the Types of Trees page
    Given The user is in the Types of Trees page
    When The user clicks Tree Traversals link
    Then The user should be directed to Tree Traversals Page
    
	@tag13  
  Scenario: A logged in user is in the  Tree Traversals page
    When The user clicks Try Here button for Tree Traversals
    Then The user should be redirected to a tryEditor page for Tree Traversals
  
  @tag14
  Scenario: A logged in user is in the tryEditor page from Tree Traversals page
    When some python as input then click run button for Tree Traversals
    Then The output will be display in the editor  for Tree Traversals
    
 	@tag15
  Scenario: A logged in user is in the Tree Traversals page
    Given The user is in the Tree Traversals
    When The user clicks Traversals-Illustration link
    Then The user should be directed to Traversals-Illustration
    
	@tag16  
  Scenario: A logged in user is in the Traversals-Illustration page
    When The user clicks Try Here button for Traversals-Illustration
    Then The user should be redirected to a tryEditor page for Traversals-Illustration
  
  @tag17
  Scenario: A logged in user is in the tryEditor page forTraversals-Illustration page
    When some python as input then click run button for Traversals-Illustration
    Then The output will be display in the editor for Traversals-Illustration
    
   @tag18
  Scenario: A logged in user is in the Traversals-Illustration Page
    Given The user is in the Traversals-Illustration Page
    When The user clicks Binary Trees link
    Then The user should be directed to Binary Trees Page
    
	@tag19  
  Scenario: A logged in user is in the Binary Trees page
    When The user clicks Try Here button from Binary Trees page
    Then The user should be redirected to a tryEditor page for Binary Trees
  
  @tag20
  Scenario: A logged in user is in the tryEditor page from Binary Trees  page
    When some python as input then click run button for Binary Trees
    Then The output will be display in the editor for Binary Trees
    
   @tag21
  Scenario: A logged in user is in the Binary Trees  page
    Given The user is in the queue page Binary Trees page
    When The user clicks Types of Binary Trees link
    Then The user should be directed to Types of Binary Trees Page
    
	@tag22  
  Scenario: A logged in user is in the  Types of Binary Trees page
    When The user clicks Try Here button button from Types of Binary Trees
    Then The user should be redirected to a tryEditor for Types of Binary Trees
  
  #@tag23
  #Scenario: A logged in user is in the tryEditor page from Types of Binary Trees page
    #When some python as input then click run button for Types of Binary Trees
    #Then The output will be display in the editor for Types of Binary Trees
    #
  #@tag25
  #Scenario:  A logged in user is in the Types of Binary Trees page
    #Given The user is in the Types of Binary Trees
    #When The user clicks Implementation in Python
    #Then The user should be directed to Tree TraversalsImplementation in Python Page
    #
#	@tag26  
  #Scenario: A logged in user is in the  Implementation in Python page
    #When The user clicks Try Here button for Implementation in Python
    #Then The user should be redirected to a tryEditor page for Implementation in Python
  #
  #@tag27
  #Scenario: A logged in user is in the tryEditor page from Implementation in Python page
    #When some python as input then click run button for Implementation in Python
    #Then The output will be display in the editor  for Implementation in Python
    #
  #@tag28
  #Scenario: A logged in user is in the Implementation in Python page
    #Given The user is in the Implementation in Python page
    #When The user clicks Binary Tree Traversalslink
    #Then The user should be directed to Binary Tree Traversals Page
    #
#	@tag29  
  #Scenario: A logged in user is in the Binary Tree Traversals page
    #When The user clicks Try Here button for Binary Tree Traversals
    #Then The user should be redirected to a tryEditor page for Binary Tree Traversals
  #
  #@tag30
  #Scenario: A logged in user is in the tryEditor page for Binary Tree Traversals page
    #When some python as input then click run button for Binary Tree Traversals
    #Then The output will be display in the editor for Binary Tree Traversals
    #
  #@tag31
  #Scenario: A logged in user is in the Binary Tree Traversals Page
    #Given The user is in the Binary Tree Traversals Page
    #When The user clicks Terminologies link
    #Then The user should be directed to Terminologiess Page
    #
#	@tag32  
  #Scenario: A logged in user is in the Terminologies page
    #When The user clicks Try Here button from Implementation of Binary Trees page
    #Then The user should be redirected to a tryEditor page for Implementation of Binary Trees
  #
  #@tag33
  #Scenario: A logged in user is in the tryEditor page from Implementation of Binary Trees  page
    #When some python as input then click run button for Implementation of Binary Trees
    #Then The output will be display in the editor for Implementation of Binary Trees
    #
   #@tag34
  #Scenario: A logged in user is in the Implementation of Binary Trees  page
    #Given The user is in the queue page Implementation of Binary Trees page
    #When The user clicks Types of Trees link
    #Then The user should be directed to Types of Trees Page
    #
#	@tag35  
  #Scenario: A logged in user is in the  Types of Trees page
    #When The user clicks Try Here button button from Types of Trees page
    #Then The user should be redirected to a tryEditor for Types of Trees
  #
  #@tag36
  #Scenario: A logged in user is in the tryEditor page from Types of Trees page
    #When some python as input then click run button for Types of Trees
    #Then The output will be display in the editor for Types of Trees
    #
  #@tag37
  #Scenario:  A logged in user is in the Types of Trees page
    #Given The user is in the Types of Trees page
    #When The user clicks Applications of Binary trees link
    #Then The user should be directed to Applications of Binary trees Page
    #
#	@tag38  
  #Scenario: A logged in user is in the Applications of Binary trees page
    #When The user clicks Try Here button for Applications of Binary trees
    #Then The user should be redirected to a tryEditor page for Applications of Binary trees
  #
  #@tag39
  #Scenario: A logged in user is in the tryEditor page from Applications of Binary trees page
    #When some python as input then click run button for Applications of Binary trees
    #Then The output will be display in the editor  for Applications of Binary trees
    #
  #@tag40
  #Scenario:  A logged in user is in the Applications of Binary trees page
    #Given The user is in the Applications of Binary trees page
    #When The user clicks Binary Search Trees link
    #Then The user should be directed to Tree TraversalsBinary Search Trees Page
    #
#	@tag41  
  #Scenario: A logged in user is in the Binary Search Trees page
    #When The user clicks Try Here button for Binary Search Trees
    #Then The user should be redirected to a tryEditor page for Binary Search Trees
  #
  #@tag42
  #Scenario: A logged in user is in the tryEditor page from Binary Search Trees page
    #When some python as input then click run button for Binary Search Trees
    #Then The output will be display in the editor  for Binary Search Trees
    #
  #@tag43
  #Scenario:  A logged in user is in the Binary Search Trees page
    #Given The user is in the Binary Search Trees page
    #When The user clicks Implementation Of BST link
    #Then The user should be directed to Implementation Of BST Page
    #
#	@tag44  
  #Scenario: A logged in user is in the Implementation Of BST page
    #When The user clicks Try Here button for Implementation Of BST
    #Then The user should be redirected to a tryEditor page for Implementation Of BST
  #
  #@tag45
  #Scenario: A logged in user is in the tryEditor page from Implementation Of BST page
    #When some python as input then click run button for Implementation Of BST
    #Then The output will be display in the editor  for Implementation Of BST
    #
  #@tag46
  #Scenario: A logged in user is in Implementation Of BST page
  #	Given A logged in user is in theImplementation Of BST page
    #When The user clicks Practice questions link from tree
    #Then The user should be directed to practice questions Page for tree
    #
    


    