Feature: Edit Lead of LeafTaps Application 

@lead 
Scenario: Edit Lead 

	Given Launch the Chrome Browser 
	And Load URL and maximize 
	When Enter Username as <username> 
	And Enter Password as <password> 
	And Click on login 
	And Click on CRMSFA link 
	And Click on Leads 
	And Click Find leads 
	And Enter first name as <firstName> 
	And Click Find leads button 
	And Click on first resulting lead 
	Then Verify title of the page 
	And Click Edit 
	And Change the company name as <companyName> 
	And Click Update 
	Then Confirm the changed name appears as given as <companyName> 
	And  Close driver 
	
	Examples: 
	|username|password|firstName|companyName|
	|'DemoSalesManager'|'crmsfa'|'Yuvanica'|'Virtusa'|
	
