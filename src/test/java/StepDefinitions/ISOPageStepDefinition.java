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

	@Given("user is on MerchantManagementPage")
	public void user_is_on_merchant_management_page(DataTable credTable) throws InterruptedException {

		List<Map<String, String>> credList = credTable.asMaps();
		String userName = credList.get(0).get("username");
		String password = credList.get(0).get("password");
		DriverFactory.getDriver().get("https://uat.valorpaytech.com/signin");
		homePage = loginPage.doLogin(userName, password);
		isopage = homePage.merchantclick();

	}

	@When("click to the button")
	public void click_to_the_button() throws InterruptedException {
		isopage.add();

	}

	@When("user clicks Full Board")
	public void user_clicks_full_board() throws InterruptedException {
		isopage.fullbr();

	}

	@When("merchant boarding contact details from given sheetname")
	public void merchant_boarding_contact_details_from_given_sheetname() throws InterruptedException {
	    
		isopage.creatmerchant();
		
		
		

	}


	@When("user files the store details from given sheetname")
	public void user_files_the_store_details_from_given_sheetname() throws InterruptedException {
		
		
		isopage.tz2();
		isopage.m2();
		isopage.adStore();
		
	}
	
	
	@When("user files the device types and processor")
	public void user_files_the_device_types_and_processor() throws InterruptedException {
		
		isopage.Devic();
		isopage.proc();
		isopage.dname();
		
		
	    
	}

	@When("user files the device MIT and TID  details from given sheetname")
	public void user_files_the_device_mit_and_tid_details_from_given_sheetname() throws InterruptedException {
	    
	

		
		
		isopage.tsysdata();
	}
	


	@When("User is click to  next button")
	public void user_is_click_to_next_button() throws InterruptedException {
		isopage.dnxt();

	}

	@When("user is activation merchant")
	public void user_is_activation_merchant() throws InterruptedException {
	   
		isopage.activationMerchant();
		
		
		
	}
	
	@When("Boarding the merchant quick board")
	public void boarding_the_merchant_quick_board() throws InterruptedException {
	
		isopage.quickBrd();
		isopage.quickDevice();
		isopage.quickBrdActivation();
		isopage.quickm2();
		isopage.quickprocessor();
		isopage.quickCashDiscountSurcharge();
		isopage.activationMerchant();
		
		
		
		
		
	}

}
