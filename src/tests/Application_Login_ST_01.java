package tests;

import libraries.BaseTest;

import org.testng.annotations.Test;

import pages.LoginPage;

public class Application_Login_ST_01 extends BaseTest
{

		@Test
		
		public void application_Login_ST_01()
		{
			LoginPage l1=new LoginPage(driver);
			l1.setUN("admin");
			l1.setPW("manager");
			l1.clickLogin();
			
		}

	}


