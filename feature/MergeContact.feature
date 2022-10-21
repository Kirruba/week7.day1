Feature: MergeContact of LeafTaps Application 

@lead 
Scenario: MergeContact 

	Given Launch the Chrome Browser 
	And Load URL and maximize 
	When Enter Username as <username> 
	And Enter Password as <password> 
	And Click on login 
	And Click on CRMSFA link 
	Then Click on contacts Button 
	And Click on Merge Contacts 
	And Click on Widget of From Contact 
	And Click on First Resulting Contact 
	And Click on Widget of To Contact 
	And Click on Second Resulting Contact 
	And Click on Merge button 
	And Accept the Alert 
	Then Verify the title of the page 
	And Close driver 
	
	Examples: 
	|username|password|
	|'DemoSalesManager'|'crmsfa'|