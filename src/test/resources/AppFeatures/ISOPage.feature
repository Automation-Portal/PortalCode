Feature: Boarding the Merchant Feature 

Background: 
	Given user is on ISOPage
		|username|password|
		|vigneshradhakrishnan76+piniso@gmail.com|Valor123|
@Tsys	
Scenario Outline:: Boarding a Tsys processor in full board 
	When click to the add button before the Tsys processor 
	When merchant boarding Tsys processor contact details from given sheetname "<SheetName>" and rownumber <RowNumber>
	When user is  add on timezone and  store in Tsys processor
	When user click the Tsys processor
	When user files the device details MIT and TID  details from given the Tsys sheetname "<SheetName>" and rownumber <RowNumber>
	When activating merchant Tsys processor account in email
Examples: 
	
		|SheetName|RowNumber|
		|TSYSSIERRA|0|
		
		
@OMAHA
Scenario Outline:: Boarding a FDOMAHA processor in full board 
	When click to the add button before Omaha processor
	When merchant boarding Omaha processor contact details from given sheetname "<SheetName>" and rownumber <RowNumber>
	When user is  add on timezone and  store in Omaha processor
	When user files the device Omaha processor
	When user files the device details MIT and TID  details from given Omaha sheetname "<SheetName>" and rownumber <RowNumber>
	When activating merchant Omaha processor account in email
Examples: 
	
		|SheetName|RowNumber|
		|FDOMAHA|0|	
		
		
	
@Cardnet
Scenario Outline:: Boarding a FDCARDNET processor in full board 
	When click to the add button before Cardnet processor
	When merchant boarding Cardnet processor contact details from given sheetname "<SheetName>" and rownumber <RowNumber>
	When user is  add on timezone and  store in Cardnet processor
	When user files the device Cardnet processor
	When user files the device details MIT and TID  details from given Cardnet sheetname "<SheetName>" and rownumber <RowNumber>
	When activating merchant Cardnet account in email
Examples: 
	
		|SheetName|RowNumber|
		|FDCARDNET|0|	
		
		
	
@Buypass
Scenario Outline:: Boarding a FDBUYPASS processor in full board 
	When click to the add button BUYPASS processor
	When merchant boarding BUYPASS processor contact details from given sheetname "<SheetName>" and rownumber <RowNumber>
	When user is  add on timezone and  store in Buypass processor
	When user files the device BUYPASS processor
	When user files the device details MIT and TID  details  from given BUYPASS sheetname "<SheetName>" and rownumber <RowNumber>
	When activating merchant BUYPASS account in email 
Examples: 
	
		|SheetName|RowNumber|
		|FDBUYPASS|0|	
		
			
@Nashville
Scenario Outline:: Boarding a FDNASHVILLE processor in full board 
	When click to the add button Nashville processor
	When merchant boarding Nashville processor contact details from given sheetname "<SheetName>" and rownumber <RowNumber>
	When user is  add on timezone and  store in Nashville processor
	When user files the device Nashville processor
	When user files the device details MIT and TID  details from given Nashville sheetname "<SheetName>" and rownumber <RowNumber>
	When activating merchant Nashville account in email
Examples: 
	
		|SheetName|RowNumber|
		|FDNASHVILLE|0|	
				
		
		
							
	
@Postilion
Scenario Outline:: Boarding a POSTILION processor in full board 
	When click to the add button Postilion processor
	When merchant boarding Postilion processor contact details from given sheetname "<SheetName>" and rownumber <RowNumber>
	When user is  add on timezone and  store in Postilion processor
	When user files the device Postilion processor
	When user files the device details MIT and TID  details from given Postilion sheetname "<SheetName>" and rownumber <RowNumber>
	When activating merchant Postilion account in email
Examples: 
	
		|SheetName|RowNumber|
		|POSTILION|0|	
					


@SameLevelUser
Scenario Outline: Boarding samelevel isouser in ISO Page
    When click to the add button 
    When ISo user is boarded a Contact Information in this sheet "<SheetName>" and rownumber <RowNumber>
    And activating samel level iso in email
    
    
    Examples: 
	
		|SheetName|RowNumber|
		|ADDUSER|0|
		
@SUBISOTSYS
Scenario Outline: Subiso in  TSYS SIERRA
	When TSYS SIERRA processor to select the SubIso option
	When user is on boarded a TSYS SIERRA processor Contact Information Iso given sheetname "<SheetName>" and rownumber <RowNumber> 
	When user is on boarded a TSYS SIERRA Processor Info  
	And activating TSYS SIERRA processor subiso in email				
 Examples: 
	
		|SheetName|RowNumber|
		|TSYSSIERRA|0|
		


@SUBISOOMAHA
Scenario Outline: Subiso in FDR OMAHA(F/B)
	When FD OMAHA processor to select the SubIso option
	When user is on boarded a FD OMAHA processor Contact Information Iso given sheetname "<SheetName>" and rownumber <RowNumber> 
	When user is on boarded a FD OMAHA processor Info  
	And activating FD OMAHA processor subiso in email				
 Examples: 
	
		|SheetName|RowNumber|
		|FDOMAHA|0|
		
		
@SUBISOCARDNET
Scenario Outline: Subiso in FDR NORTH / CARDNET
	When FD CARDNET processor to select the SubIso option
	When user is on boarded a FD CARDNET processor Contact Information Iso given sheetname "<SheetName>" and rownumber <RowNumber> 
	When user is on boarded a FD CARDNET processor Info
	And activating FD CARDNET processor subiso in email				
 Examples: 
	
		|SheetName|RowNumber|
		|FDCARDNET|0|
		
@SUBISOBUYPASS
Scenario Outline: Subiso in FDR NORTH / BUYPASS
	When FD BUYPASS processor to select the SubIso option
	When user is on boarded a FD BUYPASS processor Contact Information Iso given sheetname "<SheetName>" and rownumber <RowNumber> 
	When user is on boarded a FD BUYPASS processor Info 
	And activating FD BUYPASS processor subiso in email				
    Examples: 
	
		|SheetName|RowNumber|
		|FDBUYPASS|0|
		
		
@SUBISONASHVILLE
Scenario Outline: Subiso in FDR NORTH / NASHVILLE
	When FD NASHVILLE processor to select the SubIso option
	When user is on boarded a FD NASHVILLE processor Contact Information Iso given sheetname "<SheetName>" and rownumber <RowNumber> 
	When user is on boarded a FD NASHVILLE processor Info 
	And activating FD NASHVILLE processor subiso in email				
 Examples: 
	
		|SheetName|RowNumber|
		|FDNASHVILLE|0|
		
		@SUBISOPOSTILION
Scenario Outline: Subiso in POSTILION
	When POSTILION processor to select the SubIso option
	When user is on boarded a POSTILION processor Contact Information Iso given sheetname "<SheetName>" and rownumber <RowNumber> 
	When user is on boarded a POSTILION Processor Info
	And activating POSTILION processor subiso in email				
 Examples: 
	
		|SheetName|RowNumber|
		|automation|0|
		
		




	
	
 