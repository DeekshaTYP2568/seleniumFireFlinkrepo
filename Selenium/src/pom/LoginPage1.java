package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 {
	public  LoginPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement getEmailtextfield1() {
		return emailtextfield1;
	}

	public WebElement getPasswordtextfield1() {
		return passwordtextfield1;
	}

	public WebElement getLogin1() {
		return login1;
	}

	@FindBy(id="")
	private WebElement emailtextfield1;
	
	@FindBy(id="")
	private WebElement passwordtextfield1;
	
	@FindBy(xpath="")
	private WebElement login1;
	

}
