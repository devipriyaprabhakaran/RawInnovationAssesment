package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {

	protected WebDriver driver;

	private	By text_username =By.id("username");
	private	By button_continue =By.id("loginButton");
	private	By text_notification=By.id("responseMessage");
	private	By text_usernameagain =By.id("username");
	private	By button_continueagain =By.id("loginButton");
	private By text_password=By.id("password");
	private	By button_signin=By.id("loginButton");


	public Loginpage(WebDriver driver) {

		this.driver=driver;
		if(!driver.getTitle().equals("Welcome Back")) {
			throw new IllegalStateException("This is not login page. The Current page is" +driver.getCurrentUrl());
		}
	}

	public void enterUsername(String username) {
		driver.findElement(text_username).sendKeys("test12gmail.com");

	}
	public void clickContinue() {
		driver.findElement(button_continue).click();
	}
	public void verifynotification() {
		driver.findElement(text_notification).isDisplayed();
		if(!driver.getPageSource().equals("There is no account for the username or email you entered.")) {
			throw new IllegalStateException("This is not login page. The Current page is" +driver.getCurrentUrl());
		}
		
	}
	public void enterUsernameagain(String username) {
		driver.findElement(text_username).sendKeys("engrpriyaece");

	}
	public void clickContinueagain() {
		driver.findElement(button_continue).click();

	}
	public void enterPassword(String password) {
		driver.findElement(text_password).sendKeys("engrpriyaece");

	}
	public void clicksignin() {
		driver.findElement(button_signin).click();
	}

	

}