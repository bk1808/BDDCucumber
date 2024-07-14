package step_defenitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {

	
	public WebDriver driver;

	String searchItem;
	
	@Given("welcome page should be displayed")
	public void welcome_page_should_be_displayed() {
	   
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		
	}

	/* in the below method i am using the regular expression to pass the 
	 * data other than string form ex: int 
	 * > inside brackets () give square brackets []
	 * > ([^"]*) inside the square brackets we need to add cap^, double invited
	 * " and after * the square bracket before bracket we need to specify * astrick
	 * ^ denotes we are giving regular expression
	 * * denotes we are accepting any kind of data
	 * > to use any kind of regular expression in step-defenition file
	 * we must provide ^cap in the begenning and $ dollar symbol at the end*/
	@When("^user enters \"([^\"]*)\" in search text field $")
	public void user_enters_in_search_text_field(String searchItem) {
		this.searchItem=searchItem;
		driver.findElement(By.id("small-searchterms")).sendKeys(searchItem);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
	}

	@Then("search results must be displayed")
	public void search_results_must_be_displayed() {
	   
		Assert.assertTrue(driver.findElement(By.name("Q")).getAttribute("value").contains(searchItem));
		driver.close();
		
	}


	
}
