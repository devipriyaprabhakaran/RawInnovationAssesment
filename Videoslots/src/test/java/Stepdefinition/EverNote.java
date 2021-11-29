//package Stepdefinition;
//
//import java.io.File;
//import java.util.Iterator;
//import java.util.Set;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.Timeouts;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import PageObjects.Unsuccessfulloginpage;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import junit.framework.Assert;
//
//public class EverNote {
//
//
//
//	WebDriver driver = null;
//
//	@Given("User is on login page") 
//	public void user_is_on_login_page() {
//		System.setProperty("webdriver.chrome.driver","/Users/priya/eclipse-workspace/Videoslots/src/test/resources/drivers/chromedriver");
//		driver = new ChromeDriver();
//		
//		driver.get("https://www.evernote.com/Login.action");
//		driver.manage().window().maximize();
//	}
//
//	@When("User enters the invalid email address")
//	public void user_enters_the_invalid_email_address() {
//		
//		driver.findElement(By.name("username")).sendKeys("test12gmail.com");
//
//	}
//
//	@And("User click continue button")
//	public void user_click_continue_button() throws InterruptedException {
//		driver.findElement(By.id("loginButton")).click();
//		Thread.sleep(1000);
//
//	}
//
//
//	@Then("User should get that the notification that the email address is invalid")
//	public void user_should_get_that_the_notification_that_the_email_address_is_invalid() throws InterruptedException {
//		driver.findElement(By.xpath("//div[@id='responseMessage']"));
//		Thread.sleep(1500);
//		driver.quit();
//	}
//
//
//	@When("User enters the email address")
//	public void user_enters_the_email_address() {
//
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("engrpriyaece");
//
//	}
//
//	@Then("User clicks continue button")
//	public void user_clicks_continue_button() throws InterruptedException {
//		driver.findElement(By.id("loginButton")).click();
//		Thread.sleep(2000);
//
//
//	}
//
//	@And("User enters password")
//	public void user_enters_password() {
//		driver.findElement(By.id("password")).sendKeys("engrpriyaece");
//	}
//
//	@Then("User clicks signin button")
//	public void user_clicks_signin_button() throws InterruptedException  {
//		driver.findElement(By.id("loginButton")).click();
//		Thread.sleep(3000);
//	}
//
//
//	@And("User create new note")
//	public void user_create_new_note()  {
//		driver.findElement(By.id("gwt-debug-Sidebar-newNoteButton-container")).click();
//
//	}
//
//	@Then("User writes note")
//	public void user_writes_note()  {
//		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div[2]/div[3]/div/div[2]/div/div[1]/div[1]/div/div")).sendKeys("test");
//
//	}
//
//
//	@And("User clicks account")
//	public void user_clicks_account() {
//		Actions actions = new Actions(driver);
//		WebElement logoutOption = driver.findElement(By.id("gwt-debug-AccountMenuView-root"));
//		actions.click(logoutOption);
//
//	}
//
//	@Then("User clicks logout")
//	public void user_clicks_logout()  {
//		driver.findElement(By.id("gwt-debug-AccountMenu-logout")).click();
//	}
//
//	@Given("User is on signin page")
//	public void user_is_on_signin_page() {
//		driver.get("https://www.evernote.com/Login.action");
//	}
//
//	@When("User enter mail address and clicks continue")
//	public void user_enter_mail_address_and_clicks_continue() {
//		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("engrpriyaece");
//		driver.findElement(By.id("loginButton")).click();
//
//	}
//
//
//	@Then("User enter password and click signin")
//	public void user_enter_password_and_click_signin() throws InterruptedException {
//		driver.findElement(By.id("password")).sendKeys("engrpriyaece");
//		driver.findElement(By.id("loginButton")).click();
//		Thread.sleep(3000);
//
//	}
//
//
//	@Then("User verify note")
//
//	public void user_verify_note() {
//
//		String url = "https://www.evernote.com/Home.action?login=true#n=f74b6417-d73a-444a-be40-fcdf5a5f19df&s=s318&ses=4&sh=2&sds=2&";
//		driver.get(url);
//
//		String t = "I am here to test";
//
//		if ( driver.getPageSource().contains("I am here to test")){
//			System.out.println("Text: " + t + " is present. ");
//		} else {
//			System.out.println("Text: " + t + " is not present. ");
//		}
//
//		driver.quit();
//
//	}
//
//}
