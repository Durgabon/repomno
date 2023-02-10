package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="input-email")
	WebElement emailaddressfield;
	
	@FindBy(id="input-password")
	WebElement passwordfiled;
	
	@FindBy(css="input[nalue='login']")
	WebElement loginbutton;
	
	
	public WebElement emailaddressfield() {
		return emailaddressfield;
			
	}
	
	public WebElement passwordfiled() {
		return passwordfiled;
	}
		
	public WebElement loginbutton() {
		return loginbutton;
		
		
		
	
	}

}
