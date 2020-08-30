Feature: Login functionality of Orange HRM with header
Scenario: Enter valid name and password from file with header
Given User will be on the login page
When User enters username  and password from with header
|UserName|Password|
|Admin|admin123|
And Clicks on the Submittng button on the page
Then User will be on Home page of HRM