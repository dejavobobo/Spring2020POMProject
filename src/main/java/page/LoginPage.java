package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage{
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		
	}
	
	//Element Library
	/*WebElement WebElement_USERNAME_FIELD = driver.findElement(By.xpath("//*[@id=\"username\"]"));
	By USERNAME_FIELD_Locator = By.xpath("//*[@id=\"username\"]");*/
	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]") WebElement USERNAME_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]") WebElement PASSWORD_FIELD;
	@FindBy(how = How.NAME, using = "login") WebElement SIGNIN_BUTTON_FIELD;
	
	
	//Methods to interact with the elements
	public void enterUserName(String userName) {
		USERNAME_FIELD.sendKeys(userName);
	}
	
	public void enterPassword(String password) {
		PASSWORD_FIELD.sendKeys(password);
	}
	
	public void clickSignInButton() {
		SIGNIN_BUTTON_FIELD.click();
	}
	
	/*public void login(String userName, String password) {
		USERNAME_FIELD.sendKeys(userName);
		PASSWORD_FIELD.sendKeys(password);
		SIGNIN_BUTTON_FIELD.click();
	}*/
	

}
