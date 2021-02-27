package stepDefinitions;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_def extends ExtentReporsClass {

	ExtentTest testcase;
	WebDriver driver;
	
	@Given("User is on login page")
	public void user_is_on_login_page() throws AWTException, IOException {
		ExtentReportsreports();
		testcase=extent.createTest("Verify user is on loginpage");
		testcase.log(Status.INFO, "user is on login page");
		driver	= new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		testcase.log(Status.PASS, "user is on login page");

		Robot robot= new Robot();
		Dimension size=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle= new Rectangle(size);
		BufferedImage image= robot.createScreenCapture(rectangle);
		File file= new File("C:\\Users\\villu\\Documents\\test.png");
		ImageIO.write(image, "png", file);
		testcase.addScreenCaptureFromPath("C:\\Users\\villu\\Documents\\test.png");

	}


	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		testcase.log(Status.INFO, "user entered password");
	}
	@When("Clicks on Submit button")
	public void clicks_on_submit_button() {
		driver.findElement(By.name("Submit")).click();
		testcase.log(Status.INFO, "user clicked submit button ");
	}
	@Then("User should lands on Home page")
	public void user_should_lands_on_home_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean Text=driver.findElement(By.id("welcome")).isDisplayed();
		Assert.assertTrue(Text);
		testcase.log(Status.INFO, "user is on Home");
		extent.flush();
		driver.close();

	}


}
