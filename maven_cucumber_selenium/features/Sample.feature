Feature: Orange HRM User details

@AddEmployee
   Scenario: Add User on HRM
   When User Navigates to PIM Employee list
   Then User can see Add Employee page
   Then User enters Full name,Employee ID
   When User clicks on Create login details checkbox
   Then list of options appeared on page
   And User enters Username password and status
   Then user clicks on save button
   Then user gets success message
   
   