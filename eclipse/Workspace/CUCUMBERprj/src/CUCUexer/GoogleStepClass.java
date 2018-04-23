package CUCUexer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleStepClass {
	WebDriver d;
	@Given("the url of the webpage")
	public void url(){
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		d = new ChromeDriver(); 
		d.get("https://www.google.co.in/");
		System.out.println("URL entered");		
	}
	@And("Enter keywords for search")
	public void keys(){
		d.findElement(By.id("lst-ib")).sendKeys("Selenium");
		System.out.println("Keywords entered");		
	}
	@When("Given Enter")
	public void Enter(){
		d.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
		System.out.println("Enter key");
		
	}
	        @Then("Should search the keywords")
	        public void search(){
	        	d.getTitle();
	        	System.out.println("Search the word");
	        }
	

}
