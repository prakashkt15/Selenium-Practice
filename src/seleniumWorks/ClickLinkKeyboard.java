package seleniumWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickLinkKeyboard {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		Thread.sleep(2000);
		driver.get("file:///C:/Users/PRAKASH/Desktop/Selenium1.html");
		
		WebElement ele = driver.findElement(By.xpath("//a[.='google']"));
		
		ele.sendKeys(Keys.ENTER);

	}

}
