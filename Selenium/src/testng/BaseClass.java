package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public WebDriver driver;
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("beforeSuite test executed");
	}
	@AfterSuite
	public void afterSuite() {
		Reporter.log("afterSuite test executed");
	}
	@BeforeTest
	public void BeforeTest() {
		Reporter.log("BeforeTest test executed");
	}
	@org.testng.annotations.AfterTest
	public void AfterTest() {
		Reporter.log("AfterTest test executed");
	}
	@BeforeClass
	public void BeforeClass() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("BeforeClass test executed");
	}
	@org.testng.annotations.AfterClass
	public void AfterClass() {
		driver.quit();
		Reporter.log("AfterClass test executed");
	}
	@BeforeMethod
	public void BeforeMethod() {
		Reporter.log("BeforeMethod test executed");
	}
	@org.testng.annotations.AfterMethod
	public void AfterMethod() {
		Reporter.log("AfterMethod test executed");
	}
}
