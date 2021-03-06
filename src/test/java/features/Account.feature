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
#Feature: Title of your feature
  #I want to use this template for my feature file

  #@tag1
  #Scenario: Title of your scenario
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes

  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step

    #Examples: 
     # | name  | value | status  |
      #| name1 |     5 | success |
     # | name2 |     7 | Fail    |

      

Feature: Accounts checking
		
		#pre-condition is nothing but 'Background' key and this should be defined always at the top else it wont work
		Background:
		Given validate the browser
		When Browser is triggered
		Then check if browser is displayed
			
		#Parameterization
		@SanityTest
		Scenario Outline: Account page to be displayed
		Given User is on landing page
		When User login application with <username> and <password>
		Then Home page is populated
		And Cards displayed are "true" 
		
		Examples:
		|username|password|
		|user1|password1|
		|user2|password2|
		|user3|password3|
		|user4|password4|
		 