Feature: Deal Data Creation 
Scenario: Free CRM create a new contact Scenario

	Given User is already on Login Page 
	#When title of login page is  CRM PRO 
	#Then enter username and  password 
		| nagarjun558 | test@123 |
	Then user clicks on login button 
	Then user is on home page 
	Then user move to new deal page 
	Then user enters deal details 
		| test deal | 1000 | 50 | 10 |
	Then close browser