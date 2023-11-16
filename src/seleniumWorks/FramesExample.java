package seleniumWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("file:///C:/Users/PRAKASH/Desktop/Mainpage.html");
		Thread.sleep(2000);
		
		driver.findElement(By.id("a1")).sendKeys("hello");
		
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("f1");
		
		WebElement ele = driver.findElement(By.xpath("//iframe[@id='f1']"));
		driver.switchTo().frame(ele);
		Thread.sleep(2000);
		
		driver.findElement(By.id("a2")).sendKeys("hiiii");
		

	}

}
