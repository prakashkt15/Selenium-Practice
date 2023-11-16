package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestWebtable {
public WebDriver driver;
	
	@BeforeMethod
	public void openApp()
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.dezlearn.com/webtable-example/");
	}
	
	@Test
	public void action()
	{
		WebtableExample we=new WebtableExample(driver);
		we.checkStdCheckbox();
		we.selectOption();
		we.clickButton();
		we.getMessage();
	}
	
	
//	@AfterMethod
//	public void closeApp()
//	{
//		driver.quit();
//	}
}
