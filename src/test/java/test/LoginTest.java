package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashBoardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	
	WebDriver driver;
	
	@Test
	public void validUserShouldBeAbleToLogin() {
		driver = BrowserFactory.launchBrowser();
		
		//LoginPage login = new LoginPage();
		
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.enterUserName("demo@techfios.com");
		login.enterPassword("abc123");
		login.clickSignInButton();
		
		DashBoardPage dashboard = PageFactory.initElements(driver, DashBoardPage.class);
		dashboard.verifyDashBoardElement();
		
		BrowserFactory.tearDown();
	}

}
