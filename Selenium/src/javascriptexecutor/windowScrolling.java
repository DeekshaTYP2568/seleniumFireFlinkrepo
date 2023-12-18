package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowScrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//driver.get("https://demoapp.skillrary.com/");
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(2000);
		JavascriptExecutor jse=(JavascriptExecutor) driver;
	//	jse.executeScript("window.scrollBy(0,100)");
		//Thread.sleep(2000);
		//jse.executeScript("window.scrollTo(100,500)");
		
		jse.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		
		
		
	}

}
