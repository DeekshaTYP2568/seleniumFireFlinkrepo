package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();
		LoginPage lp = new LoginPage(driver);
		lp.getEmailTextField().sendKeys("deeksham0815@gmail.com");
		lp.getPasswordTextField().sendKeys("Deeksha08@");
		lp.getLoginButton().click();
		Thread.sleep(2000);
		HomePage hp = new HomePage(driver);
		hp.getLogoutLink().click();
		
		
		

	}

}
