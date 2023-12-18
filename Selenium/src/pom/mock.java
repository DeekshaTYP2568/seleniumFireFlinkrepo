package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mock {
	public mock(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='username']")
	private WebElement userlogin;
	public WebElement getUserlogin() {
		return userlogin;
	}
	@FindBy(xpath="//input[@name='password']")
	private WebElement passwordtext;
	public WebElement getPasswordtext() {
		return passwordtext;
	}

}
