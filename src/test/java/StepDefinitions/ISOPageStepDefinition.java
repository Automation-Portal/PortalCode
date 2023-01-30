package StepDefinitions;

import com.qa.pages.ISOPage;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.qa.pages.*;
import com.qa.factory.DriverFactory;
import com.qa.util.ExcelReader;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ISOPageStepDefinition {
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private ISOPage isopage;
	private HomePage homePage;

	@Given("user is on ISOPage")
	public void user_is_on_iso_page(DataTable credTable) throws InterruptedException {

		List<Map<String, String>> credList = credTable.asMaps();
		String userName = credList.get(0).get("username");
		String password = credList.get(0).get("password");
		DriverFactory.getDriver().get("https://uat.valorpaytech.com/signin");
		homePage = loginPage.doLogin(userName, password);
		isopage = homePage.ADiso();

	}
	
	
	
	
	
	//TSYS:
	
	@When("click to the add button before the Tsys processor")
	public void click_to_the_add_button_before_the_tsys_processor() throws InterruptedException {
	    
		isopage.add();
		isopage.fullbr();
		
		
		
	}

	@When("merchant boarding Tsys processor contact details from given sheetname {string} and rownumber {int}")
	public void merchant_boarding_tsys_processor_contact_details_from_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, InterruptedException {
		
		ExcelReader reader = new ExcelReader();
		 List<Map<String,String>> testData=
				 reader.getData("C:\\Users\\vigneshwaran\\Documents\\Automation testing\\Excel\\ISO SHEET\\MerchantBoarding.xlsx", SheetName);
		 String dba = testData.get(rowNumber).get("DBA");
		 String legalname = testData.get(rowNumber).get("LegalName");
		 String firstname = testData.get(rowNumber).get("FirstName");
		 String lastname = testData.get(rowNumber).get("LastName");
		 String email = testData.get(rowNumber).get("Email");
		 String username = testData.get(rowNumber).get("UserName");
		 String phone = testData.get(rowNumber).get("Phon");
		 String address = testData.get(rowNumber).get("Address");
		 String zipcode = testData.get(rowNumber).get("ZipCode");
		 isopage.creatmerchant(dba, legalname, firstname, lastname, email, username, phone, address, zipcode);
		 isopage.tz2();
		 isopage.nxtbutton();
		 
		
	}
	
	@When("user is  add on timezone and  store in Tsys processor")
	public void user_is_add_on_timezone_and_store_in_tsys_processor() throws InterruptedException {
		
		isopage.tz3();
		isopage.m2();
		isopage.adStore();
		
	}

	
	@When("user click the Tsys processor")
	public void user_click_the_tsys_processor() throws InterruptedException {
	    
		isopage.Devic();
		isopage.TsysprocType();
		isopage.dname();
		
		
	}


@When("user files the device details MIT and TID  details from given the Tsys sheetname {string} and rownumber {int}")
public void user_files_the_device_details_mit_and_tid_details_from_given_the_tsys_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, InterruptedException {
		ExcelReader reader = new ExcelReader();
		 List<Map<String,String>> testData=
				 reader.getData("C:\\Users\\vigneshwaran\\Documents\\Automation testing\\Excel\\ISO SHEET\\MerchantBoarding.xlsx", SheetName);
		 String mid = testData.get(rowNumber).get("MID");
		 String vnumber = testData.get(rowNumber).get("Vnumber");
		 String storeno = testData.get(rowNumber).get("storeno");
		 String termno = testData.get(rowNumber).get("TermNo");
		 String agentban = testData.get(rowNumber).get("AgentBankNumber");
		 String chain = testData.get(rowNumber).get("chain");
		 String agent = testData.get(rowNumber).get("Agent");
		 isopage.tsysdata(mid, vnumber, storeno, termno, agentban, chain, agentban, agent);
		 isopage.BinIndustry();
		 isopage.dnxt();
		 
		
	}

	@When("activating merchant Tsys processor account in email")
	public void activating_merchant_tsys_processor_account_in_email() throws InterruptedException {
	   
		isopage.activation1();
		
		
		
		
	}

	
	
	
	
	
	//OMAHA:

@When("click to the add button before Omaha processor")
public void click_to_the_add_button_before_omaha_processor() throws InterruptedException {
	isopage.add();
	isopage.fullbr();
}

@When("merchant boarding Omaha processor contact details from given sheetname {string} and rownumber {int}")
public void merchant_boarding_omaha_processor_contact_details_from_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, InterruptedException {
	ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\vigneshwaran\\Documents\\Automation testing\\Excel\\ISO SHEET\\MerchantBoarding.xlsx", SheetName);
	 String dba = testData.get(rowNumber).get("DBA");
	 String legalname = testData.get(rowNumber).get("LegalName");
	 String firstname = testData.get(rowNumber).get("FirstName");
	 String lastname = testData.get(rowNumber).get("LastName");
	 String email = testData.get(rowNumber).get("Email");
	 String username = testData.get(rowNumber).get("UserName");
	 String phone = testData.get(rowNumber).get("Phon");
	 String address = testData.get(rowNumber).get("Address");
	 String zipcode = testData.get(rowNumber).get("ZipCode");
	 isopage.creatmerchant(dba, legalname, firstname, lastname, email, username, phone, address, zipcode);
	 isopage.tz2();
	 isopage.dnxt();
}

@When("user is  add on timezone and  store in Omaha processor")
public void user_is_add_on_timezone_and_store_in_omaha_processor() throws InterruptedException {
	

	isopage.tz2();
	isopage.m2();
	isopage.adStore();
}


@When("user files the device Omaha processor")
public void user_files_the_device_omaha_processor() throws InterruptedException {
    
	isopage.Devic();
	isopage.FDROMAHAprocType();
	isopage.dname();
}

@When("user files the device details MIT and TID  details from given Omaha sheetname {string} and rownumber {int}")
public void user_files_the_device_details_mit_and_tid_details_from_given_omaha_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, InterruptedException {
	
	ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\vigneshwaran\\Documents\\Automation testing\\Excel\\ISO SHEET\\MerchantBoarding.xlsx", SheetName);
	 
	 String mid = testData.get(rowNumber).get("MID");
	 String tid = testData.get(rowNumber).get("Vnumber");
	 String dominename = testData.get(rowNumber).get("storeno");
	 String customfee = testData.get(rowNumber).get("TermNo");
	 
	 isopage.FDRDetails(mid, tid, dominename, customfee);
	 isopage.dnxt();
	 
}

@When("activating merchant Omaha processor account in email")
public void activating_merchant_omaha_processor_account_in_email() throws InterruptedException {
    
	isopage.activation1();
	
	
}
 
	//CARDNET:
@When("click to the add button before Cardnet processor")
public void click_to_the_add_button_before_cardnet_processor() throws InterruptedException {
	isopage.add();
	isopage.fullbr();
}

@When("merchant boarding Cardnet processor contact details from given sheetname {string} and rownumber {int}")
public void merchant_boarding_cardnet_processor_contact_details_from_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, InterruptedException {
    
	
	
	ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\vigneshwaran\\Documents\\Automation testing\\Excel\\ISO SHEET\\MerchantBoarding.xlsx", SheetName);
	 String dba = testData.get(rowNumber).get("DBA");
	 String legalname = testData.get(rowNumber).get("LegalName");
	 String firstname = testData.get(rowNumber).get("FirstName");
	 String lastname = testData.get(rowNumber).get("LastName");
	 String email = testData.get(rowNumber).get("Email");
	 String username = testData.get(rowNumber).get("UserName");
	 String phone = testData.get(rowNumber).get("Phon");
	 String address = testData.get(rowNumber).get("Address");
	 String zipcode = testData.get(rowNumber).get("ZipCode");
	 isopage.creatmerchant(dba, legalname, firstname, lastname, email, username, phone, address, zipcode);
	 isopage.tz2();
	 isopage.dnxt();
	 
	
	
	
	
	
	
	
	
	
	
	
}

@When("user is  add on timezone and  store in Cardnet processor")
public void user_is_add_on_timezone_and_store_in_cardnet_processor() throws InterruptedException {

	isopage.tz2();
	isopage.m2();
	isopage.adStore();
	
	
	
}




@When("user files the device Cardnet processor")
public void user_files_the_device_cardnet_processor() throws InterruptedException {
	isopage.Devic();
	isopage.FDRCardnetprocType();
	isopage.dname();
}

@When("user files the device details MIT and TID  details from given Cardnet sheetname {string} and rownumber {int}")
public void user_files_the_device_details_mit_and_tid_details_from_given_cardnet_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, InterruptedException {
  

	ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\vigneshwaran\\Documents\\Automation testing\\Excel\\ISO SHEET\\MerchantBoarding.xlsx", SheetName);
	 
	 String mid = testData.get(rowNumber).get("MID");
	 String tid = testData.get(rowNumber).get("Vnumber");
	 String dominename = testData.get(rowNumber).get("storeno");
	 String customfee = testData.get(rowNumber).get("TermNo");
	 
	 isopage.FDRDetails(mid, tid, dominename, customfee);
	 isopage.dnxt();
	 
	
}

@When("activating merchant Cardnet account in email")
public void activating_merchant_cardnet_account_in_email() throws InterruptedException {
    
	isopage.activation1();
}

	
	
	//BUYPASS:
	
@When("click to the add button BUYPASS processor")
public void click_to_the_add_button_buypass_processor() throws InterruptedException {
	isopage.add();
	isopage.fullbr();
}

@When("merchant boarding BUYPASS processor contact details from given sheetname {string} and rownumber {int}")
public void merchant_boarding_buypass_processor_contact_details_from_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, InterruptedException {
    
	ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\vigneshwaran\\Documents\\Automation testing\\Excel\\ISO SHEET\\MerchantBoarding.xlsx", SheetName);
	 String dba = testData.get(rowNumber).get("DBA");
	 String legalname = testData.get(rowNumber).get("LegalName");
	 String firstname = testData.get(rowNumber).get("FirstName");
	 String lastname = testData.get(rowNumber).get("LastName");
	 String email = testData.get(rowNumber).get("Email");
	 String username = testData.get(rowNumber).get("UserName");
	 String phone = testData.get(rowNumber).get("Phon");
	 String address = testData.get(rowNumber).get("Address");
	 String zipcode = testData.get(rowNumber).get("ZipCode");
	 isopage.creatmerchant(dba, legalname, firstname, lastname, email, username, phone, address, zipcode);
	 isopage.tz2();
	 isopage.dnxt();
	
	
}


@When("user is  add on timezone and  store in Buypass processor")
public void user_is_add_on_timezone_and_store_in_buypass_processor() throws InterruptedException {
	isopage.tz2();
	isopage.m2();
	isopage.adStore();
	
}



@When("user files the device BUYPASS processor")
public void user_files_the_device_buypass_processor() throws InterruptedException {
	isopage.Devic();
	isopage.FDRBuypassprocType();
	isopage.dname();
}

@When("user files the device details MIT and TID  details  from given BUYPASS sheetname {string} and rownumber {int}")
public void user_files_the_device_details_mit_and_tid_details_from_given_buypass_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, InterruptedException {

	ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\vigneshwaran\\Documents\\Automation testing\\Excel\\ISO SHEET\\MerchantBoarding.xlsx", SheetName);
	 
	 String mid = testData.get(rowNumber).get("MID");
	 String tid = testData.get(rowNumber).get("Vnumber");
	 String dominename = testData.get(rowNumber).get("storeno");
	 String customfee = testData.get(rowNumber).get("TermNo");
	 
	 isopage.FDRDetails(mid, tid, dominename, customfee);
	 isopage.dnxt();
	
	
	
}

@When("activating merchant BUYPASS account in email")
public void activating_merchant_buypass_account_in_email() throws InterruptedException {
	 
		isopage.activation1();
}
	
	
	
	
	
	
 
	//NASHVILEE:
	
@When("click to the add button Nashville processor")
public void click_to_the_add_button_nashville_processor() throws InterruptedException {
	isopage.add();
	isopage.fullbr();
}

@When("merchant boarding Nashville processor contact details from given sheetname {string} and rownumber {int}")
public void merchant_boarding_nashville_processor_contact_details_from_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, InterruptedException {
	ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\vigneshwaran\\Documents\\Automation testing\\Excel\\ISO SHEET\\MerchantBoarding.xlsx", SheetName);
	 String dba = testData.get(rowNumber).get("DBA");
	 String legalname = testData.get(rowNumber).get("LegalName");
	 String firstname = testData.get(rowNumber).get("FirstName");
	 String lastname = testData.get(rowNumber).get("LastName");
	 String email = testData.get(rowNumber).get("Email");
	 String username = testData.get(rowNumber).get("UserName");
	 String phone = testData.get(rowNumber).get("Phon");
	 String address = testData.get(rowNumber).get("Address");
	 String zipcode = testData.get(rowNumber).get("ZipCode");
	 isopage.creatmerchant(dba, legalname, firstname, lastname, email, username, phone, address, zipcode);
	 isopage.tz2();
	 isopage.dnxt();
	
	
}

@When("user is  add on timezone and  store in Nashville processor")
public void user_is_add_on_timezone_and_store_in_nashville_processor() throws InterruptedException {
	isopage.tz2();
	isopage.m2();
	isopage.adStore();
}
@When("user files the device Nashville processor")
public void user_files_the_device_nashville_processor() throws InterruptedException {
	isopage.Devic();
	isopage.FDRNashvilleType();
	isopage.dname();
}

@When("user files the device details MIT and TID  details from given Nashville sheetname {string} and rownumber {int}")
public void user_files_the_device_details_mit_and_tid_details_from_given_nashville_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, InterruptedException {
	ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\vigneshwaran\\Documents\\Automation testing\\Excel\\ISO SHEET\\MerchantBoarding.xlsx", SheetName);
	 
	 String mid = testData.get(rowNumber).get("MID");
	 String tid = testData.get(rowNumber).get("Vnumber");
	 String dominename = testData.get(rowNumber).get("storeno");
	 String customfee = testData.get(rowNumber).get("TermNo");
	 
	 isopage.FDRDetails(mid, tid, dominename, customfee);
	 isopage.dnxt();
	
}

@When("activating merchant Nashville account in email")
public void activating_merchant_nashville_account_in_email() throws InterruptedException {
	isopage.activation1();
}

	
	
	
	
	
	//POSTILION
@When("click to the add button Postilion processor")
public void click_to_the_add_button_postilion_processor() throws InterruptedException {
	isopage.add();
	isopage.fullbr();
	
	
}

@When("merchant boarding Postilion processor contact details from given sheetname {string} and rownumber {int}")
public void merchant_boarding_postilion_processor_contact_details_from_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, InterruptedException {
    
	ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\vigneshwaran\\Documents\\Automation testing\\Excel\\ISO SHEET\\MerchantBoarding.xlsx", SheetName);
	 String dba = testData.get(rowNumber).get("DBA");
	 String legalname = testData.get(rowNumber).get("LegalName");
	 String firstname = testData.get(rowNumber).get("FirstName");
	 String lastname = testData.get(rowNumber).get("LastName");
	 String email = testData.get(rowNumber).get("Email");
	 String username = testData.get(rowNumber).get("UserName");
	 String phone = testData.get(rowNumber).get("Phon");
	 String address = testData.get(rowNumber).get("Address");
	 String zipcode = testData.get(rowNumber).get("ZipCode");
	 isopage.creatmerchant(dba, legalname, firstname, lastname, email, username, phone, address, zipcode);
	 isopage.tz2();
	 isopage.dnxt();
	
	
}

@When("user is  add on timezone and  store in Postilion processor")
public void user_is_add_on_timezone_and_store_in_postilion_processor() throws InterruptedException {
	isopage.tz2();
	isopage.m2();
	isopage.adStore();
}

@When("user files the device Postilion processor")
public void user_files_the_device_postilion_processor() throws InterruptedException {
	isopage.Devic();
	isopage.PostilionprocType();
	isopage.dname();
}

@When("user files the device details MIT and TID  details from given Postilion sheetname {string} and rownumber {int}")
public void user_files_the_device_details_mit_and_tid_details_from_given_postilion_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException, InterruptedException {
    
	ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\vigneshwaran\\Documents\\Automation testing\\Excel\\ISO SHEET\\MerchantBoarding.xlsx", SheetName);
	 
	 String mid = testData.get(rowNumber).get("MID");
	 String tid = testData.get(rowNumber).get("Vnumber");
	 String dominename = testData.get(rowNumber).get("storeno");
	 String customfee = testData.get(rowNumber).get("TermNo");
	 
	 isopage.FDRDetails(mid, tid, dominename, customfee);
	 isopage.dnxt();
	
	
	
}

@When("activating merchant Postilion account in email")
public void activating_merchant_postilion_account_in_email() throws InterruptedException {
	isopage.activation1();
	
	
	
   }
	
	
@When("click to the add button")
public void click_to_the_add_button() throws InterruptedException {
	
	isopage.UserManagementModules();
	isopage.ISOADD();
	isopage.ISOADDUSER();

	
}

@When("ISo user is boarded a Contact Information in this sheet {string} and rownumber {int}")
public void i_so_user_is_boarded_a_contact_information_in_this_sheet_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {
	ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\vigneshwaran\\Documents\\Automation testing\\Excel\\ISO SHEET\\SameLevelUser.xlsx", SheetName);
	 String email = testData.get(rowNumber).get("mail");
	 String UserName = testData.get(rowNumber).get("usname");
	 String Phone = testData.get(rowNumber).get("Phone");
	 String firstName = testData.get(rowNumber).get("firstname");
	 String lastName = testData.get(rowNumber).get("lastname");
	 isopage.ISOUSERDetails(email, UserName, Phone, firstName, lastName);
	 isopage.nxtbutton();
	 
	 
	 
	
}

@When("activating samel level iso in email")
public void activating_samel_level_iso_in_email() throws InterruptedException {
	isopage.activationISO1();
}

@When("TSYS SIERRA processor to select the SubIso option")
public void tsys_sierra_processor_to_select_the_sub_iso_option() throws InterruptedException {
    
	isopage.UserManagementModules();
	isopage.ISOADD();
	isopage.ADDSUBISO();
	
	
	
	
	
}

@When("user is on boarded a TSYS SIERRA processor Contact Information Iso given sheetname {string} and rownumber {int}")
public void user_is_on_boarded_a_tsys_sierra_processor_contact_information_iso_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws InterruptedException, InvalidFormatException, IOException{
	 ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\vigneshwaran\\Documents\\Automation testing\\Excel\\ISO SHEET\\SameLevelUser.xlsx", SheetName);

	 
	 String custName = testData.get(rowNumber).get("cust");
		
	 String email = testData.get(rowNumber).get("mail");
	 String UserName = testData.get(rowNumber).get("usname");
	 String Phone = testData.get(rowNumber).get("Phone");
	 String firstName = testData.get(rowNumber).get("firstname");
	 String lastName = testData.get(rowNumber).get("lastname");
	 String address = testData.get(rowNumber).get("addres");
	 String zipcode = testData.get(rowNumber).get("zipcod");
	 String city = testData.get(rowNumber).get("cit");
	
	 isopage.SubISO(custName, email, UserName, Phone, firstName, lastName, address, zipcode, city);
		
	 isopage.clickNextButton();
	
	
	
}

@When("user is on boarded a TSYS SIERRA Processor Info")
public void user_is_on_boarded_a_tsys_sierra_processor_info() throws InterruptedException {
    
	isopage.processorinfo();
	isopage.selectallmodule();
	
}
@When("activating TSYS SIERRA processor subiso in email")
public void activating_tsys_sierra_processor_subiso_in_email() throws InterruptedException {
   
	isopage.activation1();
	
	
	
}



//OMAHA:

@When("FD OMAHA processor to select the SubIso option")
public void fd_omaha_processor_to_select_the_sub_iso_option() throws InterruptedException {
   
	 
		isopage.UserManagementModules();
		isopage.ISOADD();
 
		isopage.ADDSUBISO();
	
	
	
	
	
}

@When("user is on boarded a FD OMAHA processor Contact Information Iso given sheetname {string} and rownumber {int}")
public void user_is_on_boarded_a_fd_omaha_processor_contact_information_iso_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws InterruptedException, InvalidFormatException, IOException{
    
	ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\vigneshwaran\\Documents\\Automation testing\\Excel\\ISO SHEET\\SubIso.xlsx", SheetName);

	 
	 String custName = testData.get(rowNumber).get("cust");
		
	 String email = testData.get(rowNumber).get("mail");
	 String UserName = testData.get(rowNumber).get("usname");
	 String Phone = testData.get(rowNumber).get("Phone");
	 String firstName = testData.get(rowNumber).get("firstname");
	 String lastName = testData.get(rowNumber).get("lastname");
	 String address = testData.get(rowNumber).get("addres");
	 String zipcode = testData.get(rowNumber).get("zipcod");
	 String city = testData.get(rowNumber).get("cit");
	
	 isopage.SubISO(custName, email, UserName, Phone, firstName, lastName, address, zipcode, city);
		
	 isopage.clickNextButton();
	
	
	
	
	
	
}

@When("user is on boarded a FD OMAHA processor Info")
public void user_is_on_boarded_a_fd_omaha_processor_info() {
    
	isopage.FDROMAHAprocType();
	isopage.clickNextButton();
	isopage.selectallmodule();
	
	
	
	
	
}

@When("activating FD OMAHA processor subiso in email")
public void activating_fd_omaha_processor_subiso_in_email() throws InterruptedException {
   
	isopage.activation1();
	
	
	
	
	
	
}






//CARDNET


@When("FD CARDNET processor to select the SubIso option")
public void fd_cardnet_processor_to_select_the_sub_iso_option() throws InterruptedException {
	isopage.UserManagementModules();
	isopage.ISOADD();
	isopage.ADDSUBISO();
	
	
	
	
	
	
}

@When("user is on boarded a FD CARDNET processor Contact Information Iso given sheetname {string} and rownumber {int}")
public void user_is_on_boarded_a_fd_cardnet_processor_contact_information_iso_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws InterruptedException, InvalidFormatException, IOException {
    
	ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\vigneshwaran\\Documents\\Automation testing\\Excel\\ISO SHEET\\SubIso.xlsx", SheetName);

	 
	 String custName = testData.get(rowNumber).get("cust");
		
	 String email = testData.get(rowNumber).get("mail");
	 String UserName = testData.get(rowNumber).get("usname");
	 String Phone = testData.get(rowNumber).get("Phone");
	 String firstName = testData.get(rowNumber).get("firstname");
	 String lastName = testData.get(rowNumber).get("lastname");
	 String address = testData.get(rowNumber).get("addres");
	 String zipcode = testData.get(rowNumber).get("zipcod");
	 String city = testData.get(rowNumber).get("cit");
	
	 isopage.SubISO(custName, email, UserName, Phone, firstName, lastName, address, zipcode, city);
		
	 isopage.clickNextButton();
	
	
}

@When("user is on boarded a FD CARDNET processor Info")
public void user_is_on_boarded_a_fd_cardnet_processor_info() {
	
	
	isopage.FDRCardnetprocType();
	isopage.clickNextButton();
	isopage.selectallmodule();
	
}

@When("activating FD CARDNET processor subiso in email")
public void activating_fd_cardnet_processor_subiso_in_email() throws InterruptedException {
	isopage.activation1();
	
	
	
}

//BUYPASS:

@When("FD BUYPASS processor to select the SubIso option")
public void fd_buypass_processor_to_select_the_sub_iso_option() throws InterruptedException {
    
	isopage.UserManagementModules();
	isopage.ISOADD();
	isopage.ADDSUBISO();
	
	
	
	
}

@When("user is on boarded a FD BUYPASS processor Contact Information Iso given sheetname {string} and rownumber {int}")
public void user_is_on_boarded_a_fd_buypass_processor_contact_information_iso_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {
    
	ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\vigneshwaran\\Documents\\Automation testing\\Excel\\ISO SHEET\\SubIso.xlsx", SheetName);

	 
	 String custName = testData.get(rowNumber).get("cust");
		
	 String email = testData.get(rowNumber).get("mail");
	 String UserName = testData.get(rowNumber).get("usname");
	 String Phone = testData.get(rowNumber).get("Phone");
	 String firstName = testData.get(rowNumber).get("firstname");
	 String lastName = testData.get(rowNumber).get("lastname");
	 String address = testData.get(rowNumber).get("addres");
	 String zipcode = testData.get(rowNumber).get("zipcod");
	 String city = testData.get(rowNumber).get("cit");
	
	 isopage.SubISO(custName, email, UserName, Phone, firstName, lastName, address, zipcode, city);
		
	 isopage.clickNextButton();
	
	
	
}

@When("user is on boarded a FD BUYPASS processor Info")
public void user_is_on_boarded_a_fd_buypass_processor_info() {
    
	
	isopage.FDRBuypassprocType();
	isopage.clickNextButton();
	isopage.selectallmodule();
}

@When("activating FD BUYPASS processor subiso in email")
public void activating_fd_buypass_processor_subiso_in_email() throws InterruptedException {
    
	isopage.activation1();
	
	
}


@When("FD NASHVILLE processor to select the SubIso option")
public void fd_nashville_processor_to_select_the_sub_iso_option() throws InterruptedException {
	isopage.UserManagementModules();
	isopage.ISOADD();
	isopage.ADDSUBISO();
	
	
	
	
}

@When("user is on boarded a FD NASHVILLE processor Contact Information Iso given sheetname {string} and rownumber {int}")
public void user_is_on_boarded_a_fd_nashville_processor_contact_information_iso_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {
    
	ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\vigneshwaran\\Documents\\Automation testing\\Excel\\ISO SHEET\\SubIso.xlsx", SheetName);

	 
	 String custName = testData.get(rowNumber).get("cust");
		
	 String email = testData.get(rowNumber).get("mail");
	 String UserName = testData.get(rowNumber).get("usname");
	 String Phone = testData.get(rowNumber).get("Phone");
	 String firstName = testData.get(rowNumber).get("firstname");
	 String lastName = testData.get(rowNumber).get("lastname");
	 String address = testData.get(rowNumber).get("addres");
	 String zipcode = testData.get(rowNumber).get("zipcod");
	 String city = testData.get(rowNumber).get("cit");
	
	 isopage.SubISO(custName, email, UserName, Phone, firstName, lastName, address, zipcode, city);
		
	 isopage.clickNextButton();
   
	
	
	
	
	
}

@When("user is on boarded a FD NASHVILLE processor Info")
public void user_is_on_boarded_a_fd_nashville_processor_info() {
	isopage.FDRNashvilleType();
	isopage.clickNextButton();
	isopage.selectallmodule();
	
	
}

@When("activating FD NASHVILLE processor subiso in email")
public void activating_fd_nashville_processor_subiso_in_email() throws InterruptedException {
   
	isopage.activation1();
	
	
}

@When("POSTILION processor to select the SubIso option")
public void postilion_processor_to_select_the_sub_iso_option() throws InterruptedException {
    
	isopage.UserManagementModules();
	isopage.ISOADD();
	isopage.ADDSUBISO();
	
	
}

@When("user is on boarded a POSTILION processor Contact Information Iso given sheetname {string} and rownumber {int}")
public void user_is_on_boarded_a_postilion_processor_contact_information_iso_given_sheetname_and_rownumber(String SheetName, Integer rowNumber) throws InvalidFormatException, IOException, InterruptedException {
    
	ExcelReader reader = new ExcelReader();
	 List<Map<String,String>> testData=
			 reader.getData("C:\\Users\\vigneshwaran\\Documents\\Automation testing\\Excel\\ISO SHEET\\SubIso.xlsx", SheetName);

	 
	 String custName = testData.get(rowNumber).get("cust");
		
	 String email = testData.get(rowNumber).get("mail");
	 String UserName = testData.get(rowNumber).get("usname");
	 String Phone = testData.get(rowNumber).get("Phone");
	 String firstName = testData.get(rowNumber).get("firstname");
	 String lastName = testData.get(rowNumber).get("lastname");
	 String address = testData.get(rowNumber).get("addres");
	 String zipcode = testData.get(rowNumber).get("zipcod");
	 String city = testData.get(rowNumber).get("cit");
	
	 isopage.SubISO(custName, email, UserName, Phone, firstName, lastName, address, zipcode, city);
		
	 isopage.clickNextButton();
    
	
	
	
}


@When("user is on boarded a POSTILION Processor Info")
public void user_is_on_boarded_a_postilion_processor_info() {
	isopage.POSTILIONProcessorType();
	isopage.clickNextButton();
	isopage.selectallmodule();
	
	
}

@When("activating POSTILION processor subiso in email")
public void activating_postilion_processor_subiso_in_email() throws InterruptedException {
    

	isopage.activation1();
	
	
	
}

//DevieManagement:

@When("user is search on particural epi to click")
public void user_is_search_on_particural_epi_to_click() throws InterruptedException {
   
	isopage.DevicemanagementClick();
	isopage.DevicemanagementSearchBoxClick();
	isopage.DevicemanagementThreeDotClick();
	isopage.TipFlagYes();
}




@When("user is clicked on tip flag is disabled & enabled  to check the sale txn")
public void user_is_clicked_on_tip_flag_is_disabled_enabled_to_check_the_sale_txn() throws InterruptedException {
    

	isopage.epiD();
	isopage.amount();
	isopage.cardNumber();
	isopage.CVV();
	isopage.cardHolderName();
	isopage.Process();
	isopage.Txn();
	isopage.ActionsOption();
	isopage.TipAdjustAmount();
	
	
	
	
	
	
}
@When("user is tip is on and TIP ON SCREEN flag is disabled & enabled to check txn")
public void user_is_tip_is_on_and_tip_on_screen_flag_is_disabled_enabled_to_check_txn() {
    
}


	
}
