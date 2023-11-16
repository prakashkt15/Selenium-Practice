package seleniumWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickActionClassName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		
		driver.get("file:///C:/Users/PRAKASH/Desktop/Selenium1.html");
		Thread.sleep(2000);
		
		driver.findElement(By.className("c1")).click();

	}

}
