package StepDefinitions;

import org.junit.Assert;

import com.qa.factory.DriverFactory;
import com.qa.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	private static String text;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

	@Given("user is on loginpage")
	public void user_is_on_loginpage() {
		DriverFactory.getDriver().get("https://uat.valorpaytech.com/signin");
	}

	@When("user enters username {string}")
	public void user_enters_username(String username) {

		loginPage.enterUserName(username);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
		loginPage.enterPassword(password);
	}

	@When("user clicks on continue button")
	public void user_clicks_on_continue_button() throws InterruptedException {
		loginPage.continueButton();
		loginPage.LoginButton();

	}

	@When("alert smsg for invalid credentials")
	public void alert_smsg_for_invalid_credentials() throws InterruptedException {
		loginPage.continueButton();
		loginPage.alertMsg();
		text =  loginPage.alertMsg();
		System.out.println("Invalid username or password" + text);
		
		

	}
	
	@Then("popup should be {string}")
	public void popup_should_be(String Expectedpopup) {
		
		//Assert.assertTrue(text.equals(Expectedpopup));
	
	}



	@When("user enters valid username {string}")
	public void user_enters_valid_username(String username) throws InterruptedException {
		loginPage.forgetPWD();
		loginPage.validUserName(username);

	}

	@When("user click submit button")
	public void user_click_submit_button() throws InterruptedException {
		loginPage.submit();
		loginPage.passwordLinkfromEmail();
		loginPage.clickEmail();

	}

	@When("user enters the invalid username {string}")
	public void user_enters_the_invalid_username(String username) throws InterruptedException {
		loginPage.forgetPWD();
		loginPage.inValidUserName(username);

	}

	@When("user click the submit button")
	public void user_the_click_submit_button() throws InterruptedException {
		loginPage.submit();
		

	}
}
