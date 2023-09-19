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
@tag
Feature: Register with valid and invalid credentials
  I want to use this template for my feature file

  @tag1
  Scenario: Registration
   When User is in First page  
   Then click the 'Get started button'
   And click the Register
   And it enters the register page
   When User is in register page
   Then enter the valid username
   And click the Register button
   Then 'please fillout this field'message appears
   
    
  @tag2
  Scenario Outline: Register with Valid credentials
  
When User is in First page  
   Then click the 'Get started button'
   And click the Register
   And it enters the register page
   When User is in register page
   Then enter the valid <username> and <password>
   And Re-enter valid <passsword>
   And click Register button
   Then Registration is successful
    
    Examples: 
      | name  |password| value | status  |
      | name1 | Bismiraj@32   |8 | success |
      | name2 |  BIsmi  |5| Fail    |
