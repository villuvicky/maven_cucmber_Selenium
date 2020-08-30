package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Multiple_Login_def {
	WebDriver driver= new ChromeDriver();
	@Given("User will be landing on the login page")
	public void user_will_be_landing_on_the_login_page() {
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}




	@When("User enters {string}  and {string} from examples")
	public void user_enters_and_from_examples(String UserName, String Password) {

		driver.findElement(By.name("txtUsername")).sendKeys(UserName);
		driver.findElement(By.name("txtPassword")).sendKeys(Password);
	}
	@When("Hits on the Submittng button on the page")
	public void hits_on_the_submittng_button_on_the_page() {
		driver.findElement(By.name("Submit")).click();
	}
	@Then("User will be on Home of HRM")
	public void user_will_be_on_home_of_hrm() {

		boolean Text=driver.findElement(By.linkText("Welcome Admin")).isDisplayed();
		Assert.assertTrue(Text);
		driver.close();
	}

}







