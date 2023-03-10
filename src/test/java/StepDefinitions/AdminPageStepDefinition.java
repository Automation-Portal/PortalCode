package StepDefinitions;

import java.util.List;
import java.util.Map;

import com.qa.pages.*;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class AdminPageStepDefinition {

	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private AdminPage adminpage;
	private HomePage homePage;

	@Given("user has open a AdminPage")
	public void user_has_open_a_admin_page(DataTable credTable) throws InterruptedException {

		List<Map<String, String>> credList = credTable.asMaps();
		String userName = credList.get(0).get("username");
		String password = credList.get(0).get("password");
		DriverFactory.getDriver().get("https://uat.valorpaytech.com/signin");
		homePage = loginPage.doLogin(userName, password);
		adminpage = homePage.Adclick();

	}

	@When("user is on boarded a Iso")
	public void user_is_on_boarded_a_iso() throws InterruptedException {
		adminpage.addISO();
		adminpage.addcust();
		adminpage.createISO();
		adminpage.clickNextButton();
		adminpage.Processordetails();
		adminpage.clickNextButton();
		adminpage.clickNextButton();
		adminpage.selectallmodule();
		adminpage.activationISO();

	}

	@When("user is on boarded a Admin user")
	public void user_is_on_boarded_a_admin_user() throws InterruptedException {

		adminpage.AddUser();

	}

	@When("user is on boarded in a userlevel ISO")
	public void user_is_on_boarded_in_a_userlevel_iso() throws InterruptedException {
		adminpage.userLevelUM();
		adminpage.addISO();
		adminpage.addcust();
		adminpage.userLevelISO2();
		adminpage.clickNextButton();
		adminpage.Processordetails();
		adminpage.clickNextButton();
		adminpage.clickNextButton();
		adminpage.selectallmodule();
		adminpage.userLevelactivationISO2();

	}

	@When("user is to boarded a Iso")
	public void user_is_to_boarded_a_iso() throws InterruptedException {

		adminpage.addISO();
		adminpage.addcust();
		adminpage.createISO();
		adminpage.clickNextButton();
		adminpage.DPFiscal();
		adminpage.processorType();
		adminpage.FDOMAHA();
		adminpage.clickNextButton();
		adminpage.clickNextButton();
		adminpage.clickNextButton();
		adminpage.selectallmodule();
		adminpage.activationISO();

	}

	@When("user is to boarded a Admin user")
	public void user_is_to_boarded_a_admin_user() throws InterruptedException {
		adminpage.AddUser();

	}

	@When("user is the boarded in a userlevel ISO")
	public void user_is_the_boarded_in_a_userlevel_iso() throws InterruptedException {
		adminpage.userLevelUM();
		adminpage.addISO();
		adminpage.addcust();
		adminpage.userLevelISO2();
		adminpage.clickNextButton();
		adminpage.DPFiscal();
		adminpage.Processordetails();
		adminpage.FDOMAHA();
		adminpage.clickNextButton();
		adminpage.clickNextButton();
		adminpage.clickNextButton();
		adminpage.selectallmodule();
		adminpage.userLevelactivationISO2();

	}

}
