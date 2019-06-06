package tests;

import java.awt.AWTException;

import org.testng.annotations.Test;


import pages.LoginPage;
import libraries.BaseTest;

public class Application_Help_Fetch extends BaseTest
{
    @Test	
	public void application_Help_Fetch() throws AWTException
	{
		LoginPage l1=new LoginPage(driver);
		l1.setUN("admin");
		l1.setPW("manager");
		l1.clickLogin();
		l1.clickHelp();		
	}
}
