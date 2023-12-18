package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Myntra {
	@Test(groups = "smoke")
	public void launchMyntra() {
		 WebDriver driver = new ChromeDriver();
		  driver.get("https://www.myntra.com/");
		Reporter.log("User logged in to myntra successfully..",true);
		
	}

}
