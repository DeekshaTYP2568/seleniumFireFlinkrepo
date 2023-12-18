package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnToMouseHover {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://yonobusiness.sbi/login/yonobusinesslogin");
		WebElement menLink = driver.findElement(By.xpath("//a[@data-group='men']"));
		Actions act = new Actions(driver);
		act.moveToElement(menLink).perform();
		
	
		//act.moveByOffset(1211, 302).clickAndHold().perform();
		
	}

}
