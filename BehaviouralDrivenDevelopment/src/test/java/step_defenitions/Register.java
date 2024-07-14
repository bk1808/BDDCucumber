package step_defenitions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {

	WebDriver driver;
	
	@Given("Browser is open")
	public void browser_is_open() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Given("url is navigated to register page")
	public void url_is_navigated_to_register_page() {
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		
	}
	
	
	@When("user enters valid credentials")
	public void user_enters_valid_credentials(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
        // | M | Test | manualtest | qs_manualtest@gmail.com | Password@123 |
		
		List<List<String>> data = dataTable.asLists();
		driver.findElement(By.xpath("//input[@value='"+data.get(0).get(0)+"']")).click();
		driver.findElement(By.id("FirstName")).sendKeys(data.get(0).get(1));
		driver.findElement(By.id("LastName")).sendKeys(data.get(0).get(2));
		driver.findElement(By.id("Email")).sendKeys(data.get(0).get(3));
		driver.findElement(By.id("Password")).sendKeys(data.get(0).get(4));
		driver.findElement(By.id("ConfirmPassword")).sendKeys(data.get(0).get(4));
	
	}
	
	/*
	 * @When("user enters valid credentials") public void
	 * user_enters_valid_credentials(DataTable dataTable) { // Write code here that
	 * turns the phrase above into concrete actions // For automatic transformation,
	 * change DataTable to one of // E, List<E>, List<List<E>>, List<Map<K,V>>,
	 * Map<K,V> or // Map<K, List<V>>. E,K,V must be a String, Integer, Float, //
	 * Double, Byte, Short, Long, BigInteger or BigDecimal. // // For other
	 * transformations you can register a DataTableType. // | M | Test | manualtest
	 * | qs_manualtest@gmail.com | Password@123 |
	 * 
	 * List<List<String>> data = dataTable.asLists();
	 * driver.findElement(By.xpath("//input[@value='"+data.get(1).get(0)+"']")).
	 * click(); driver.findElement(By.id("FirstName")).sendKeys(data.get(1).get(1));
	 * driver.findElement(By.id("LastName")).sendKeys(data.get(1).get(2));
	 * driver.findElement(By.id("Email")).sendKeys(data.get(1).get(3));
	 * driver.findElement(By.id("Password")).sendKeys(data.get(1).get(4));
	 * driver.findElement(By.id("ConfirmPassword")).sendKeys(data.get(1).get(4));
	 * 
	 * }
	 */
	/*
	 * @When("user enters valid credentials") public void
	 * user_enters_valid_credentials() {
	 * 
	 * driver.findElement(By.id("gender-male")).click();
	 * driver.findElement(By.id("FirstName")).sendKeys("Praveen");
	 * driver.findElement(By.id("LastName")).sendKeys("QAS");
	 * driver.findElement(By.id("Email")).sendKeys("uf_286@gmail.com");
	 * driver.findElement(By.id("Password")).sendKeys("admin@123");
	 * driver.findElement(By.id("ConfirmPassword")).sendKeys("admin@123");
	 * 
	 * }
	 */

	@When("clicks on register button")
	public void clicks_on_register_button() {
		
		driver.findElement(By.id("register-button")).click();
		
	}

	@Then("a new account should be created")
	public void a_new_account_should_be_created() {
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]")).isDisplayed());
		
	}

	@Then("browser must be closed")
	public void browser_must_be_closed() {
		
		driver.close();
		
	}

	
}
