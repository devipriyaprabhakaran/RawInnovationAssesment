package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pafefactory.LoginPage_PF;
import Pafefactory.Mainpage_PF;
import Pafefactory.Verifynotes_PF;
import PageObjects.Loginpage;
import PageObjects.Mainpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EvernotePF {
WebDriver driver= null;

LoginPage_PF login;
Mainpage_PF  main;

	@Given("User is on login page") 
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver","/Users/priya/eclipse-workspace/Videoslots/src/test/resources/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.evernote.com/Login.action");
		driver.manage().window().maximize();
	}

	@When("User enters the invalid email address")
	public void user_enters_the_invalid_email_address() {

		LoginPage_PF login = new LoginPage_PF(driver);
		login.enterUsername("test12gmail.com");

	}

	@And("User click continue button")
	public void user_click_continue_button() throws InterruptedException {
		LoginPage_PF login = new LoginPage_PF(driver);
		login.clickContinue();
		Thread.sleep(1000);

	}
	@Then("User should get that the notification that the email address is invalid")
	public void user_should_get_that_the_notification_that_the_email_address_is_invalid() throws InterruptedException {
		LoginPage_PF login = new LoginPage_PF(driver);
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
		LoginPage_PF login = new LoginPage_PF(driver);
		login.enterUsernameagain("engrpriyaece");

	}

	@Then("User clicks continue button again")
	public void user_clicks_continue_button_again() throws InterruptedException {
		LoginPage_PF login = new LoginPage_PF(driver);
		login.clickContinueagain();
		Thread.sleep(1000);

	}

	@And("User enters password")
	
	public void user_enters_password() {
		LoginPage_PF login = new LoginPage_PF(driver);
		login.enterPassword("engrpriyaece");
		
	}

	@Then("User clicks signin button")
	public void user_clicks_signin_button() throws InterruptedException  {
		LoginPage_PF login = new LoginPage_PF(driver);
		login.clicksignin();
		Thread.sleep(3000);
	}
	
	@And("User create new note")
	public void user_create_new_note() throws InterruptedException {

		Mainpage_PF main = new Mainpage_PF(driver);
		main.clicknew();
		Thread.sleep(1000);
		
		}

	@Then("User writes note")
	public void user_writes_note() {
		main.writenote("I am here to test");
	}

	@And("User clicks account")
	public void user_clicks_account() {
		main.clickaccount();
	}

	@Then("User clicks logout")
	public void user_clicks_logout() {
		main.clicklogout();
	}


	Verifynotes_PF verify;

	@Given("User is on login page to verify") 
	public void user_is_on_login_page_to_verify() {
		System.setProperty("webdriver.chrome.driver","/Users/priya/eclipse-workspace/Videoslots/src/test/resources/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.evernote.com/Login.action");
		driver.manage().window().maximize();
	}

	@When("User enters the invalid email address to verify")
	public void user_enters_the_invalid_email_address_to_verify() {

		Verifynotes_PF verify = new Verifynotes_PF(driver);
		verify.enterUsernametoverify("engrpriyaece");

	}

	@And("User click continue button to verify")
	public void user_click_continue_button_to_verify() throws InterruptedException {
		Verifynotes_PF verify = new Verifynotes_PF(driver);
		verify.clickContinuetoverify();
		Thread.sleep(1000);
	}
	@And("User enters password to verify")

	public void user_enters_password_to_verify() {
		Verifynotes_PF verify = new Verifynotes_PF(driver);
		verify.enterPasswordtoverify("engrpriyaece");

	}

	@Then("User clicks signin button to verify")
	public void user_clicks_signin_button_verify() throws InterruptedException  {
		Verifynotes_PF verify = new Verifynotes_PF(driver);
		verify.clicksignintoverify();
		Thread.sleep(3000);
	}
	@Then("User verify note")

	public void user_verify_note() {
		Verifynotes_PF verify = new Verifynotes_PF(driver);

		String url = "https://www.evernote.com/Home.action?login=true#n=f74b6417-d73a-444a-be40-fcdf5a5f19df&s=s318&ses=4&sh=2&sds=2&";
		driver.get(url);

		String t = "I am here to test";

		if ( driver.getPageSource().contains("I am here to test")){
			System.out.println("Text: " + t + " is present. ");
		} else {
			System.out.println("Text: " + t + " is not present. ");
		}

		driver.quit();

	}





}
