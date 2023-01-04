Feature: Boarding the Merchant Management Feature 

Background: 
	Given user is on MerchantManagementPage 
		|username|password|
		|vigneshradhakrishnan76+piniso@gmail.com|Valor123|
		
Scenario: Boarding Merchant Managemen with different set of data 
	When click to the button 
	When user clicks Full Board 
	When merchant boarding contact details from given sheetname 
	When user files the store details from given sheetname 
	When user files the device types and processor
	When user files the device MIT and TID  details from given sheetname 
	And User is click to  next button
	When user is activation merchant 
@quickbrd	 
Scenario: Quick Boarding 
	When Boarding the merchant quick board 
	
 @Createdioss      
Scenario: Creadential testing 

    When Create ISO User
    When Create SubIso
    When create the subiso user with data
    
    And Delete Sub Iso and Delete Sub Iso User
    
 @Resendisouser 
 Scenario: Resend Activations IsoU  
 When Resend Activation for ISO USER
 
 @ResendSubiso   
 Scenario: Resend Activations SubI   
    When  Resent Activation for SubIso
    
 @ResendSubisouser 
 Scenario: Resend Activations SubIU   
    And Resent Activation email for Sub Iso user