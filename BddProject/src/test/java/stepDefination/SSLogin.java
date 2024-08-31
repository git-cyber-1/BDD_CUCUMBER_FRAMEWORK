package stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SSLogin {
     
	public WebDriver driver;
	
	@Given("Browser is open and URL navigated")
	public void browser_is_open_and_url_navigated() {
	   driver =new ChromeDriver(); 
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.get("https://www.shoppersstack.com/");
	}

	@Given("Login page is displayed")
	public void login_page_is_displayed() {
	driver.findElement(By.id("loginBtn")) .click();  
	
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String userName, String Password) {
		driver.findElement(By.id("Email")).sendKeys(userName);
		driver.findElement(By.id("Password")).sendKeys(Password);
	  
	}

	@When("clicks on Login button")
	public void clicks_on_login_button() {
	   driver.findElement(By.linkText("Login")).click();}

	@Then("shopper should be sucessfully logged in")
	public void shopper_should_be_sucessfully_logged_in() {
	    
	}

	@Then("Close Browser")
	public void close_browser() {
	   
	}

	@Then("merchant should be sucessfully logged in")
	public void merchant_should_be_sucessfully_logged_in() {
	   
	}

	@When("user enters valid {string} and {string}")
	public void user_enters_valid_and(String string, String string2) {
	   
	}

	@Then("admin should be sucessfully logged in")
	public void admin_should_be_sucessfully_logged_in() {
	   
	}
	@Given("shopper login is displayed")
	public void shopper_login_is_displayed() {
	   Assert.assertTrue(driver.findElement(By.xpath("//strong[contains(.,'Shopper')]")).isDisplayed());
	}

	@Given("merchant login is displayed")
	public void merchant_login_is_displayed() {
	   
	
	}

	@Given("admin login is displayed")
	public void admin_login_is_displayed() {
	   
	}




	
	
}
