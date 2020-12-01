Feature: Usage of Multiple keywords
Scenario: open google website
 Given User is having chrome:
When User logged on to myAccess with Valid Username and Password
|Username|
|SD66001|
And verify line items for following Entitlements:
|UserRoleSetup002|
|UserRoleSetup003|
|Audit Inspection|
|All Document Owners|
And user
|Owner= QD66001|
|Application=QualityDocs Vault|
|Type= userRoleSetup|
|Display Value= USR1|
|Requestable= chekced|
|Secondary Owner=QD66002|
|Classification= Public|
