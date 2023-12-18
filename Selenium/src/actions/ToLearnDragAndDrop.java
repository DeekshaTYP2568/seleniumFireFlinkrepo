package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnDragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement from = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement dest = driver.findElement(By.xpath("//div[@id='trash']"));
        Actions act=new Actions(driver);
        act.dragAndDrop(from, dest).perform();

	}

}
