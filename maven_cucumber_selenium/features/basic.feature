@simple
Feature: open google.com feature
Scenario: open google website and search
 Given user is entering google.com
 When user clicks the search box 
 And types the search term as "vicky"
 Then the user should see the search results for vicky