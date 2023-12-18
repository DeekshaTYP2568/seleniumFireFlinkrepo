package Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToLearnSoftAssert {
	@Test
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		SoftAssert softassert = new SoftAssert();
		Reporter.log("user navigated to login page",true);
		driver.get("https://demowebshop.tricentis.com/login");
		//softassert.assertEquals(driver.getTitle(), "Demo Web Shop.Login","failed to navigate");
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop.Login","failed to navigate");
		Reporter.log("user navigated to login page",true);
 		driver.findElement(By.id("Email")).sendKeys("deeksham0815@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Deeksha08@");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
		softassert.assertEquals(driver.getTitle(), "Demo shop","user failed to login");
		Reporter.log("user logged in successfully",true);
		softassert.assertAll();
	}
}
