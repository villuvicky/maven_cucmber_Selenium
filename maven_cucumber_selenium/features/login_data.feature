Feature: Login functionality of Orange HRM data
Scenario: Enter valid name and password from file
Given User is on the login page
When User enters username as "Admin" and password as "admin123"
And Clicks on the Submit button
Then User should lands on Home page of HRM