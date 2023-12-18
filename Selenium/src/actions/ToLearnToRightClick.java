package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnToRightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
WebElement addIcon = driver.findElement(By.xpath("//button[@id='add']"));
Actions act = new Actions(driver);
act.doubleClick(addIcon).perform();
driver.quit();



	}

}
