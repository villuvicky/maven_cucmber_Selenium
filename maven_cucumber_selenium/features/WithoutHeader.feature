Feature: Login functionality of Orange HRM without header
Scenario: Enter valid name and password from file without header
Given User lands on the login page
When User enters username  and password from without header
|Admin|admin123|
And Clicks on the Submit button on the page
Then User will land on Home page of HRM