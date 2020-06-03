Feature: Login into Application

Scenario Outline: Positive Test Validating Login
Given Initialize the browser with chrome
And Navigate to "http://qaclickacademy.com" site
And Click on Login link in home page to land on secure sign in page
When User enters <username> and <password> and loges in
Then Verify that user is successfully logged in
And close browsers

Examples:
|username				|password	|
|kashif.cse@outlook.com	|123456		|
|test@gmail.com			|12345		|