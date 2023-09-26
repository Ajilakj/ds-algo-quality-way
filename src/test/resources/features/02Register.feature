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


  @tag @register
  Feature: to test register with valid and invalid credentials
  
  @tag1
    Scenario: try register with username and password and confirm password fields empty
    Given User is in register page to check every fields empty
    When  user leaves username, password and confirm password fields empty
    And clicks register button to check every fields empty
    Then please fill out this field text is displayed for only username-register
    
  @tag2
    Scenario: check logging with valid username and leaving password field empty
    Given User is in register page to check password empty
    When  user enters valid username and leaves password field empty in register page
    And clicks register button to check pssword empty
    Then please fill out this field text is displayed for password-register

@tag3
    Scenario: check logging with valid password  and leaving username field empty
    Given User is in register page to check username empty
    When  user enters valid password and leaves username field empty in register page
    And clicks register button to check username empty
    Then please fill out this field text is displayed for username-register
    
 @tag4
    Scenario: check logging with valid password  and username but leaving confirm password field empty
    Given User is in register page to check confirm password empty
    When  user enters valid password and username but leaves confirm password field empty
    And clicks register button to check confirm password empty
    Then please fill out this field text is displayed for confirm password
    
 #@tag5
  #Scenario: Check register with similar usename and password
  #Given User is in register page to check similarity between usename and password
  #When enters a username and password same as usename then confirm password
  #And clicks register button to check similarity similarity between usename and password
  #Then Your password can’t be too similar to your other personal information message should display
  #
  #@tag6
  #Scenario: Check register with password minimum length
  #Given User is in register page to check password length
  #When enters a valid username and password contains less than 8 characters
  #And clicks register button to check password length
  #Then Your password must contain at least 8 characters message should display
  #
  #@tag7
  #Scenario: Check register with password characters
  #Given User is in register page to check password characters
  #When enters a valid username and password only with numbers
  #And clicks register button to check password characters
  #Then Your password can’t be entirely numeric message should display
  #
  #@tag8
  #Scenario: Check login link from register page
  #Given User is in register page
  #When  use click login link from register page
  #Then user is navigated to login page
  #
  #@tag9 
  #Scenario: password mismatch
  #Given user is in the Register page to check password mismatch
  #When user enters valid username 
  #And enters valid password in password textbox
  #And enters invalid or different password in password confirmation box
  #And clicks the register button
  #Then password_mismatch:The two password fields didn’t match message should appears below.
      #
 #@tag10
  #Scenario: Check register is successful with valid credentials
  #Given User is in register page to check successful register with valid credentials
  #When enters valid username, valid password and confirm password
  #And clicks register button
  #Then user will navigate to home page
  #
 
    

