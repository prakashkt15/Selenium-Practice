package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic {
	public WebDriver driver;
	
	@BeforeMethod
	public void openApp()
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
	}
	
	@AfterMethod
	public void closeApp()
	{
		driver.quit();
	}
}


