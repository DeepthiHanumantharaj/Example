package libraries;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest
{
	public WebDriver driver;
	static
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		
	}
	@Parameters({"browser"})
	@BeforeClass
	public void openApp(String browser)
	{
		Reporter.log("openApp", true);
		
		if(browser.equals("Chrome"))
		{
		driver=new ChromeDriver();
		}
		else if(browser.equals("Firefox"))
		{
			driver=new ChromeDriver();
		}
		else
			driver=new InternetExplorerDriver();
		
		driver.get("http://toshiba-pc/login.do");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@SuppressWarnings("null")
	@AfterMethod
	public void postCondition()
	{
		ITestResult iRes = null;
		if(iRes.getStatus()==ITestResult.FAILURE)
			
		{
			String s2=new Date().toString().replaceAll(":","_");
			TakesScreenshot t1=(TakesScreenshot) driver;
			File srcFile =t1.getScreenshotAs(OutputType.FILE);
			
			File destFile=new File("C:\\Users\\TOSHIBA\\Desktop\\selenium_project\\Example\\Screenshot"+iRes.getName()+s2+".png");
			
			try
			{
				FileUtils.copyFile(srcFile, destFile);
				
			}

			catch(IOException e)
					{
						
					}
		    }
		}
	
	@AfterClass
	public void closeApp()
	{
		driver.close();
	}
	
}




