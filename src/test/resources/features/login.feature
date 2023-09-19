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
  Feature: to test login functionality

  
   @tag1
  Scenario: Check login is successful with valid credentials
  Given user is on home page
  And user clicks on "Get Started" button
  And Next page is displayed with content
  
  Given user is on login page
  When user enters username and password
  And clicks on login button
  Then user is navigated to the home page
  
    @tag2
    Scenario Outline: check login  with valid and invalid credentials
    
  Given user is on login page
  When user enters <username> and <password>
  And clicks on login button
  Then user is navigated to the home page
  
  Examples:
  |username|password|
  |Bismiraj|doorno@32|
#  
  
  

 
  
