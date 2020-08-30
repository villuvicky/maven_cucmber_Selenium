@login
Feature: Login functionality of Orange HRM scenarios
@Positive
Scenario: Entering valid name and password
Given EndUser is on login page
When User going to enter valid username as "Admin" and password as "admin123"
And Clicking  on the Submit button
Then User redirected to Home page

@Negative
Scenario: Entering valid name and password
Given EndUser is on login page
When User going to enter valid username as "Admins" and password as "admin13"
And Clicking  on the Submit button
Then User redirected to Home page