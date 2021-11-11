
Feature: automationPractice Page
Scenario: Login on automationpractice

Given I am on login Page
When I get the title of the page
Then I validate the title as 'Login - My Store'

Scenario: Forget Password Link 
Given I am on login Page
Then Forgot Password link should be displyed

Scenario Outline: Login with credentials
Given I am on login Page
When I enters Username '<username>'
And I enters password as '<password'>
And I clicks on Login button

Examples:
|username|password|
|sonal04@gmail.com|abc@123|
|admin@gmail.com|admin@123|
|emp@gmail.com|emp@123|



