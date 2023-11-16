package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testNG.Generic;
import testNG.WebtableExample;

public class BaseClass {

public WebDriver driver;
	
	@BeforeMethod
	public void openApp()
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.dezlearn.com/webtable-example/");
	}
	
	@AfterMethod
	public void closeApp(ITestResult res)
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			
		}
		driver.quit();
	}
}
