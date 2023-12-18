package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage1 {
	public  HomePage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getLogoutlink() {
		return logoutlink;
	}

	@FindBy
	private WebElement logoutlink;

}
