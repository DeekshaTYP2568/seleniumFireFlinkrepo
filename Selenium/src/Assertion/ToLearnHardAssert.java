package Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnHardAssert {
	@Test
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("deeksham0815@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Deeksha08@");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	
		Assert.assertEquals(driver.getTitle(), "Demo Web","user failed to login");
		Reporter.log("user logged succesfully",true);
		
	
	}
}
