Feature: Deal Data Creation 
Scenario: Free CRM create a new contact Scenario

	Given User is already on Login Page 
    When title of login page is  CRM PRO 
	Then enter username and  password 
		| username | password|
		| nagarjun558 | test@123 |
		
	Then user clicks on login button 
	Then user is on home page 
	Then user move to new deal page 
	Then user enters deal details 
		| title | amount | probility | commission |
		| test deal1 | 1000 | 50 | 10 |
		| test deal2 | 2000 | 60 | 20 |
		| test deal3 | 3000 | 70 | 30 |
		
		
	Then close browser