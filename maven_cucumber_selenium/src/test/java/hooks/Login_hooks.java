package hooks;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Login_hooks {
	public WebDriver driver;
	@Before("@login")
	public void open_chrome() {
		driver= new ChromeDriver();
	}
	@After("@login")
	public void close_chrome() {
		driver.close();
	}
}
