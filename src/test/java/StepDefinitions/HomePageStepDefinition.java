package StepDefinitions;

import java.util.List;
import java.util.Map;


import com.qa.factory.DriverFactory;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomePageStepDefinition {
	
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private HomePage homePage;
	
	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable credTable) throws InterruptedException {
		
		System.out.println("user has already logged ");
		
		List<Map<String, String>> credList = credTable.asMaps();
		String userName = credList.get(0).get("username");
		String password = credList.get(0).get("password");
		 DriverFactory.getDriver()
		 .get("https://demo.valorpaytech.com/signin");
		 homePage = loginPage.doLogin(userName, password);	
	 
	}
	@When("user is on Home Page")
	public void user_is_on_home_page() {
		String title = homePage.getHomePageTitle();
		System.out.println("Home Page title is: " + title);
	}

	/* @When("user clicks user button")
	public void user_clicks_usermanagement_button() throws InterruptedException {
		Thread.sleep(3000);
		homePage.umclick();

	
	}*/
	

}
