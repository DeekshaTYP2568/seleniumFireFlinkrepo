package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnnotationAttribute {
	@Test(priority = 2, invocationCount = 5,threadPoolSize = 5)
	public void login() {
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("User logged in successfully..",true);
	}
	
	@Test(priority = -1,enabled = false)
	public void register() {
		 WebDriver driver = new ChromeDriver();
		  driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("User registered in successfully..",true);
	}

}
