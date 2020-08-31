package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps_POM {
	
	WebDriver driver;
	WebElement name;
	WebElement password;
	WebElement login;
	LoginPage loginPage;
	
	@Given("Browser is open")
	public void browser_is_open() {
	    System.setProperty("webdriver.chrome.driver", "src/test/resources/Drivers/chromedriver-4");
	    driver = new ChromeDriver();

	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    		
	    		
	}

	@And("User is on login page")
	public void user_is_on_login_page() {
	    	    driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("^User enters valid (.*) and (.*)$")
	public void user_enters_valid_username_and_password(String username,String pass) {
		
		loginPage = new LoginPage(driver);
		loginPage.enterUsername(username);
		loginPage.enterPassword(pass);
		
		
		
		
		
		
//	    name = driver.findElement(By.id("name"));
//	    name.sendKeys(username);
//	    
//	    password = driver.findElement(By.id("password"));
//	    password.sendKeys(pass);
		
	}
	
	@And("User clicks on Login")
	public void user_clicks_on_login() {
		
		
//		driver.findElement(By.id("login")).click();
		
		loginPage.clickLogin();
	}

	@Then("User is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	    driver.findElement(By.id("logout")).isDisplayed();
//	    driver.close();
//	    driver.quit();
	}


}
