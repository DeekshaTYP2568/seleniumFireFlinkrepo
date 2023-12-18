package actions;

import java.awt.desktop.SystemSleepEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Alert confirmpop = driver.switchTo().alert();
		System.out.println(confirmpop.getText());
		Thread.sleep(2000);
		
		confirmpop.accept();
		System.out.println(confirmpop.getText());
		confirmpop.accept();
		driver.quit();

	}

}
