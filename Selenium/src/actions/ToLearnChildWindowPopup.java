package actions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnChildWindowPopup {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.shoppersstack.com/products_page/3");
		driver.findElement(By.id("compare")).click();//to capature description button
		Set<String> allWindowIds = driver.getWindowHandles();
		
		for(String id:allWindowIds) {
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			if (url.contains("flipkart")) {
				break;
			}
		}
		Dimension size = driver.manage().window().getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		driver.close();
			
		}
		
		
		
		



	}


