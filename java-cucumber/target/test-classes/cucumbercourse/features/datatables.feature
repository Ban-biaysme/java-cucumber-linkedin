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

Feature: Data Tables

@ListOfStrings
Scenario: Bill Amount Generation
Given I placed an order for the following items
|Cucumber Sandwich|2|20|
When I generated the bill
Then a bill for $40 should be generated



@ListOfListOfStrings
Scenario: Bill Amount Generation
Given I placed an order for the following items
|Cucumber Sandwich|2|20|
|Cucumber Salad|1|30|
When I generated the bill
Then a bill for $40 should be generated

@ListOfMaps
Scenario: Bill Amount Generation
Given I placed an order for the following items
|ItemName			|Units|UnitPrice|
|Cucumber Sandwich|2	|20	|
|Cucumber Salad|1	|30	|
When I generated the bill
Then a bill for $40 should be generated
