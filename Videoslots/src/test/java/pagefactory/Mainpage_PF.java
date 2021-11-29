package Pafefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mainpage_PF {
	
	@FindBy(id="gwt-debug-Sidebar-newNoteButton-container")
	WebElement button_create ;
	
	@FindBy(id="gwt-debug-NoteTitleView-textBox")
	WebElement text_note;
	
	@FindBy(id="gwt-debug-AccountMenuView-root")
	WebElement button_account;
	
	@FindBy(id="gwt-debug-AccountMenu-logout")
	WebElement button_logout;


	
WebDriver driver;
	
	public Mainpage_PF(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, Mainpage_PF.class);
		}
	
	public void clicknew() {
		button_create.click();
		
	}
	public void writenote(String notes) {
		text_note.sendKeys("I am here to test");
	
	}
	public void clickaccount() {
		button_account.click();
	}
	public void clicklogout() {
		button_logout.click();
	}
	}
	
