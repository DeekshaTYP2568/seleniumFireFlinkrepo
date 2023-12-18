package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotation {
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
		Reporter.log("BeforeClass test executed");
	}
	@org.testng.annotations.AfterClass
	public void AfterClass() {
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
	@Test
	public void demoTest() {
		Reporter.log("Demo test executed");
	}
	
	
	
	
}
