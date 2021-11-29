package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.Loginpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifynotePOM {

	protected WebDriver driver;

	Loginpage verify;

	@Given("User is on login page") 
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver","/Users/priya/eclipse-workspace/Videoslots/src/test/resources/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.evernote.com/Login.action");
		driver.manage().window().maximize();
	}

	@When("User enters the invalid email address to verify")
	public void user_enters_the_invalid_email_address_to_verify() {

		Loginpage verify = new Loginpage(driver);
		verify.enterUsername("engrpriyaece");

	}

	@And("User click continue button to verify")
	public void user_click_continue_button_to_verify() throws InterruptedException {
		Loginpage verify = new Loginpage(driver);
		verify.clickContinue();
		Thread.sleep(1000);
	}
	@And("User enters password to verify")

	public void user_enters_password_to_verify() {
		Loginpage verify = new Loginpage(driver);
		verify.enterPassword("engrpriyaece");

	}

	@Then("User clicks signin button to verify")
	public void user_clicks_signin_button_verify() throws InterruptedException  {
		Loginpage verify = new Loginpage(driver);
		verify.clicksignin();
		Thread.sleep(3000);
	}
	@Then("User verify note")

	public void user_verify_note() {

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
