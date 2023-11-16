package seleniumWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClearDataKeyboard {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		Thread.sleep(2000);
		driver.get("file:///C:/Users/PRAKASH/Desktop/keyboard.html");
		
		WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
		
		ele.sendKeys(Keys.CONTROL+"a");
		
		Thread.sleep(2000);
		ele.sendKeys(Keys.DELETE);
		
		

	}

}
