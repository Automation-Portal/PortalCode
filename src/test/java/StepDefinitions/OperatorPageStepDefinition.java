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
	private By countfirmtile = By.xpath("//div[@class='_loading_overlay_overlay css-1oig5ex']");
	private By bottomcount = By.xpath("");
	private By Action = By.xpath("//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-sm-4 MuiGrid-grid-md-2']//span[@class='MuiButton-label']");
	private By Export = By.xpath("//span[contains(text(),'Export')]");
	private By Atax = By.xpath("//p[@class='MuiTypography-root MuiTypography-body1']");
	//all
	
	private By cardtypes = By.xpath("//button[@name='Card_Brands']//span//span//span[contains(text(),'ALL')]");
	
	

	public TransactionsPage(WebDriver driver) {
		this.driver = driver;

	}

	public void transactionsfilterclick() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(tfilter).click();
		List<WebElement> filter = driver.findElements(list);
		for (WebElement ftype : filter) {
			if (ftype.getText().equals("Yesterday")) {
				ftype.click();
				break;
			}
			
		}