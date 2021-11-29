package Stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.Loginpage;
import PageObjects.Mainpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainpagePOM {

	WebDriver driver;
	Mainpage main;

@And("User create new note")
	public void user_create_new_note() throws InterruptedException {

		Mainpage main = new Mainpage(driver);
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



}
