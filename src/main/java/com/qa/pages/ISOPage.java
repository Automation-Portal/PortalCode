package com.qa.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ISOPage {

	private WebDriver driver;
	private By continueButton = By.xpath("//span[@class='MuiButton-label']");
	private By MerchantAddOption = By.xpath("//span[contains(text(),'Add')]");
	private By fullboard = By.xpath("//span[contains(text(),'Full Board')]");
	private By quickBoard = By.xpath("//div[@role='presentation']//li[1]");
	private By userMgtadd = By.xpath("//span[contains(text(),'Add')]");
//Offices
	private By offices = By.xpath("(//button[@type='button'])[5]");
	private By dba = By.name("dbaName");
	private By legalname = By.name("legalName");
	private By firstname = By.name("firstName");
	private By lastname = By.name("lastName");
	private By email = By.xpath(
			"//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div[1]/div[3]/div/div[1]/div/div/div[5]/div/div/input");
	private By username = By.xpath(
			"//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div[1]/div[3]/div/div[1]/div/div/div[6]/div/div/input");
	private By phone = By.xpath("//input[@autocomplete='disabled']");
	private By address = By.xpath("//input[@name='legalAddress']");
	private By zipcode = By.name("legalZipCode");
	private By city = By.name("legalCity");
	private By timezone = By.xpath(
			"//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div[1]/div[3]/div/div[1]/div/div/div[12]/div/div/div");
	private By nextBtn1 = By.xpath("//span[contains(text(),'Next')]");
	private By tzz = By.xpath(
			"(//div[@role='button'])[2]");
//private By timez2 = By.xpath("//*[@id=\"menu-\"]/div[3]/ul/");
	private By mcclick = By.xpath("//button[@aria-label='Open']");
	private By mcc = By.xpath("//button[@aria-label=\"Open\"]");
//private By mcccode = By.xpath("//input[@class='MuiInputBase-input-847 MuiInput-input-835 MuiAutocomplete-input-940 MuiAutocomplete-inputFocused-941 MuiInputBase-inputAdornedEnd-852 MuiInputBase-inputMarginDense-848 MuiInput-inputMarginDense-836']");
	private By addbtn = By.xpath("//span[contains(text(),'Add Store')]");
	private By deviceType = By.xpath(
			"//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div[1]/div[2]/div/div[1]/div/div/div[6]/div/div/div");
	private By processor = By.xpath(
			"//body[1]/div[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]");
	private By devname = By.xpath("//input[@value='Device1']");
	private By debitShare = By.xpath("//*[@id=\"mui-component-select-debitShare\"]");
	private By dpfiscol = By.xpath("//input[@name='dpFiscal_token']");
	private By mid = By.name("mid");
	private By vno = By.name("vNumber");
	private By stnumber = By.name("storeNo");
	private By tm = By.name("termNo");
	private By bin = By.xpath("//div[@id='mui-component-select-binnumber']");
	private By industry = By.xpath(
			"(//div[@id='mui-component-select-industry'])[1]");
	private By agtnumber = By.name("agentBank");
	private By chnumber = By.name("chain");
	private By agnt = By.name("agent");
	private By ebtca = By.name("EBTcash");
	private By ebtfd = By.name("EBTfood");
	private By fnsno = By.name("EbtNo");
	private By customfee = By.name("surchargePercentage");
	private By addde = By.xpath("//span[contains(text(),'Add')]");
//private By ant = By .xpath("//button[@class='MuiButtonBase-root-607 MuiButton-root-772 MuiButton-text-774 jr-btn next-btn hoverBtn MuiButton-contained MuiButton-containedPrimary']//span[@class='MuiButton-label-773']//span");
//FDR Details:
	private By tid = By.name("termNoFD");
	private By dominname = By.name("website");
	
//Do you want to add more devices?
	private By no = By.xpath("(//button[@type='button'])[11]");
	private By more = By.xpath("//*[@id=\"body\"]/div[2]/div[3]/div/div[2]/button[1]/span[1]/span");
	private By onboard = By.xpath("//span[normalize-space()='Onboard Merchant']");
	private By prev = By.xpath("//span[contains(text(),'Prev')]");
	private By enableMerchant = By.xpath("(//span[@aria-disabled='false'])[1]");

	
//QuickBoardXpath:
	private By quickDba = By.xpath(
			"//body[1]/div[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/input[1]");
	// private By legalname = By.name("legalName");
	// private By firstname = By.name("firstName");
	private By quickLastname = By.xpath("(//input[@type='text'])[4]");
	private By quickEmail = By.xpath("(//input[@type='text'])[5]");
	private By quickUsername = By.xpath("(//input[@type='text'])[6]");
	private By quickPhone = By.xpath("(//input[@type='text'])[7]");
	private By quickAddress = By.xpath("(//input[@type='text'])[8]");
	private By quickZipcode = By.xpath("(//input[@type='text'])[9]");
	private By quickCity = By.xpath("(//input[@type='text'])[10]");
	private By quickTimeZone = By.xpath("(//div[@role='button'])[2]");
	private By quickMCC = By.xpath("//div[@role='combobox']//div//div//input[@type='text']");
	private By DebitShare = By.xpath("//div[19]//div[1]//div[1]//div[1]");
	
	//SUBISO:
	   private By userMgtadd2 = By.xpath("//span[contains(text(),'User Management')]");
	    private By umaddCust = By.xpath("//span[contains(text(),'ADD CUSTOMER')]");
	    private By add = By.xpath("(//span[@class='MuiButton-label'])[1]");
	    private By custName = By.name("DBA");
	    private By email2 = By.xpath("//input[@id='email']");
	    private By UserName = By.xpath("//input[@id='user_Name']");
	    private By Phone = By.xpath("//input[@id='Phone']");
	    private By firstName = By.id("firstName");
	    private By lastName = By.xpath("//input[@id='lastName']");
	    private By address2 = By.xpath("//input[@id='address']");
	    private By zipCode = By.xpath("//input[@name='zipCode']");
	    private By city1 = By.xpath("//input[@id='city']");
	    // private By state =By.xpath("//div[@class='css-1hwfws3']");
	    private By nextBtn = By.xpath("//span[contains(text(),'Next')]");
	    private By submitbutton  = By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained jr-btn next-btn MuiButton-containedPrimary'][2]");
	    private By selectmodule = By.xpath("//input[@value='jason']");
	
	  //ActivatISO:   
	    private By ed = By.id("identifierId");
		private By ps = By.name("Passwd");
	    private By registration = By.xpath("//div[@role='link']//div//div//span//span[contains(text(),'Registration')]");
	    private By  activate = By.xpath("//u[normalize-space()='Click Here For Activation']");
	  //ADDISOUSER
	    private By subuser = By.xpath("//span[normalize-space()='Add USER']");
	    private By Threedot = By.xpath("(//button[@aria-label='More'])[1]");
	
	   //SUBISO 
	    private By prcssrType = By.xpath("//div[contains(text(),'TSYS SIERRA')]");
	//search box:
	    private By Search = By.id("outlined-name");
	
	    //Sale:
		private By epitype =  By.xpath("//span[@class='MuiButton-label']//div");
		private By sale = By.xpath("//input[@value='0']");
		private By amnt = By.name("amount");
		private By cdnumber = By.xpath("//input[@placeholder='Card number*']");
		private By cvv = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div/div/div/div[2]/div/div[3]/div/div/div/form/div[1]/div[2]/input");
		private By mmyy = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[3]/main/div/div[1]/div/div/div/div/div/div/div[2]/div/div[3]/div/div/div/form/div[2]/div[3]/input");
		private By crdholdr =By.name("_chn");
		private By prcss = By.xpath("//div[@class='card-btn']//span[@class='MuiButton-label']");
		private By prc = By.xpath("(//span[contains(text(),'Process')])[2]");
		private By phn	= By.name("phoneNo");
		private By em = By.name("email");
		private By close = By.xpath("(//span[contains(text(),'Close')])[1]");
	    //DeviceManagement Tip,Tax & FEE Xpath
	    private By DeviceManagement = By.xpath("//span[contains(text(),'Device Management')]");
	    private By virterminalclick = By.xpath("//*[@id=\"app-site\"]/div/div[1]/div[2]/div/div/div[2]/div[1]/ul/li[4]/a");
	    private By loginButton = By.xpath("//span[contains(text(),'YES')]");
	    //Flag:
		private By TipYesNo = By.xpath("(//span[contains(text(),'YES')])[1]");
		private By TipOnScreenYesNo = By.xpath("(//span[contains(text(),'YES')])[2]");
		private By CustomFeeYesNo = By.xpath("(//span[contains(text(),'YES')])[3]");
		private By EnableForDebitYesNo = By.xpath("(//span[contains(text(),'YES')])[4]");
		private By CustomFeeDisclosureYesNo = By.xpath("(//span[contains(text(),'YES')])[5]");
		private By IncludeTipOnYesNo = By.xpath("(//span[contains(text(),'YES')])[6]");
		private By ShowRemoveFeeYesNo = By.xpath("(//span[contains(text(),'YES')])[7]");
		private By PromptPasswordToRemoveFeeYesNo = By.xpath("(//span[contains(text(),'YES')])[8]");
		private By IncludeTaxYesNo = By.xpath("(//span[contains(text(),'YES')])[9]");
		private By TaxYesNo = By.xpath("(//span[contains(text(),'YES')])[10]");
		//TipOnScreen
		private By YesNo = By.xpath("(//span[contains(text(),'YES')])[2]");
		private By Option1 = By.xpath("(//input[@type='text'])[1]");
		private By Option2 = By.xpath("(//input[@type='text'])[2]");
		private By Option3 = By.xpath("(//input[@type='text'])[3]");
		private By Option4 = By.xpath("(//input[@type='text'])[4]");
		
		//MaxTIP"
		private By MaxTip = By.xpath("(//input[@value='350'])[1]");
		
		//TAX:
		private By StateTax = By.xpath("(//input[@value='4.000'])[1]");
		private By CityTax = By.xpath("(//input[@value='1.000'])[1]");
		private By ReducedTax = By.xpath("(//input[@value='6.000'])[1]");
		
		//RRN:
		private By RRN = By.xpath("//*[@id=\"myId\"]/div/table/tbody/tr/td/table/tbody/tr/td/table[4]/tbody/tr[1]/td/div/table[8]/tbody/tr/td/text()[1]");
		private By ReceiptClose= By.xpath("(//i[@title='Close'])[2]");
		
	    //TipAdjust
		
	private By TipAmount = By.xpath("//div[@class='MuiInputBase-root MuiInput-root MuiInput-underline MuiInputBase-formControl MuiInput-formControl MuiInputBase-adornedStart MuiInputBase-marginDense MuiInput-marginDense'])[1]");
	private By Close = By.xpath("//span[contains(text(),'Close')]");

	public ISOPage(WebDriver driver) {
		this.driver = driver;
	}

	public void add() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(MerchantAddOption).click();
	}

	public void fullbr() throws InterruptedException {
		driver.findElement(fullboard).click();
	}

	public void creatmerchant(String dbaname, String LegalName, String FirstName, String LastName, String mail,
			String UserName, String Phone, String add,String ZipCode) throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(dba).sendKeys(dbaname);
		driver.findElement(legalname).sendKeys(LegalName);
		driver.findElement(firstname).sendKeys(FirstName);
		driver.findElement(lastname).sendKeys(LastName);
		driver.findElement(email).sendKeys(mail);
		driver.findElement(username).sendKeys(UserName);
		driver.findElement(phone).sendKeys(Phone);
		driver.findElement(address).sendKeys(add);
		driver.findElement(zipcode).sendKeys(ZipCode);
		

//driver.findElement(city).sendKeys("Newyork");

	}

	public void tz2() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(timezone).click();
		List<WebElement> tZone2 = driver.findElements(By.xpath("//li[@role='option']"));
		System.out.println("this size is" + tZone2.size());
		tZone2.get(1).click();

	}

	
	public void tz3() {
		
		driver.findElement(tzz).click();
		
		List<WebElement> tZone2 = driver.findElements(By.xpath("//li[@role='option']"));
		System.out.println("this size is" + tZone2.size());
		tZone2.get(1).click();
	}
	
	
	
	public void m2() throws InterruptedException {

		driver.findElement(mcc).click();
		Actions action = new Actions(driver);
		action.sendKeys("0763 - AGRICULTURAL CO-OPERATIVE", Keys.ARROW_DOWN, Keys.ENTER).perform();
	}
	
	
	
	public void stroecode() throws InterruptedException {
		driver.findElement(timezone).click();
		List<WebElement>tzzlist=driver.findElements(By.xpath("//li[@role='option']"));
		tzzlist.get(0).click();
		Thread.sleep(3000);
		driver.findElement(mcc).sendKeys("0763 - AGRICULTURAL CO-OPERATIVE");
	
		/*driver.findElement(mcc).sendKeys(Keys.ENTER);*/
		
		Actions action = new Actions(driver);
		
		action.sendKeys(Keys.ARROW_DOWN,Keys.ENTER).perform();
	}
	
	
	public void nxtbutton() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(nextBtn1).click();
		
		
	}

	public void adStore() {

		driver.findElement(addbtn).click();
		driver.findElement(nextBtn1).click();

	}

	public void Devic() {

		driver.findElement(deviceType).click();

		List<WebElement> terminal = driver.findElements(By.xpath("//li[@role='option']"));
		System.out.println("this size is" + terminal.size());
		terminal.get(4).click();

	}

	public void TsysprocType() {

		driver.findElement(processor).click();

		List<WebElement> allprocessor = driver.findElements(By.xpath("//li[@role='option']"));
		System.out.println("this size is" + allprocessor.size());
		allprocessor.get(0).click();

	}
	
	
	
	
	public void FDROMAHAprocType() {

		driver.findElement(prcssrType).click();

		List<WebElement> allprocessor = driver.findElements(By.xpath("//ul[@role='menu']/li"));
		System.out.println("this size is" + allprocessor.size());
		allprocessor.get(1).click();

	}
	
	public void FDRCardnetprocType() {

		driver.findElement(processor).click();

		List<WebElement> allprocessor = driver.findElements(By.xpath("//li[@role='option']"));
		System.out.println("this size is" + allprocessor.size());
		allprocessor.get(1).click();

	}
	public void FDRBuypassprocType() {

		driver.findElement(processor).click();

		List<WebElement> allprocessor = driver.findElements(By.xpath("//li[@role='option']"));
		System.out.println("this size is" + allprocessor.size());
		allprocessor.get(3).click();

	}
	
	public void FDRNashvilleType() {

		driver.findElement(processor).click();

		List<WebElement> allprocessor = driver.findElements(By.xpath("//li[@role='option']"));
		System.out.println("this size is" + allprocessor.size());
		allprocessor.get(4).click();

	}
	public void PostilionprocType() {

		driver.findElement(processor).click();

		List<WebElement> allprocessor = driver.findElements(By.xpath("//li[@role='option']"));
		System.out.println("this size is" + allprocessor.size());
		allprocessor.get(5).click();

	}

	public void dname() throws InterruptedException {

		driver.findElement(devname).sendKeys("auto");

		driver.findElement(debitShare).click();
		List<WebElement> dbshare = driver.findElements(By.xpath("//li[@role='option']"));
		dbshare.get(0).click();

		driver.findElement(dpfiscol).sendKeys("1E4095D616");

	}
	

	public void tsysdata(String MID, String VNO, String StoreNumber, String TremNo, String AgentBankNumber,
			 String Chain, String Agent,String CustomFee) throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(mid).sendKeys(MID);
		driver.findElement(vno).sendKeys(VNO);
		driver.findElement(stnumber).sendKeys(StoreNumber);
		driver.findElement(tm).sendKeys(TremNo);
		
		driver.findElement(agtnumber).sendKeys(AgentBankNumber);
		driver.findElement(chnumber).sendKeys(Chain);
		driver.findElement(agnt).sendKeys(Agent);
		driver.findElement(customfee).sendKeys(CustomFee);

	}
	
	public void EBT() throws InterruptedException {
		
		driver.findElement(ebtca).click();
		driver.findElement(ebtfd).click();
		driver.findElement(fnsno).sendKeys();
		
		
	}
	
	
	public void BinIndustry() throws InterruptedException {
	driver.findElement(bin).click();
	List<WebElement> bno = driver.findElements(By.xpath("//li[@role='option']"));
	bno.get(0).click();
	Thread.sleep(3000);
	driver.findElement(industry).click();
	List<WebElement> indselect = driver.findElements(By.xpath("//*[@id=\"menu-industry\"]/div[3]/ul/li"));
	indselect.get(3).click();
	}

		
	
	
	public void FDRDetails(String MID, String TID, String DomineName, String CustomFee) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(mid).sendKeys(MID);
		driver.findElement(tid).sendKeys(TID);
		driver.findElement(dominname).sendKeys(DomineName);
		driver.findElement(customfee).sendKeys(CustomFee);
	}
	

	public void dnxt() throws InterruptedException {

		driver.findElement(addde).click();
		Thread.sleep(3000);
//  driver.findElement(nextBtn).click();

		driver.findElement(no).click();

//  driver.findElement(more).click();
		driver.findElement(onboard).click();

	}

	public void activation1() throws InterruptedException {

		   JavascriptExecutor jse = (JavascriptExecutor)driver;
		     jse.executeScript("window.open()");
		   //  driver.get("https://accounts.google.com/");
		     
		     ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		     driver.switchTo().window(tabs.get(1));
		     
		      driver.get("https://mail.google.com/mail/u/0/#inbox");
		      
		     
		 	driver.findElement(ed).sendKeys("valorautomation@gmail.com");
		 	driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		 	Thread.sleep(3000);
		 	driver.findElement(ps).sendKeys("Amma7639552076");
		 	driver.findElement(By.id("passwordNext")).click();
		     
		      for(int i = 0; i<20; i++) {
		  		driver.findElement(By.xpath("//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")).click();
		  		//Thread.sleep(3000);
		  		driver.findElement(By.xpath("//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")).click();
		  		}
		  		
		  		driver.findElement(By.xpath("//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")).click();
		  		driver.findElement(By.xpath("//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")).click();
		  		Thread.sleep(40000);
		// driver.findElement(By.xpath("//body[1]/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/span[1]")).click();
		driver.findElement(By.xpath("(//span[@class='bqe'][normalize-space()='Registration'])[2]")).click();
		Thread.sleep(6000);
		WebElement newEML = driver.findElement(By.xpath("//td[@bgcolor='transparent']//p//span"));
		String getEML = newEML.getAttribute("innerHTML");
		System.out.println(getEML);
		driver.findElement(activate).click();
		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs1.get(2));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='app-login-main-content']//div[1]//div[1]//input[1]"))
				.sendKeys("Valor123");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Valor123");
		driver.findElement(By.xpath("//button[@type='sumbit']")).click();
		// ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		// driver.switchTo().window(tabs2.get(0));

		// driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")).click();

		driver.findElement(By.id("emailtype")).sendKeys(getEML);
		driver.findElement(By.id("passwordtype")).sendKeys("Valor123");
		driver.findElement(continueButton).click();
		// driver.findElement(loginButton).click();
		System.out.println("SUCESSFULLY BORDING FOR Merchant  " + " " + getEML);

	}

	public void quickBrd() throws InterruptedException {
		driver.findElement(MerchantAddOption).click();
		Thread.sleep(3000);
		List<WebElement> boardType = driver.findElements(By.xpath("//ul[@role='menu']/li"));
		boardType.get(1).click();
		// driver.findElement(quickBoard).click();
		Thread.sleep(3000);
		driver.findElement(offices).click();
		List<WebElement> ofcType = driver.findElements(By.xpath("//ul[@role='menu']/li"));
		ofcType.get(1).click();
		driver.findElement(dpfiscol).sendKeys("1E4095D616");
	}

	public void quickDevice() throws InterruptedException {

		driver.findElement(By.xpath("(//div[@role='button'])[1]")).click();
		List<WebElement> devcType = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		devcType.get(4).click();

	}

	public void quickBrdActivation() throws InterruptedException {

//Thread.sleep(3000);
		driver.findElement(quickDba).sendKeys("Flamingo");
//driver.findElement(legalname).sendKeys("Flproject");
		driver.findElement(By.name("firstname")).sendKeys("Automation");
		driver.findElement(quickLastname).sendKeys("shop");
		driver.findElement(quickEmail).sendKeys("valorautomation+qu2@gmail.com");
		driver.findElement(quickUsername).sendKeys("QuickBoardMerchant3");
		driver.findElement(quickPhone).sendKeys("7639552076");
		driver.findElement(quickAddress).sendKeys("salem");
		driver.findElement(quickZipcode).sendKeys("10018");
		driver.findElement(quickTimeZone).click();
		List<WebElement> devcType = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		devcType.get(4).click();

	}

	public void quickm2() throws InterruptedException {

		driver.findElement(quickMCC).click();
		Actions action = new Actions(driver);
		action.sendKeys("0763 - AGRICULTURAL CO-OPERATIVE", Keys.ARROW_DOWN, Keys.ENTER).perform();

	}

	public void quickprocessor() throws InterruptedException {

		driver.findElement(By.xpath("(//div[@role='button'])[3]")).click();
		List<WebElement> devcType = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		devcType.get(0).click();
		driver.findElement(DebitShare).click();
		List<WebElement> debitShareType = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		debitShareType.get(0).click();

	}

	public void quickCashDiscountSurcharge() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(mid).sendKeys("887000003191");
		driver.findElement(vno).sendKeys("75021670");
		driver.findElement(stnumber).sendKeys("5999");
		driver.findElement(tm).sendKeys("1515");
		driver.findElement(bin).click();
		List<WebElement> bno = driver.findElements(By.xpath("//li[@role='option']"));
		bno.get(0).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@role='button'])[7]")).click();
		List<WebElement> indselect = driver.findElements(By.xpath("(//ul[@role='listbox'])[1]/li"));
		indselect.get(3).click();
		driver.findElement(agtnumber).sendKeys("000000");
		driver.findElement(chnumber).sendKeys("111111");
		driver.findElement(agnt).sendKeys("0001");
//driver.findElement(ebtca).click();
//driver.findElement(ebtfd).click();
//driver.findElement(fnsno).sendKeys("1234567");
		driver.findElement(customfee).sendKeys("6000");
		driver.findElement(By.xpath("//span[contains(text(),'Add Merchant')]")).click();

	}

	
	
	public void ISOADD() throws InterruptedException {
		Thread.sleep(3000);
		 //driver.findElement(userMgtadd).click();
		 driver.findElement(userMgtadd).click();
	} 
		 
		 
         public void ISOADDUSER() throws InterruptedException {
        	 
         
		 driver.findElement(By.xpath("//span[normalize-space()='Add USER']")).click();
         }
	
         public void ADDSUBISO() throws InterruptedException {
         driver.findElement(By.xpath("//span[normalize-space()='Add SUB ISO']")).click();
         }
	public void ISOUSERDetails(String mail, String username, String phone, String firstname,
			String lastname) throws InterruptedException {
		
		
	     driver.findElement(email2).sendKeys(mail);
	     driver.findElement(UserName).sendKeys(username);
	     driver.findElement(Phone).sendKeys(phone);
	     driver.findElement(firstName).sendKeys(phone);
	     driver.findElement(lastName).sendKeys(firstname);
	     driver.findElement(nextBtn).click();
	     driver.findElement(submitbutton).click();
	     
	}
	public void activationISO1() throws InterruptedException {   
		
	     JavascriptExecutor jse = (JavascriptExecutor)driver;
	     jse.executeScript("window.open()");
	   //  driver.get("https://accounts.google.com/");
	     
	     ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	     driver.switchTo().window(tabs.get(1));
	     
	      driver.get("https://mail.google.com/mail/u/0/#inbox");
	     
	 	driver.findElement(ed).sendKeys("valorautomation@gmail.com");
	 	driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
	 	Thread.sleep(3000);
	 	driver.findElement(ps).sendKeys("Amma7639552076");
	 	driver.findElement(By.id("passwordNext")).click();
	     
	      for(int i = 0; i<20; i++) {
	  		driver.findElement(By.xpath("//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")).click();
	  		//Thread.sleep(3000);
	  		driver.findElement(By.xpath("//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")).click();
	  		}
	  		
	  		driver.findElement(By.xpath("//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")).click();
	  		driver.findElement(By.xpath("//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")).click();
	  		Thread.sleep(40000);
	  		//driver.findElement(By.xpath("//body[1]/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/span[1]")).click();
	  	    driver.findElement(By.xpath("(//span[@class='bqe'][normalize-space()='Registration'])[2]")).click();
	  	    Thread.sleep(6000);
	  		WebElement newEML =driver.findElement(By.xpath("//td[@bgcolor='transparent']//p//span"));
	  		String getEML=newEML.getAttribute("innerHTML");
	  		System.out.println(getEML);
	  	    driver.findElement(activate).click();
	  	    Thread.sleep(3000);
	  	  
	  	    // JavascriptExecutor jse1 = (JavascriptExecutor)driver;
	  	    // jse1.executeScript("window.open()");
	  	    //ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	  		 // driver.switchTo().window(tabs.get(2));
	  		  
	  		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
			  driver.switchTo().window(tabs1.get(2));
	  		  Thread.sleep(3000);
	  		  driver.findElement(By.xpath("//div[@class='app-login-main-content']//div[1]//div[1]//input[1]")).sendKeys("Valor123");
	  		  driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Valor123");
	  		  driver.findElement(By.xpath("//button[@type='sumbit']")).click();
	  		 // ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
	  		 // driver.switchTo().window(tabs2.get(0));
	  		
	  	//driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")).click();
	  	
	  	  driver.findElement(By.id("emailtype")).sendKeys(getEML);
	  	  driver.findElement(By.id("passwordtype")).sendKeys("Valor123");
	  	  driver.findElement(continueButton).click();
	  	  //driver.findElement(loginButton).click();
	  	  System.out.println("SUCESSFULLY BORDING FOR  "+ " "+getEML);
	  	  
	  	  
			/*
			 * Thread.sleep(3000);
			 * driver.findElement(By.xpath("(//div[@class='quick-menu dropdown'])[3]")).
			 * click();
			 * driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();
			 * 
			 * driver.close();
			 */
	  	 // Thread.sleep(3000);
	   	 //driver.findElement(By.xpath("(//div[@class='quick-menu dropdown'])[3]")).click();
	 	  //driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();
	     
	     
	     
	 }
		
		
	public void UserManagementModules() throws InterruptedException {
		
		driver.findElement(userMgtadd2).click();
		
	}
	

public void SubISO(String custname, String mail, String username, String phone, String firstname,
		String lastname, String add, String zip, String cit) throws InterruptedException {
	
	Thread.sleep(3000);
	driver.findElement(custName).sendKeys(custname);
	driver.findElement(email2).sendKeys(mail);
	driver.findElement(UserName).sendKeys(username);
	driver.findElement(Phone).sendKeys(phone);
	driver.findElement(firstName).sendKeys(firstname);
	driver.findElement(lastName).sendKeys(lastname);
	driver.findElement(address2).sendKeys(add);
	driver.findElement(zipCode).sendKeys(zip);
	driver.findElement(city1).sendKeys(cit);




	
	
	
	
	
	
}




public void clickNextButton() {
   driver.findElement(nextBtn).click();



}	


public void OMAHAprocessorType() {

	driver.findElement(prcssrType).click();
	List<WebElement> PrcsrType = driver.findElements(By.xpath("(//ul[@role='menu'])[1]/li"));
	System.out.println("Successfully clicked Processor Type" + PrcsrType.size());
	PrcsrType.get(1).click();

}

public void CARDNETProcessorType() {

	driver.findElement(prcssrType).click();
	List<WebElement> PrcsrType = driver.findElements(By.xpath("(//ul[@role='menu'])[1]/li"));
	System.out.println("Successfully clicked Processor Type" + PrcsrType.size());
	PrcsrType.get(2).click();

}

public void BUYPASSProcessorType() {

	driver.findElement(prcssrType).click();
	List<WebElement> PrcsrType = driver.findElements(By.xpath("(//ul[@role='menu'])[1]/li"));
	System.out.println("Successfully clicked Processor Type" + PrcsrType.size());
	PrcsrType.get(3).click();

}

public void NASHVILLEProcessorType() {

	driver.findElement(prcssrType).click();
	List<WebElement> PrcsrType = driver.findElements(By.xpath("(//ul[@role='menu'])[1]/li"));
	System.out.println("Successfully clicked Processor Type" + PrcsrType.size());
	PrcsrType.get(4).click();

}

public void POSTILIONProcessorType() {

	driver.findElement(prcssrType).click();
	List<WebElement> PrcsrType = driver.findElements(By.xpath("(//ul[@role='menu'])[1]/li"));
	System.out.println("Successfully clicked Processor Type" + PrcsrType.size());
	PrcsrType.get(5).click();

}


public void processorinfo() throws InterruptedException {
	
	driver.findElement(By.xpath("//div[@class='MuiInputBase-root MuiInput-root MuiInput-underline MuiInputBase-formControl MuiInput-formControl']//div[@id='demo-mutiple-chip']")).click();
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	Actions act = new Actions(driver);
	   
	   act.sendKeys(Keys.TAB).build().perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[2]")).click();
	
	
}

public void selectallmodule() {
   driver.findElement(selectmodule).click();
   driver.findElement(submitbutton).click();
}

public void activationISO2() throws InterruptedException {
	
	  
   JavascriptExecutor jse = (JavascriptExecutor)driver;
   jse.executeScript("window.open()");
 //  driver.get("https://accounts.google.com/");
   
   ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
   driver.switchTo().window(tabs.get(3));
   
    driver.get("https://mail.google.com/mail/u/0/#inbox");
   
		/*
		 * driver.findElement(ed).sendKeys("valorautomation@gmail.com");
		 * driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).
		 * click(); Thread.sleep(3000);
		 * driver.findElement(ps).sendKeys("Amma7639552076");
		 * driver.findElement(By.id("passwordNext")).click();
		 */
	for(int i = 0; i<20; i++) {
		driver.findElement(By.xpath("//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")).click();
		}
		
		driver.findElement(By.xpath("//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")).click();
		driver.findElement(By.xpath("//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")).click();
		Thread.sleep(40000);
		//driver.findElement(By.xpath("//body[1]/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/span[1]")).click();
	    driver.findElement(By.xpath("(//span[@class='bqe'][normalize-space()='Registration'])[2]")).click();
	    Thread.sleep(6000);
		WebElement newEML =driver.findElement(By.xpath("//td[@bgcolor='transparent']//p//span"));
		String getEML=newEML.getAttribute("innerHTML");
		System.out.println(getEML);
	    driver.findElement(activate).click();
	    ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		  driver.switchTo().window(tabs1.get(4));
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//div[@class='app-login-main-content']//div[1]//div[1]//input[1]")).sendKeys("Valor123");
		  driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Valor123");
		  driver.findElement(By.xpath("//button[@type='sumbit']")).click();
		 // ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		 // driver.switchTo().window(tabs2.get(0));
		
	//driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")).click();
	
	  driver.findElement(By.id("emailtype")).sendKeys(getEML);
	  driver.findElement(By.id("passwordtype")).sendKeys("Valor123");
	  driver.findElement(continueButton).click();
	  //driver.findElement(loginButton).click();
	  System.out.println("SUCESSFULLY BORDING FOR  "+ " "+getEML);
	  
	  
	    
}













public void SubIsoUser() throws InterruptedException {
	
	//driver.findElement(By.id("emailtype")).sendKeys("vigneshwaransanityiso32");
	  //driver.findElement(By.id("passwordtype")).sendKeys("Valor123");
	 // driver.findElement(continueButton).click();
	  
	driver.findElement(userMgtadd).click();
	driver.findElement(add).click();
	driver.findElement(By.xpath("//span[normalize-space()='ADD USER']")).click();
	
	 driver.findElement(email).sendKeys("valorautomation+addSubIsoUser@gmail.com");
    driver.findElement(UserName).sendKeys("SucssISOUSER3");
    driver.findElement(Phone).sendKeys("7655441254");
    driver.findElement(firstName).sendKeys("USERVIGNESH");
    driver.findElement(lastName).sendKeys("WARAN");
    driver.findElement(nextBtn).click();
    driver.findElement(submitbutton).click();
    Thread.sleep(3000);
  
    
    JavascriptExecutor jse = (JavascriptExecutor)driver;
    jse.executeScript("window.open()");
  //  driver.get("https://accounts.google.com/");
    
    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(tabs.get(5));
    
     driver.get("https://mail.google.com/mail/u/0/#inbox");
    driver.findElement(By.xpath("(//div[@class='TN bzz aHS-bnt'])[1]")).click();
    
     for(int i = 0; i<20; i++) {
 		driver.findElement(By.xpath("//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")).click();
 		//Thread.sleep(3000);
 		driver.findElement(By.xpath("//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")).click();
 		}
 		
 		driver.findElement(By.xpath("//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")).click();
 		driver.findElement(By.xpath("//body/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]")).click();
 		Thread.sleep(40000);
 		//driver.findElement(By.xpath("//body[1]/div[7]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/div[1]/div[1]/span[1]")).click();
 	    driver.findElement(By.xpath("(//span[@class='bqe'][normalize-space()='Registration'])[2]")).click();
 	    Thread.sleep(6000);
 		WebElement newEML =driver.findElement(By.xpath("//td[@bgcolor='transparent']//p//span"));
 		String getEML=newEML.getAttribute("innerHTML");
 		System.out.println(getEML);
 	    driver.findElement(activate).click();
 	    Thread.sleep(3000);
 	  
 	    // JavascriptExecutor jse1 = (JavascriptExecutor)driver;
 	    // jse1.executeScript("window.open()");
 	    //ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
 		 // driver.switchTo().window(tabs.get(2));
 		  
 		ArrayList<String> tabs1 = new ArrayList<String>(driver.getWindowHandles());
		  driver.switchTo().window(tabs1.get(6));
 		  Thread.sleep(3000);
 		  driver.findElement(By.xpath("//div[@class='app-login-main-content']//div[1]//div[1]//input[1]")).sendKeys("Valor123");
 		  driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Valor123");
 		  driver.findElement(By.xpath("//button[@type='sumbit']")).click();
 		 // ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
 		 // driver.switchTo().window(tabs2.get(0));
 		
 	//driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[3]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")).click();
 	
 	  driver.findElement(By.id("emailtype")).sendKeys(getEML);
 	  driver.findElement(By.id("passwordtype")).sendKeys("Valor123");
 	  driver.findElement(continueButton).click();
 	  //driver.findElement(loginButton).click();
 	  System.out.println("SUCESSFULLY BORDING FOR SubISOUser  "+ " "+getEML);
 	  
 	  Thread.sleep(3000);
 	 driver.findElement(By.xpath("(//div[@class='quick-menu dropdown'])[3]")).click();
	  driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();

    
    
    
    
    
}

	
	
	
	
	
	
	
public void selectallmodule1() {
	   driver.findElement(selectmodule).click();
	   driver.findElement(submitbutton).click();
	}
	

public void selectallmodule5() {
	   driver.findElement(selectmodule).click();
	   driver.findElement(submitbutton).click();
	}
	

	

public void selectallmodule2() {
   driver.findElement(selectmodule).click();
   driver.findElement(submitbutton).click();
}

	
public void selectallmodule6() {
	   driver.findElement(selectmodule).click();
	   driver.findElement(submitbutton).click();
	}
	
	
<<<<<<< HEAD
//DeviceManagement

public void DevicemanagementClick() {
	
	driver.findElement(DeviceManagement).click();
	
=======
	77777777777777777777777777
>>>>>>> 22907a547409bb4e0a3a84ea92b60248bd9771dc
	
}

public void DevicemanagementSearchBoxClick() throws InterruptedException {
	Thread.sleep(3000);

	driver.findElement(By.xpath("//input[@id='outlined-name']")).sendKeys("2211585113");
}


public void DevicemanagementThreeDotClick() throws InterruptedException {
	
	Thread.sleep(3000);
	driver.findElement(Threedot).click();
	Thread.sleep(3000);
	List<WebElement> devcType = driver.findElements(By.xpath("//ul[@role='menu']/li"));
	devcType.get(0).click();
}
	
public void TipFlagYes() throws InterruptedException {
	
	//WebElement elem = driver.find_element_by_id("myId")
		//	if elem.is_enabled():
			  //  elem.click()
			//else:
			  //  pass # whatever logic to handle...
	//driver.findElement(TipYesNo).click();
	//System.out.println("Tip Flag is Enabled");
	/*
	 * WebElement txt
	 * =driver.findElement(By.xpath("(//span[contains(text(),'YES')])[1]")); String
	 * text=txt.getAttribute("innerHTML"); System.out.println(text);
	 */
	
	//Select seclect = new Select(driver.findElement(By.xpath("(//span[contains(text(),'YES')])[1]")));
	//seclect.selectByVisibleText("YES");
	
	Thread.sleep(3000);
	// driver.findElement(By.xpath("//button[@style='font-size: 11px;border-right: 5px solid rgb(229, 63, 63);']")).click();
	 
	List<WebElement> selectYesNo = driver.findElements(By.xpath("(//div[@role='group'])[1]/button"));
	 WebElement toggleYes = selectYesNo.get(0);
	 WebElement toggleNo = selectYesNo.get(1);
	 Point TipYes = toggleYes.getLocation();
	 Point TipNo = toggleNo.getLocation();

	 if(TipYes.getX()==966)				//Tip Enabled
	 {
		 
		 Thread.sleep(3000);
	 	 driver.findElement(By.xpath("(//div[@class='quick-menu dropdown'])[3]")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();
		  driver.switchTo().alert().accept();
		  driver.findElement(By.id("emailtype")).sendKeys("vigneshradhakrishnan76+pinmerchant@gmail.com");
		  driver.findElement(By.id("passwordtype")).sendKeys("Valor123");
		  driver.findElement(continueButton).click();
		  Thread.sleep(3000);
		  driver.findElement(loginButton).click();
		  Thread.sleep(6000);
		  driver.findElement(virterminalclick).click();
	 }
	 else								//Tip Disabled
	 {
		 toggleYes.click();
		 driver.findElement(By.xpath("//span[contains(text(),'SAVE')]")).click();
		 Thread.sleep(3000);
	 	 driver.findElement(By.xpath("(//div[@class='quick-menu dropdown'])[3]")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();
		  driver.findElement(By.id("emailtype")).sendKeys("vigneshradhakrishnan76+pinmerchant@gmail.com");
		  driver.findElement(By.id("passwordtype")).sendKeys("Valor123");
		  driver.findElement(continueButton).click();
		  Thread.sleep(3000);
		  driver.findElement(loginButton).click();
		  Thread.sleep(6000);
		  driver.findElement(virterminalclick).click();
	 }
	 
	 
	/* boolean element;
	 * 
	if(element==true) {
	 
	 System.out.println("Yes ! Element is Present" + text);
	  
	 }
	 
	  else { System.out.println("NO ! Element is not Present"); if(nn=false) {
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("(//span[contains(text(),'YES')])[1]")).click();
	  } } */
	 
	//Boolean element = driver.findElement(By.xpath("(//span[contains(text(),'YES')])[1]\"))"));
	
	//if(nn==true) {
	
	  
    // System.out.println("Is element enabled on webpage: " + nn.
	//}
     
     
	 
	System.out.println("Successfully for the TipFlag is enabled");
	 
}
	
public void TipFlagNo() throws InterruptedException {
	
	//WebElement elem = driver.find_element_by_id("myId")
		//	if elem.is_enabled():
			  //  elem.click()
			//else:
			  //  pass # whatever logic to handle...
	//driver.findElement(TipYesNo).click();
	//System.out.println("Tip Flag is Enabled");
	/*
	 * WebElement txt
	 * =driver.findElement(By.xpath("(//span[contains(text(),'YES')])[1]")); String
	 * text=txt.getAttribute("innerHTML"); System.out.println(text);
	 */
	
	//Select seclect = new Select(driver.findElement(By.xpath("(//span[contains(text(),'YES')])[1]")));
	//seclect.selectByVisibleText("YES");
	
	Thread.sleep(3000);
	// driver.findElement(By.xpath("//button[@style='font-size: 11px;border-right: 5px solid rgb(229, 63, 63);']")).click();
	 
	List<WebElement> selectYesNo = driver.findElements(By.xpath("(//div[@role='group'])[1]/button"));
	 WebElement toggleYes = selectYesNo.get(0);
	 WebElement toggleNo = selectYesNo.get(1);
	 Point TipYes = toggleYes.getLocation();
	 Point TipNo = toggleNo.getLocation();

	 if(TipNo.getX()==970)				//Tip Enabled
	 {
		 Thread.sleep(3000);
		 Thread.sleep(20000);
	 	 driver.findElement(By.xpath("(//div[@class='quick-menu dropdown'])[3]")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();
		  driver.findElement(By.id("emailtype")).sendKeys("vigneshradhakrishnan76+pinmerchant@gmail.com");
		  driver.findElement(By.id("passwordtype")).sendKeys("Valor123");
		  driver.findElement(continueButton).click();
		  Thread.sleep(3000);
		  driver.findElement(loginButton).click();
		  Thread.sleep(6000);
		  driver.findElement(virterminalclick).click();
	 }
	 else								//Tip Disabled
	 {
		 toggleYes.click();
		 driver.findElement(By.xpath("//span[contains(text(),'SAVE')]")).click();
		 Thread.sleep(20000);
	 	 driver.findElement(By.xpath("(//div[@class='quick-menu dropdown'])[3]")).click();
		  driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();
		  driver.findElement(By.id("emailtype")).sendKeys("vigneshradhakrishnan76+pinmerchant@gmail.com");
		  driver.findElement(By.id("passwordtype")).sendKeys("Valor123");
		  driver.findElement(continueButton).click();
		  Thread.sleep(3000);
		  driver.findElement(loginButton).click();
		  Thread.sleep(6000);
		  driver.findElement(virterminalclick).click();
	 }
	 
	 
	/* boolean element;
	if(element==true) {
	 
	 System.out.println("Yes ! Element is Present" + text);
	  
	 }
	 
	  else { System.out.println("NO ! Element is not Present"); if(nn=false) {
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("(//span[contains(text(),'YES')])[1]")).click();
	  } } */
	 
	//Boolean element = driver.findElement(By.xpath("(//span[contains(text(),'YES')])[1]\"))"));
	
	//if(nn==true) {
	
	  
    // System.out.println("Is element enabled on webpage: " + nn.
	//}
     
     
	 driver.findElement(By.xpath("//span[contains(text(),'SAVE')]")).click();
	System.out.println("Successfully for the TipFlag is enabled");
	 
}
	
public void SaleTransaction() throws InterruptedException {	
	
	/*
	 * Thread.sleep(20000);
	 * driver.findElement(By.xpath("(//div[@class='quick-menu dropdown'])[3]")).
	 * click();
	 * driver.findElement(By.xpath("//span[contains(text(),'Logout')]")).click();
	 * driver.findElement(By.id("emailtype")).sendKeys(
	 * "vigneshradhakrishnan76+pinmerchant@gmail.com");
	 * driver.findElement(By.id("passwordtype")).sendKeys("Valor123");
	 * driver.findElement(continueButton).click(); Thread.sleep(3000);
	 * driver.findElement(loginButton).click(); Thread.sleep(3000);
	 * driver.findElement(virterminalclick).click();
	 */
		  
		  
	
}
	
	

public void epiD () throws InterruptedException {
	Thread.sleep(3000);
	   driver.findElement(epitype).click();
		
	List<WebElement> terminal = driver.findElements(By.xpath("//ul[@role='menu']/li"));
       System.out.println("this size is"+terminal.size());
    terminal.get(2).click();
    
}  


public void amount()  throws InterruptedException {
	
     
	Thread.sleep(3000);
	driver.findElement(amnt).sendKeys("1020");
	driver.findElement(phn).sendKeys("7639552000");
	driver.findElement(em).sendKeys("Vigneshwa11ran@valorpaytech.com");
	

}


public void cardNumber()  throws InterruptedException {
	  
	driver.findElement(cdnumber).sendKeys("4111111111111111");
	
}

public void CVV()  throws InterruptedException {
  	  
	driver.findElement(cvv).sendKeys("999");
	  
    driver.findElement(mmyy).sendKeys("12/25");
}

public void cardHolderName()  throws InterruptedException {
  	  
	driver.findElement(crdholdr).sendKeys("Vignesh");
	  

}
public void Process()  throws InterruptedException {
  	  
	driver.findElement(prcss).click();
	driver.findElement(prc).click();
	Thread.sleep(6000);
	driver.findElement(Close).click();

}

public void FindRRN() throws InterruptedException {
	
	Thread.sleep(6000);
	driver.findElement(Threedot).click();
	Thread.sleep(3000);
	List<WebElement> openbath = driver.findElements(By.xpath("//ul[@role='menu']/li"));  
    openbath.get(0).click();
	
	WebElement txt =driver.findElement(By.xpath("//*[@id=\"myId\"]/div/table/tbody/tr/td/table/tbody/tr/td/table[4]/tbody/tr[1]/td/div/table[8]/tbody/tr/td/text()[1]"));
	String text=txt.getAttribute("innerHTML");
	System.out.println("This Transaction RRN is " + text);
	
	
	
}

public void Txn() throws InterruptedException {

	driver.findElement(By.xpath("//span[contains(text(),'Transactions')]")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("outlined-name")).sendKeys("1111");
	
	Thread.sleep(6000);
	driver.findElement(Threedot).click();
	Thread.sleep(3000);
	List<WebElement> ViewReceipt = driver.findElements(By.xpath("//ul[@role='menu']/li"));  
	ViewReceipt.get(0).click();
	Thread.sleep(3000);
	WebElement txt =driver.findElement(By.xpath("(//td[contains(text(),'RRN')])[1]/br"));
	//String text1 = txt.getText();
	String text1=txt.getAttribute("innerHTML");
		System.out.println("This Transaction RRN is " + text1);
	

	driver.findElement(Threedot).click();
	Thread.sleep(6000);

	List<WebElement> openbath = driver.findElements(By.xpath("//ul[@role='menu']/li"));  
	openbath.get(1).click();
    System.out.println("Successfully clicked for OpenBatch");
    Thread.sleep(6000);
    driver.findElement(By.id("outlined-name")).sendKeys(text1);
   
	
}

	
public void ActionsOption() throws InterruptedException {
	Thread.sleep(6000);
	driver.findElement(By.xpath("//span[contains(text(),'Action')]")).click();
	List<WebElement> AddTip = driver.findElements(By.xpath("//ul[@role='menu']/li"));
	AddTip.get(2).click();
	
}


public void TipAdjustAmount() throws InterruptedException {

driver.findElement(By.xpath("(//input[@name='222917016476'])[1]")).sendKeys("200");
driver.findElement(By.xpath("(//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-4 MuiGrid-grid-md-2'])[2]")).click();
driver.findElement(By.xpath("//span[contains(text(),'OK')]")).click();

System.out.println("TipAdjust Successfull");





     }




}




