Feature: Login functionality of Orange HRM with multipeUsers
Scenario Outline: Enter multiple names and passwords
Given User willl be landing on the login page
When User enters "<username>"  and "<password>" from examples
And Hits on the Submittng button on the page
Then User will be on Home of HRM 
Examples:
|username|password|
|Admin|admin123|
|admin|admin|