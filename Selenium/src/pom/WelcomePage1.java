package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage1 {
	public WelcomePage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	

	@FindBy(xpath="")
	private WebElement loginLink1;
	
	public WebElement getLoginLink1() {
		return loginLink1;
	}


}
