package CUCUexer;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class paraSTEPclass {
	WebDriver d;
	@Given("The (.*) of the page")
	public void url(){
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://www.google.co.in/");
		
	}
	
	
    @When("I check for the (.*) in step")
    public void keys(){
    	d.findElement(By.id("lst-ib")).sendKeys("");
    	    	
    }
    
    @Then("give enter")
    public void enter(){
    	d.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
    	
    }
}
