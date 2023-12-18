package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformActionsOnDisabledElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.oracle.com/java/technologies/downloads/");
		driver.findElement(By.xpath("(//a[@class='license-link icn-lock'])[1]")).click();
		
		WebElement disabledEle = driver.findElement(By.xpath("(//div[@class='obttns'])[1]"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()",disabledEle);
		
		
		/*driver.get("");
		driver.findElement(By.xpath("")).click();
		
		WebElement disabledEle = driver.findElement(By.xpath(""));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].value='hellooo'",disabledEle);*/
	}

}
