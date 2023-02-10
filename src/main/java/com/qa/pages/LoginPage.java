package com.qa.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	private WebDriver driver;
	private WebDriverWait wait;
	private By email = By.id("emailtype");
	private By password = By.id("passwordtype");
	private By continueButton = By.xpath("//span[contains(text(),'Continue')]");
	// private By loginButton = By.xpath("//span[contains(text(),'YES')]");
	private By portal_body = By
			.xpath("//div[@class='MuiToolbar-root MuiToolbar-regular app-toolbar MuiToolbar-gutters']");
	private By loginButton = By.xpath("//button[2]");
	private By forgetPWDLink = By.xpath("//a[normalize-space()='Forgot Password']");
	private By submit = By.xpath("//span[contains(text(),'Submit')]");
	private By Ftext = By.xpath("//input[@type='text']");
	private By emailcre = By.xpath("//input[@type='email']");
	private By NxtEm = By.id("idSIButton9");
	private By pass = By.xpath("//input[@id='password']");
	private By sub = By.id("submitBtn");
	private By MSYyes = By.xpath("//input[@id='idSIButton9']");
	private By DL = By.id("username");
	private By accounts = By.xpath("//div[@class='pQ0lne']/uL/li");

	private By notification = By.xpath("//div[@class='loader-view']");

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	public void enterUserName(String username) {
		driver.findElement(email).sendKeys(username);
	}

	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}

	public void continueButton() {
		driver.findElement(continueButton).click();

	}

	public void LoginButton() {

		try {
			wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'YES')]")));
			driver.findElement(loginButton).click();
		} catch (Exception e) {

		}

	}

	public String alertMsg() {

		return driver.findElement(notification).getText();

		// if(status=true) {
		// System.out.println("Error Alert- Invalid username or password" + status);

	}

	public void forgetPWD() {
		driver.findElement(forgetPWDLink).click();
	}

	public void validUserName(String username) throws InterruptedException {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Ftext));
		driver.findElement(Ftext).sendKeys(username);
	}

	public void submit() throws InterruptedException {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(submit)).click();
		;

	}

	public void inValidUserName(String username) throws InterruptedException {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Ftext));
		driver.findElement(Ftext).sendKeys(username);
	}

	public void passwordLinkfromEmail() throws InterruptedException {

		Thread.sleep(3000);

		driver.get("https://mail.google.com/mail/u/0/#inbox");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("imrajkumar815@gmail.com");
		driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Aadhvik@19");
		driver.findElement(By.xpath("//span[text()=\"Next\"]")).click();
		Thread.sleep(10000);
		driver.navigate().refresh();
		wait = new WebDriverWait(driver, 90);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='bog'])[1]"))).click();

		/*
		 * Actions processdown = new Actions(driver);
		 * processdown.moveToElement(driver.findElement(By.xpath(
		 * "(//span[@class='bog'])[1]"))).perform(); JavascriptExecutor executor =
		 * (JavascriptExecutor) driver; executor.executeScript("arguments[0].click();",
		 * driver.findElement(By.xpath("(//span[@class='bog'])[1]")));
		 */

		/*
		 * driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		 * driver.findElement(By.xpath("//input[@placeholder='Search mail']")).
		 * sendKeys("Reset Password Request "+Keys.ENTER);
		 * 
		 * wait = new WebDriverWait(driver, 30);
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//tr[@id=':2d']//td[4]"))).click();
		 */

		// List<WebElement> resetpwd =
		// driver.findElements(By.xpath("//span[@class='bog']"));

		// System.out.println("after xpath:" +resetpwd.size());
		/*
		 * for(int i=0;i<resetpwd.size();i++){ System.out.println(resetpwd.size());
		 * 
		 * if (resetpwd.get(i).getText().contains("Reset Password Request")) {
		 * resetpwd.get(i).click(); break; }
		 * 
		 * }
		 */

	}
	// driver.findElement(By.xpath("(//tr[@id=':130'])[1]")).click();

	// System.out.println(a.size());
	/*
	 * for(int i=0;i<a.size();i++){ // System.out.println(a.get(i).getText());
	 * 
	 * boolean you = a.get(i).getText().equals("Reset Password Request");
	 * //if(a.get(i).getText().equals("Notify valorpos")){ . if(you==true) {
	 * 
	 * 
	 * } }
	 */

	public void clickEmail() throws InterruptedException {

		/*
		 * Actions processdown = new Actions(driver);
		 * processdown.moveToElement(driver.findElement(By.
		 * xpath("//u[normalize-space()='Click Here For Reset Password']"))).perform();
		 * JavascriptExecutor executor = (JavascriptExecutor) driver;
		 * executor.executeScript("arguments[0].click();", driver.findElement(By.
		 * xpath("//u[normalize-space()='Click Here For Reset Password']")));
		 */

		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//u[normalize-space()='Click Here For Reset Password']")))
				.click();

		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		// switch to new tab
		driver.switchTo().window(newTb.get(1));
		System.out.println("Page title of new tab: " + driver.getTitle());
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type=\"password\"])[1]")).sendKeys("Aadhvik@07");
		driver.findElement(By.xpath("(//input[@type=\"password\"])[2]")).sendKeys("Aadhvik@07");
		driver.findElement(By.xpath("(//span[contains(text(),'Confirm')])[3]")).click();

	}

	public HomePage doLogin(String un, String pwd) throws InterruptedException {
		driver.findElement(email).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(continueButton).click();
		Thread.sleep(3000);
		driver.findElement(loginButton).click();
		return new HomePage(driver);
	}

	public void tearDown() {
		driver.quit();
	}

}
