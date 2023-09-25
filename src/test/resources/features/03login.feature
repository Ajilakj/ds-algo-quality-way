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
  
  @tag1
    Scenario: try logging with username and password fields empty
    Given User is in Login page to check both fields empty
    When  user leaves username password fields empty
    And clicks Login button to check both fields empty
    Then please fill out this field text is displayed for only username
    
  @tag2
    Scenario: check logging with valid username and leaving password field empty
    Given User is in Login page to check pssword empty
    When  user enters valid username and leaves password field empty
    And clicks Login button to check pssword empty
    Then please fill out this field text is displayed for password

@tag3
    Scenario: check logging with valid password  and leaving username field empty
    Given User is in Login page to check username empty
    When  user enters valid password and leaves username field empty
    And clicks Login button to check username empty
    Then please fill out this field text is displayed for username
    
 @tag4
  Scenario: Check login with non registered user
  Given User is in Login page to check nonregister user
  When enters a username and a password
  And clicks Login button to check nonregister user
  Then Invalid Username and Password message should display for non registered user
  
  @tag5
  Scenario: Check login with registered user with password incorrect
  Given User is in Login page to check password incorrect
  When enters a valid username and incorrect password
  And clicks Login button to check password incorrect
  Then Invalid Username and Password message should display for non registered password
  
  @tag6
  Scenario: Check login with non registered user with username incorrect
  Given User is in Login page to check username incorrect
  When enters an incorrect username and a valid password
  And clicks Login button to check username incorrect
  Then Invalid Username and Password message should display for non registered username
  
  
 @tag7
  Scenario: Check login is successful with valid credentials
  Given User is in Login page to check successful login with valid credentials
  And enters valid username and valid password
  And clicks Login button
  Then user is navigated to home page
  
 
    
  
  

 
 
