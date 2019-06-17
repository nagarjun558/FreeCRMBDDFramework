Feature: Free CRM Login Feature

#without Examples keyword
#Scenario: Free CRM Login Test Scenario

#Given User is already on Login Page
#When title of login page is  CRM PRO
#Then enter "nagarjun558" and  "test@123"
#Then user clicks on login button
#Then user is on home page
#Then close browser


#with Examples keyword
Scenario Outline: Free CRM Login Test Scenario

Given User is already on Login Page
When title of login page is  CRM PRO
Then enter "<username>" and  "<password>"
Then user clicks on login button
Then user is on home page
Then close browser

Examples:
        | username | password |
        | nagarjun558 | test@123 |
        | tom | test@456 |