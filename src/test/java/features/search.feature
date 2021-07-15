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
#@tag
Feature: Search and place order for vegetables

@SmokeTest1
  Scenario: Search for items and validate results
    Given User is on Green cart Landing page
    When User searched for Cucumber vegetable
    Then "Cucumber" results are displayed

@RegressionTest1
  Scenario Outline: Search for items and then move to checkout page
    Given User is on Green cart Landing page
    When User searched for <Name> vegetable
    And Added items to cart
    And User proceeded to Checkout page for purchase
    Then verify selected <Name> items are displayed in Check out page
    
    Examples:
    |Name|
    |Brinjal|
    |Beetroot|