package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnHiddenPopUp {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.makemytrip.com/");
		WebElement overlayFrame = driver.findElement(By.xpath("//iframe[@id='webklipper-publisher-widget-container-notification-frame']"));//to identify overlay frame
		driver.switchTo().frame(overlayFrame);
		driver.findElement(By.xpath("//a[@id='webklipper-publisher-widget-container-notification-close-div']")).click();//to close overlay
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();// to close modal
		
		driver.findElement(By.xpath("//p[@data-cy='departureDate']")).click();//calander popup(departure)
		driver.findElement(By.xpath("//div[text()='December 2023']/../..//p[text()='6']")).click();//june
		
		while(true) {
			try {
				driver.findElement(By.xpath("//div[text()='June 2024']/../..//p[text()='2']")).click();//june
				break;
			}catch(Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
		
		

	}

}
