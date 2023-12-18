package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnScrollIntoView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	//	driver.get("https://www.shoppersstack.com/");
		//WebElement appleProd = driver.findElement(By.xpath("//span[text()='APPLE'][1]"));
		//JavascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("arguments[0].scrollIntoView(false)",appleProd);
		
		driver.get("https://www.naukri.com/registration/createAccount");
		WebElement whatsapp = driver.findElement(By.xpath("//span[@class='whatsappText']"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView(false)",whatsapp);
		

	}

}
