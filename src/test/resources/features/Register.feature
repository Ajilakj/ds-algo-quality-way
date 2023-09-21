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


@tagxyz @register
Feature: Register with valid and invalid credentials

  #@tag1
  #Scenario: Registration
   #When User is in First page  
   #Then click the 'Get started button'
   #And click the Register
   #And it enters the register page
   #When User is in register page
   #Then enter the valid username
   #And click the Register button
   #Then 'please fillout this field'message appears
   #
    
  #@tag2
  #Scenario Outline: Register with Valid username and password and Valid username but invalid password credentials
  #
#When User is in First page  
   #Then click the 'Get started button'
   #And click the Register
   #And it enters the register page
   #When User is in register page
   #Then enter the valid <username> and <password>
   #And Re-enter valid <passsword>
   #And click Register button
   #Then Registration is successful
    #
    #Examples: 
      #| Username  |password| value | status  |
      #| Bismiraj | doorno@32  |8 | success |
      #| Bismiraj |  BIsmi  |5| Fail    |
      #
      #
      #@tag3e
      #
      #Scenario: password mismatch
      #
      #When user is in the Register page
      #And enters valid username 
      #And enters valid password in password textbox
      #And enters invalid or different password in password confirmation box
      #And clicks the register button
      #Then "The two password fields didn't match" appears below.
      #
      
      
  @tag4
  Scenario: create user with valid credentials
  
  Given clicks on register button
  When enters valid username and valid password and confirm password
  And click register button
  Then user is navigated to home page
