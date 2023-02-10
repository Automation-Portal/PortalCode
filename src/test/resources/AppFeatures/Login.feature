Feature: Portal Login Admin

Background: 
	Given user is on loginpage 
	
	
@AdminLogin 
Scenario: Login - Valid 

	When user enters username "Automation_admin" 
	And user enters password "Valor@123" 
	When user clicks on continue button 
	
@AdminLogin
Scenario: Login - Invalid credentials 
	When user enters username "Automation_admin11" 
	And user enters password "Valor12311" 
	When alert smsg for invalid credentials 
@AdminLogin
Scenario: Login - Invalid credentials 
	When user enters username "Automation_admin11" 
	And user enters password "Valor@123" 
	When alert smsg for invalid credentials
	Then popup should be "Invalid username or password" 
@AdminLogin 
Scenario: Login - Invalid credentials 
	When user enters username "Automation_admin" 
	And user enters password "Valor12311" 
	When alert smsg for invalid credentials  
	Then popup should be "Invalid username or password" 
@AdminLogin
Scenario: Forgot password link navigate to reset password  for valid user 
	When user enters valid username "StarBucks123" 
	And user click submit button 
@AdminLogin
Scenario: Forgot password link navigate to reset password  for Invalid user 
	When user enters the invalid username "StarBucks1234" 
	And user click the submit button 	
	
