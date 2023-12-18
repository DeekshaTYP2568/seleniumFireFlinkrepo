package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReference {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/login");
		LoginPage lp=new LoginPage(driver);
		lp.getEmailTextField().sendKeys("Testing");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		lp.getEmailTextField().sendKeys("12345678");
		
		
	}

}
