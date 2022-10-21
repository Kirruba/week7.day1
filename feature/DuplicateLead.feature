Feature: Duplicate Lead of LeafTaps Application 

@lead 
Scenario Outline: Duplicate Lead 

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
	And Enter FirstNameLocal as <localFirstName> 
	And Enter Department as <department> 
	And Enter Description as <description> 
	And Enter email as <email> 
	And Select StateProvince as <state> 
	And Click on Create Lead button 
	Then Click on Duplicate button 
	And Clear the CompanyName Field And Enter new CompanyName as <newCompanyName> 
	And Clear the FirstName Field And Enter new FirstName as <newFirstName> 
	And Click on Create Lead button 
	And Close driver 
	Examples: 
		|username|password|companyName|firstName|lastName|localFirstName|department|description|email|state|newCompanyName|newFirstName|
		|'DemoSalesManager'|'crmsfa'|'TestLeaf'|'Kirruba'|'S P'|'kiruba'|'Automation Testing'|'Selenium'|'abctesting@gmail.com'|'New York'|'Zoho'|'Kirruba Lakshmi'|
    