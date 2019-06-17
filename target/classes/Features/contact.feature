Feature: Free CRM create contacts

#with Examples keyword
Scenario Outline: Free CRM create a new contact Scenario

Given User is already on Login Page
When title of login page is  CRM PRO
Then enter "<username>" and  "<password>"
Then user clicks on login button
Then user is on home page
Then user move to new contact page
Then user enters "<firstname>" and "<lastname>" and "<position>"
Then close browser

Examples:
        | username | password | firstname | lastname | position |
        | nagarjun558 | test@123 | arjun | m | Manager |
        | nagarjun558 | test@123 | tom | peter | Lead |