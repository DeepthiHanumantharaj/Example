package pages;

import libraries.BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BaseTest
{
	@FindBy(name="username")
	private WebElement usTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(id="loginButton")
	private WebElement loginBtn;
	
	@FindBy(xpath="//span[contains(.,'Help')]")
	private WebElement helpBtn;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setUN(String un)
	{
		usTB.sendKeys(un);
	}
	
	public void setPW(String pw)
	{
		pwTB.sendKeys(pw);
	}
	
	public void clickLogin()
	{
		loginBtn.click();
	}
	
	public void clickHelp()
	{
		helpBtn.click();
	}

}
