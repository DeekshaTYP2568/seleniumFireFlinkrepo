package pom;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		HomePage1 hp1 = new HomePage1(driver);
		hp1.getLogoutlink().click();
		Thread.sleep(2000);
		WelcomePage1 wp1 = new WelcomePage1(driver);
		wp1.getLoginLink1().click();
		LoginPage1 lp1 = new LoginPage1(driver);
		lp1.getEmailtextfield1().sendKeys("");
		lp1.getPasswordtextfield1().sendKeys("");
		
		
		

	}

}
