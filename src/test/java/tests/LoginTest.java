package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pageobjects.AccountPage;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import resources.Base;

public class LoginTest extends Base {
	WebDriver driver;

	@Test
	public void Login() throws IOException, InterruptedException {
		
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		
		LandingPage landingpage = new LandingPage(driver);
		landingpage.MyAccountDropdown().click();
		landingpage.loginoption().click();
		
		Thread.sleep(3000);
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.emailaddressfield().sendKeys(prop.getProperty("email"));
		loginPage.passwordfiled().sendKeys(prop.getProperty("password"));
		loginPage.loginbutton().click();
		
		AccountPage accountPage = new AccountPage(driver);
		
		Assert.assertTrue(accountPage.editAccountInformationOption().isDisplayed());
		
	}
	@AfterMethod
	public void closure() {
		driver.close();
		
	}
	
}
