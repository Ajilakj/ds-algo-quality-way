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


#@tag @login
  #Feature: to test login functionality


  #@tag1
  #Scenario: Check login is successful with valid credentials
    #Given user is on ds-algo page
    #And user clicks on "Get Started" button
    #And home page is displayed with content
    #And clicks on signin button
    #And enters valid username and valid password
    #And click Login button
    #Then user is navigated to home page
#
  #@tag2
  #Scenario Outline: check login  with valid and invalid credentials
    #Given user is in login page
    #When user enters <username> and <password>
    #And clicks on login button
    #Then user is navigated to the home page
#
    #Examples: 
      #| username | password  |
      #| Bismiraj | doorno@32 |
      #| bismi123 | abcdef    |
#
  #@tag3
  #Scenario: Register if no account
    #Given user is in Login page
    #When user has no account already
    #And click the Register button
    #Then user is navigated to Register page
    #

  
  @tag @login
  Feature: to test login functionality

  #
   #@tag1
  #Scenario: Check login is successful with valid credentials
  #
  #Given user is on ds-algo page
  #And user clicks on "Get Started" button
  #And home page is displayed with content
  #And clicks on signin button
  #And enters valid username and valid password
  #And click Login button
  #Then user is navigated to home page
  
    #@tag2
    #Scenario Outline: check login  with valid and invalid credentials
  #Given  clicks on signin button
  #Given user is in login page
  #When user enters <username> and <password>
  #And clicks on login button
  #Then user is navigated to the home page
  
  #Examples:
  #|username|password|
  #|Bismiraj|doorno@32|
  #|bismi123|abcdef|
  #
  #@tag3
  #
  #Scenario: Register if no account
  #
  #Given user is in Login page
  #When user has no account already
  #And click the Register button
  #Then user is navigated to Register page
  #
 @tag9
  Scenario: Check login is successful with valid credentials
  
  Given clicks on signin button
  And enters valid username and valid password
  And click Login button
  Then user is navigated to home page
  
  #@tag5
  #
  #Scenario: User enters valid credentials but not registerd already
  #
  #Given user is in Login page
    #When user has no account already
    #But enters valid username and password
    #And clicks Login
    #Then Invalid Username and Password text is displayed
    #
    #@tag6
    #
    #Scenario: check logging with  valid username and leaving password field empty
    #
    #Given User is in Login page
    #When  user enters valid username and leaves password field empty
    #And clicks Login
    #Then please fillout this field text is displayed
    
  
  

 
 
