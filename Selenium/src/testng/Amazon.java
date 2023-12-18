package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon {
	@Test(groups = "smoke")
	public void launchAmazon() {
		 WebDriver driver = new ChromeDriver();
		  driver.get("https://www.amazon.in/");
		Reporter.log("User logged in to amazon successfully..",true);
		
	}

}