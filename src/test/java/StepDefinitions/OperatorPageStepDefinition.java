package StepDefinitions;

import com.qa.pages.By;
import com.qa.pages.List;
import com.qa.pages.WebDriver;
import com.qa.pages.WebElement;

public class OperatorPageStepDefinition {

}
public class TransactionsPage {

	private WebDriver driver;
	

	private By tfilter = By.xpath("//span[contains(text(),'Recent')]");
	private By muifilter = By.xpath("//button[@type='button']//span//span//i");
	private By list = By.xpath("//ul[@role='menu']/li");
	private By transtype = By.xpath("(//span[contains(text(),'ALL')])[1]");
	private By trnstaus = By.xpath(
			"//body/div[@role='presentation']/div[@role='none presentation']/div[@role='dialog']/div/div/button[@name='Transaction_Status']/span[1]");
	pris