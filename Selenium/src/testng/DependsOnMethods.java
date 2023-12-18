package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class DependsOnMethods {//testng class
	@Test(dependsOnMethods = "register")
	public void login() {//test cases
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("User logged in successfully..",true);
	}
	
	@Test(priority = -1)
	public void register() {//testcases
		 WebDriver driver = new ChromeDriver();
		  driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("User registered in successfully..",true);
		//org.testng.Assert.fail();
		
		
		
			
	}


}
