package actions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.ThreadSafe;

public class ToLearnAlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Alert alertpop = driver.switchTo().alert();
		System.out.println(alertpop.getText());
		Thread.sleep(20000);
		alertpop.accept();
		driver.quit();
		
		

	}

}
