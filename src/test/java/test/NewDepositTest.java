package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashBoardPage;
import page.LoginPage;
import page.NewDepositPage;
import util.BrowserFactory;

public class NewDepositTest {
	WebDriver driver;

	@Test
	public void validUserShouldBeAbleToAddNewDeposit() {
		driver = BrowserFactory.launchBrowser();

		// LoginPage login = new LoginPage();

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.enterUserName("demo@techfios.com");
		login.enterPassword("abc123");
		login.clickSignInButton();

		DashBoardPage dashboard = PageFactory.initElements(driver, DashBoardPage.class);
		dashboard.verifyDashBoardElement();
		
		NewDepositPage newDeposit = PageFactory.initElements(driver, NewDepositPage.class);
		newDeposit.clickTransactionButton();
		newDeposit.clickNewDepositButton();
		newDeposit.selectFromDropdown();
		newDeposit.insertDescription("Spring2020");
		newDeposit.insertAmount("500");
		newDeposit.clickSubmitDepositButton();
		
		

		//BrowserFactory.tearDown();
	}

}
