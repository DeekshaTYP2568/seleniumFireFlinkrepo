package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDatafromPropertyFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//step1: create FIs/FR object
		FileInputStream fis = new FileInputStream("./testdata/commondata.properties");
		
		//step2: create respective file type object
		Properties prop = new Properties();
		prop.load(fis);
		
		//step3: call read methods
		String URL = prop.getProperty("url");
		System.out.println(URL);
		//String Email = prop.getProperty("emailid");
		//System.out.println(Email);
		//String Pwd = prop.getProperty("password");
		//System.out.println(Pwd);
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(URL);

	}

}
