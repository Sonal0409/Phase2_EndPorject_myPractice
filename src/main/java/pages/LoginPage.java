package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;


public class LoginPage extends TestBase {

	@FindBy(linkText="Forgot your password?")
	WebElement fgt;
	
	@FindBy(id="email")
	WebElement email;
	
	@FindBy(id="passwd")
	WebElement pwd;
	
	@FindBy(id="SubmitLogin")
	WebElement signin;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateTitle()
	{
		return driver.getTitle();
	}
	
	public String forgetPassword()
	{
	
		return fgt.getText();
	}
	
	public void enterUsername()
	{
		email.sendKeys("sonal04@gmail.com");
	}
	
	public void enterpwd()
	{
		pwd.sendKeys("abc@123");
	}
	
	public void clicksignin()
	{
		signin.click();
	}
	
	

}
