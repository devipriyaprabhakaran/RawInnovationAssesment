package Pafefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PF {
	
	@FindBy(id="username")
	WebElement text_username ;
	
	@FindBy(id="loginButton")
	WebElement button_continue;
	
	@FindBy(id="responseMessage")
	WebElement text_notification;
	
	@FindBy(id="username")
	WebElement text_usernameagain;
	
	
	@FindBy(id="loginButton")
	WebElement button_continueagain;
	
	@FindBy(id="password")
	WebElement text_password;
	
	@FindBy(id="loginButton")
	WebElement button_signin;
	
	WebDriver driver;
	
	public LoginPage_PF(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, LoginPage_PF.class);
		
		
	}
	
	
	public void enterUsername(String username) {
		text_username.sendKeys("username");
		
	}
	public void clickContinue() {
		
		button_continue.click();
		}
	public void verifynotification() {
		text_notification.isDisplayed();
		if(!driver.getPageSource().equals("There is no account for the username or email you entered.")) {
			throw new IllegalStateException("This is not login page. The Current page is" +driver.getCurrentUrl());
		}
		

	}
	
	public void enterUsernameagain(String usernameagain) {
		text_usernameagain.sendKeys(usernameagain);

	}
	public void clickContinueagain() {
		button_continueagain.click();
	
	}
	public void enterPassword(String password) {
		text_password.sendKeys(password);
	
	}
	public void clicksignin() {
		button_signin.click();
		
	}

	
	
	
	
	
	
	
}
