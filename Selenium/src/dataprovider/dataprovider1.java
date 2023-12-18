package dataprovider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider1 {
	
	@DataProvider
	public String[][] dataSender() {
		String[][] data = {{"",""},{"",""}};
		return data;
		
	}
	
	@Test(dataProvider = "dataSender")
	public void login(String[] cred) {
		 WebDriver driver = new ChromeDriver();
		 driver.getCurrentUrl();
		 
		 
	
		
	}

}
