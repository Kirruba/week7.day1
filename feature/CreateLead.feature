Feature: Create Lead of LeafTaps Application 

@lead 
Scenario Outline: Create Lead with mandatory fields 

	Given Launch the Chrome Browser 
	And Load URL and maximize 
	When Enter Username as <username> 
	And Enter Password as <password> 
	And Click on login 
	And Click on CRMSFA link 
	And Click on Leads 
	And Click on Create Lead link 
	And Enter Company Name as <companyName> 
	And Enter First Name as <firstName> 
	And Enter Last Name as <lastName> 
	And Click on Create Lead button 
	Then Verify the lead creation 
	And Close driver 
	Examples: 
		|username|password|companyName|firstName|lastName|
		|'DemoSalesManager'|'crmsfa'|'TCS'|'Kirruba'|'Lakshmi'|
		|'DemoSalesManager'|'crmsfa'|'Wipro'|'Yuvanica'|'B'|
