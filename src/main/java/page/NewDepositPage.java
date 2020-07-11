package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class NewDepositPage extends BasePage{
	
WebDriver driver;
	
	public NewDepositPage(WebDriver driver) {
		
		this.driver = driver;
		
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[5]/a/span[1]")
	WebElement TRANSACTION_BUTTON_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[5]/ul/li[1]/a")
	WebElement NEW_DEPOSIT_BUTTON;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]")
	WebElement ACCOUNT_DROPDOW_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"description\"]")
	WebElement DESCRIPTION_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"amount\"]")
	WebElement AMOUNT_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"submit\"]")
	WebElement SUBMIT_DEPOSIT_FIELD;
	

	// Methods to interact with the elements
	public void clickTransactionButton() {
		TRANSACTION_BUTTON_FIELD.click();
	}
	
	public void clickNewDepositButton() {
		BasePage.waitForElement(driver, 3, By.xpath("//*[@id=\"account\"]"));
		NEW_DEPOSIT_BUTTON.click();
		
	}
	
	public void selectFromDropdown() {
		Select sel = new Select(ACCOUNT_DROPDOW_FIELD);
		sel.selectByVisibleText("Mean680");
	}
	
	public void insertDescription(String description) {
		DESCRIPTION_FIELD.sendKeys(description);
	}
	
	public void insertAmount(String amount) {
		AMOUNT_FIELD.sendKeys(amount);
	}
	
	public void clickSubmitDepositButton() {
		SUBMIT_DEPOSIT_FIELD.click();
	}
}
