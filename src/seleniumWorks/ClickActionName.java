package seleniumWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickActionName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		
		driver.get("file:///C:/Users/PRAKASH/Desktop/Selenium1.html");
		Thread.sleep(2000);
		
		driver.findElement(By.name("n1")).click();

	}

}
