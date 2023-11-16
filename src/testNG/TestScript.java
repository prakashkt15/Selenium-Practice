package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestScript extends Generic {
	
	@Test
	public void login()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys("Admin");
		
		driver.findElement(By.id("pass")).sendKeys("1234");
		
		driver.findElement(By.name("login")).click();;
	}
}
