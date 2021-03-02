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

Feature: Management

@SmokeTest
Scenario: Add ability
Given I wish for an ability named "managing"
When I obtain that ability
Then I am now able to "managing" 

@RegularTest
Scenario: Add another ability
Given I wish for an ability named "testing"
When I obtain that ability
Then I am now able to "testing"

@RegularTest @NewTest
Scenario: Add yet another ability
Given I wish for an ability named "debugging"
When I obtain that ability
Then I am now able to "debugging" 