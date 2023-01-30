package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	private WebDriver driver;
	private WebDriverWait wait;

	private By email = By.id("emailtype");
	private By password = By.id("passwordtype");
	private By continueButton = By.xpath("//span[contains(text(),'Continue')]");
	private By portal_body = By.xpath("//div[@class='MuiToolbar-root MuiToolbar-regular app-toolbar MuiToolbar-gutters']");
	private By loginButton = By.xpath("//span[contains(text(),'YES')]");
	private By forgetPWDLink = By.xpath("//a[normalize-space()='Forgot Password']");
	private By submit = By.xpath("//span[contains(text(),'Submit')]");
	private By Ftext = By.xpath("//input[@type='text']");
	private By emailcre = By.name("loginfmt");
	private By NxtEm = By.id("idSIButton9");
	private By pass = By.xpath("//input[@id='password']");
	private By sub = By.id("submitBtn");
	private By MSYyes = By.xpath("//input[@id='idSIButton9']");
	private By DL = By.id("username");

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
	
	public void LoginButton() throws InterruptedException {

        Thread.sleep(3000);
        wait = new WebDriverWait(driver, 10);
        WebElement Lb = wait.until(ExpectedConditions.visibilityOfElementLocated(loginButton));
         if(Lb.isDisplayed()) {
             Lb.click(); 
         }
         WebElement HomePage = wait.until(ExpectedConditions.presenceOfElementLocated((portal_body)));
            if (HomePage.isDisplayed()) {
                driver.navigate().refresh();
            }

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
		driver.close();
	}

}
