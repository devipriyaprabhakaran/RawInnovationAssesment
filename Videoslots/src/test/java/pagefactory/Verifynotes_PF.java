package Pafefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Verifynotes_PF {

	
	
	@FindBy(id="username")
	WebElement text_usernametoverify;
	
	
	@FindBy(id="loginButton")
	WebElement button_continuetoverify;
	
	@FindBy(id="password")
	WebElement text_passwordtoverify;
	
	@FindBy(id="loginButton")
	WebElement button_signintoverify;
	
	@FindBy(id="gwt-debug-NoteTitleView-textBox")
	WebElement verify_notes;
	
	
	
	WebDriver driver;
	
	public Verifynotes_PF(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, Verifynotes_PF.class);
		
		
	}
	

	public void enterUsernametoverify(String usernameagain) {
		text_usernametoverify.sendKeys(usernameagain);

	}
	public void clickContinuetoverify() {
		button_continuetoverify.click();
	
	}
	public void enterPasswordtoverify(String password) {
		text_passwordtoverify.sendKeys(password);
	
	}
	public void clicksignintoverify() {
		button_signintoverify.click();
		
	}

	public void verifynotes() {
	}
	
	}
	
	
	
	
