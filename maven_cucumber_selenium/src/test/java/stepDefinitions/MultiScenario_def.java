package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultiScenario_def {
	WebDriver driver= new ChromeDriver();
	@Given("EndUser is on login page")
	public void end_user_is_on_login_page() {
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}




	@When("User going to enter valid username as {string} and password as {string}")
	public void user_going_to_enter_valid_username_as_and_password_as(String UserName, String Password) {
		driver.findElement(By.name("txtUsername")).sendKeys(UserName);
		driver.findElement(By.name("txtPassword")).sendKeys(Password);
	}
	@When("Clicking  on the Submit button")
	public void clicking_on_the_submit_button() {
		driver.findElement(By.name("Submit")).click();
	}
	@Then("User redirected to Home page")
	public void user_redirected_to_home_page() {
		try {
			String Text=driver.findElement(By.linkText("Welcome Admin")).getText();
			System.out.println("User is on login page");
		} catch (NoSuchElementException e) {
			String Text=driver.findElement(By.id("spanMessage")).getText();
			System.out.println("Entered wrong creds");
		}
		

		driver.close();	
	}


}
