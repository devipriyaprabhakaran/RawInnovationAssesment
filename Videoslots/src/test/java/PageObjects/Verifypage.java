package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Verifypage {
	protected WebDriver driver;

	private	By text_usernametoverify =By.id("username");
	private	By button_continuetoverify =By.id("loginButton");
	private By text_passwordtoverify=By.id("password");
	private	By button_signintoverify=By.id("loginButton");
	private By source_verify=By.id("gwt-debug-NoteTitleView-textBox");


	public Verifypage(WebDriver driver) {

		this.driver=driver;
		if(!driver.getTitle().equals("Welcome Back")) {
			throw new IllegalStateException("This is not login page. The Current page is" +driver.getCurrentUrl());
		}
	}

	public void enterUsername(String username) {
		driver.findElement(text_usernametoverify).sendKeys("test12gmail.com");

	}
	public void clickContinue() {
		driver.findElement(button_continuetoverify).click();
	}

	public void enterPassword(String password) {
		driver.findElement(text_passwordtoverify).sendKeys("engrpriyaece");

	}
	public void clicksignin() {
		driver.findElement(button_signintoverify).click();
	}

	public void verifynotes() {
		driver.findElement(source_verify);
	}

}
