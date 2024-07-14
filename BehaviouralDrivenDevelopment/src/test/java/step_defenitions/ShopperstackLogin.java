package step_defenitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShopperstackLogin {

	/* the step-defenition methods need not be in the same order, they can 
	 * be in any order they execute based on the annotations*/
	
	public WebDriver driver;
	
	
	@Given("browser is open and url is navigated")
	public void browser_is_open_and_url_is_navigated() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	
	@Given("shopper login is displayed")
	public void shopper_login_is_displayed() {
		driver.get("https://www.shoppersstack.com/");
	}
	@When("user enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password) {
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
	}
	@When("clicks on login button")
	public void clicks_on_login_button() {
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
	}
	@Then("shopper should be successfully loggedin")
	public void shopper_should_be_successfully_loggedin() {
		Assert.assertTrue(driver.findElement(By.xpath("//h3[contains(text(),'Hello, ')]")).isDisplayed());
		
	}
	
	@Then("Browser must e closed")
	public void browser_must_e_closed() {
		driver.quit();
	}
	
}
	

	/*@Given("login page is displayed")
	public void login_page_is_displayed() {
	   System.out.println("merchant loggedin");
	}

	@When("merchant enters valid {string} and {string}")
	public void merchant_enters_valid_and(String string, String string2) {
	    System.out.println("merchant entered valid credentials");
	}

	@When("click on login button")
	public void click_on_login_button() {
	   
		System.out.println("clicked on login button");
	}

	@Then("merchant should be successfully loggedin")
	public void merchant_should_be_successfully_loggedin() {
	  System.out.println("merchant loggedin");
	}

	@When("admin enters valid {string} and {string}")
	public void admin_enters_valid_and(String string, String string2) {
	   
		System.out.println("admin enters valid credentials");
	}

	@Then("admin should be successfully loggedin")
	public void admin_should_be_successfully_loggedin() {
	   
		System.out.println("admin successfully loggedin");
	}
	
	@Given("admin login is displayed")
	public void admin_login_is_displayed() {
	  
		System.out.println("admin login is displayed");
		
	}
	
	@Given("merchant login is displayed")
	public void merchant_login_is_displayed() {
	   
		System.out.println("merchant login is displayed");
	}
	
	@Given("shopper login is displayed")
	public void shopper_login_is_displayed() {
	
		Assert.assertTrue(driver.findElement(By.xpath("//strong[contains(text(),'Shopper')]")).isDisplayed());
	
	}*/


