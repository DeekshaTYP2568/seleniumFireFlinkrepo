package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);//initialize element passing driver and this class object
	}
	@FindBy(id="Email")
	private WebElement emailTextField;//declare element
	
	@FindBy(id="Password")
	private WebElement passwordTextField;
	
	@FindBy(xpath="//input[@class='button-1 login-button']")
	private WebElement loginButton;
	
	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getEmailTextField() {
		return emailTextField;//getters to access elements
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	
	

}
