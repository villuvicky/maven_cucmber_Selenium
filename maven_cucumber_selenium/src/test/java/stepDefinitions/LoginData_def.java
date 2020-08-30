package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginData_def {
	WebDriver driver= new ChromeDriver();
	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

	}


	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String UserName, String Password) {
		driver.findElement(By.name("txtUsername")).sendKeys(UserName);
		driver.findElement(By.name("txtPassword")).sendKeys(Password);

	}
	@When("Clicks on the Submit button")
	public void clicks_on_the_submit_button() {
		driver.findElement(By.name("Submit")).click();
	}
	@Then("User should lands on Home page of HRM")
	public void user_should_lands_on_home_page_of_hrm() {
		boolean Text=driver.findElement(By.linkText("Welcome Admin")).isDisplayed();
		Assert.assertTrue(Text);
		driver.close();
	}



}
