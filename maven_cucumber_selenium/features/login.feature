@login
Feature: Login functionality of Orange HRM

Scenario: Enter valid name and password
Given User is on login page
When User enters valid username and password
And Clicks on Submit button
Then User should lands on Home page