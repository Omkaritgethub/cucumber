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
@omkar
Feature: Product

  
  Scenario: Booked product details
    Given User Launch Chrome browser
    When User opens URL
    And User click on Login and register button
    And  User click on continue button
    When User enter customer personal info
    And User click on continue button
    Then User verify confirmation message"YOUR ACCOUNT HAS BEEN CREATED!"
    Then User Verify name and surname on landing page
    Then User click on home icon
    And User open product  
    Then User click on add a cart button
    Then User click on checkout button
    And User validate all the product details
    
    
    
  