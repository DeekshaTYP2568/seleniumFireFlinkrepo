package listener;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerImplementation.class)//monitors test execution and generates runtime event
public class TestScript2 extends BaseClass {
	@Test
	public void login() {
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("deeksham0815@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Deeksha08@");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Assert.assertEquals(true, false);

}
}