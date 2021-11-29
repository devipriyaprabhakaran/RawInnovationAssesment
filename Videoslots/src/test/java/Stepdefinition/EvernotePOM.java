package Stepdefinition;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.Loginpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class EvernotePOM {



	WebDriver driver;

	Loginpage login;
	

	@Given("User is on login page") 
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver","/Users/priya/eclipse-workspace/Videoslots/src/test/resources/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.evernote.com/Login.action");
		driver.manage().window().maximize();
	}

	@When("User enters the invalid email address")
	public void user_enters_the_invalid_email_address() {

		Loginpage login = new Loginpage(driver);
		login.enterUsername("test12gmail.com");

	}

	@And("User click continue button")
	public void user_click_continue_button() throws InterruptedException {
		Loginpage login = new Loginpage(driver);
		login.clickContinue();
		Thread.sleep(1000);

	}
	@Then("User should get that the notification that the email address is invalid")
	public void user_should_get_that_the_notification_that_the_email_address_is_invalid() throws InterruptedException {
		Loginpage login = new Loginpage(driver);
		login.verifynotification();
		Thread.sleep(1500);
		driver.close();
		driver.quit();
	}
	@Given("User is on login page again") 
	public void user_is_on_login_page_again() {
		System.setProperty("webdriver.chrome.driver","/Users/priya/eclipse-workspace/Videoslots/src/test/resources/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.evernote.com/Login.action");
		driver.manage().window().maximize();
	}

	@When("User enters the email address again")
	public void user_enters_the_email_address_again() {
		Loginpage login = new Loginpage(driver);
		login.enterUsernameagain("engrpriyaece");

	}

	@Then("User clicks continue button again")
	public void user_clicks_continue_button_again() throws InterruptedException {
		Loginpage login = new Loginpage(driver);
		login.clickContinueagain();
		Thread.sleep(1000);

	}

	@And("User enters password")
	
	public void user_enters_password() {
		Loginpage login = new Loginpage(driver);
		login.enterPassword("engrpriyaece");
		
	}

	@Then("User clicks signin button")
	public void user_clicks_signin_button() throws InterruptedException  {
		Loginpage login = new Loginpage(driver);
		login.clicksignin();
		Thread.sleep(3000);
	}



}
