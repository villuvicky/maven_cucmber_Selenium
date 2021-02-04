Feature: Usage of Multiple keywords
Scenario: open google website
 Given User is having chrome:
When User logged on to myAccess with Valid Username and Password
|Username|:
|SD66001|
|SD66002|
And verify line items for following Entitlements:
|UserRoleSetup002|
|UserRoleSetup003|
|Audit Inspection|
|All Document Owners|
And user
|Audit Inspection|
