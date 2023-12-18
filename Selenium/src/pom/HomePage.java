package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath="//a[@class='ico-logout']")
	private WebElement logoutLink;


	public WebElement getLogoutLink() {
		return logoutLink;
	}

}
