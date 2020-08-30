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

public class WithHeader_def {

	WebDriver driver= new ChromeDriver();
	@Given("User will be on the login page")
	public void user_will_be_on_the_login_page() {
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}

	@When("User enters username  and password from with header")
	public void user_enters_username_and_password_from_with_header(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> creds=dataTable.asMaps(String.class, String.class);
		String UserName=creds.get(0).get("UserName");
		String Password=creds.get(0).get("Password");
		driver.findElement(By.name("txtUsername")).sendKeys(UserName);
		driver.findElement(By.name("txtPassword")).sendKeys(Password);

	}
	@When("Clicks on the Submittng button on the page")
	public void clicks_on_the_submittng_button_on_the_page() {
		driver.findElement(By.name("Submit")).click();
	}
	@Then("User will be on Home page of HRM")
	public void user_will_be_on_home_page_of_hrm() {
		boolean Text=driver.findElement(By.linkText("Welcome Admin")).isDisplayed();
		Assert.assertTrue(Text);
		driver.close();
	}



}
