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
  
  
  
  @tag
  Feature: to test functionality of home page
  
  
  @tag1 @home
  Scenario: open home page
	  Given The user try to  open DS Algo portal link
	  Then DS Algo portal page should open
    
  #@tag2 @home
  #Scenario: get started button to go to home page
    #Given The user already on DS Algo portal page
    #When The user clicks the Get Started button
    #Then DS Algo home page should open
    #
#	@tag3  @home
  #Scenario:The user already on DS Algo portal page drop down with Data structures 
    #When The user clicks Data Structures drop down
    #Then A drop down with 6 different data structure entries should be visible
    #
   #@tag4 
  #Scenario: select one item from drop down without sign in
    #Given The user already on DS Algo portal page and The user clicks Data Structures drop down
    #When The user select any of the 6 items from the drop down
    #Then It should alert the user with a message "You are not logged in"
    #
    #@tag5  @home
  #Scenario: select one item from home page without sign in
    #Given The user already on DS Algo portal page and The user did not sign in
    #When The user clicks any of the "Get Started" buttons below the data structures 
    #Then It should alert the user with a message You are not logged in
    #
    #
     #@tag6
  #Scenario: user try to go to sign in page
    #Given The user already on DS Algo portal page
    #When The user clicks "Sign in" link
    #Then Sign in page should open
    #
     #@tag7
  #Scenario: user try to go to sign in page
    #Given The user opens DS Algo portal link
    #When The user clicks "Register" link
    #Then Register page should open
    #

 
