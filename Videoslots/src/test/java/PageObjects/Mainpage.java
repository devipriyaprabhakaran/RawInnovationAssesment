package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Mainpage {
	protected WebDriver driver;
	
	
	private By button_create= By.id("gwt-debug-Sidebar-newNoteButton-container");
	private By text_note = By.id("gwt-debug-NoteTitleView-textBox");
	private By button_account =By.id("gwt-debug-AccountMenuView-root");
	private By button_logout = By.id("gwt-debug-AccountMenu-logout");
	
	public Mainpage(WebDriver driver) {
		this.driver=driver;
		
	}
	public void clicknew() {
		driver.findElement(button_account).click();
		
	}
	public void writenote(String notes) {
		driver.findElement(text_note).sendKeys("I am here to test");
	
	}
	public void clickaccount() {
		driver.findElement(button_account).click();
	}
	public void clicklogout() {
		driver.findElement(button_logout).click();
	}
	}

