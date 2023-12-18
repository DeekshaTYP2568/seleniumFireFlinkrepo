package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ToLearnNotificationPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions settings = new ChromeOptions();//browser settings
		settings.addArguments("--disable-notifications");//add chromium commands
		//settings.addArguments("--incognito");
		
		ChromeDriver driver = new ChromeDriver(settings);//pass the settings to constructor
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.redbus.in/");
		//driver.findElement(By.xpath("")).click();

	}

}
