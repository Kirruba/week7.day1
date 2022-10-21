Feature: Delete Lead of LeafTaps Application 

@lead 
Scenario: Delete Lead 

	Given Launch the Chrome Browser 
	And Load URL and maximize 
	When Enter Username as <username> 
	And Enter Password as <password> 
	And Click on login 
	And Click on CRMSFA link 
	And Click on Leads 
	And Click Find leads 
	And Click on Phone 
	When Enter phone number as <phoneNumber> 
	And Click Find leads button 
	And Capture lead ID of First Resulting lead 
	And Click on first resulting lead 
	And Click Delete 
	And Click Find leads 
	When Enter captured lead ID 
	And Click Find leads button 
	Then Verify message as <verifyMessage> in the Lead List 
	And Close driver 
	
	Examples: 
	
	|username|password|phoneNumber|verifyMessage|
	|'DemoSalesManager'|'crmsfa'|'98'|'No records to display'|