package stepDefination;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {

	WebDriver driver;
	
	@Given("Browser is open")
	public void browser_is_open() {
		    driver =new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   
		
	}

	@Given("url is navigated to register page")
	public void url_is_navigated_to_register_page() {
		 driver.get("https://demowebshop.tricentis.com/");
		 driver.findElement(By.partialLinkText("Register")).click();
	}

	@When("user enters valid credentials")
	public void user_enters_valid_credentials() {
	     Random ran=new Random();
	     int randNum=ran.nextInt(2000);
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("RamKumar");
		driver.findElement(By.id("LastName")).sendKeys("Verma");
		driver.findElement(By.id("Email")).sendKeys("ramkumar"+randNum+"@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Ram@3770");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Ram@3770");
	}

	@When("user clicks on register button")
	public void user_clicks_on_register_button() {
	   driver.findElement(By.xpath("//input[@value='Register']")).click();
	}

	@Then("a new account should be created")
	public void a_new_account_should_be_created() {
	   Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]")).isDisplayed());
	}

	@Then("browser should close")
	public void browser_should_close() {
	   driver.close();
	}



	
	
}
