package pom;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class mock1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.instagram.com/");
		mock m1 = new mock(driver);
		m1.getUserlogin().sendKeys("deeksham@gmail.com");
		m1.getPasswordtext().sendKeys("abcd@123");

	}

}
