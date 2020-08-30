package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WithoutHeader_def {


	WebDriver driver= new ChromeDriver();
	@Given("User lands on the login page")
	public void user_lands_on_the_login_page() {
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

	}



	@When("User enters username  and password from without header")
	public void user_enters_username_and_password_from_without_header(io.cucumber.datatable.DataTable dataTable) {

		List<List<String>> data = dataTable.asLists(String.class);
		String username=data.get(0).get(0);
		String password=data.get(0).get(1);
		driver.findElement(By.name("txtUsername")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);

	}


	@When("Clicks on the Submit button on the page")
	public void clicks_on_the_submit_button_on_the_page() {
		driver.findElement(By.name("Submit")).click();
	}
	@Then("User will land on Home page of HRM")
	public void user_will_land_on_home_page_of_hrm() {
		boolean Text=driver.findElement(By.linkText("Welcome Admin")).isDisplayed();
		Assert.assertTrue(Text);
		driver.close();
	}



}
