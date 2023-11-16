package seleniumWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterClear5TextField {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/PRAKASH/Desktop/5TB.html");
		
		Thread.sleep(2000);
		driver.findElement(By.id("a1")).sendKeys("Admin");
		
		Thread.sleep(2000);
		driver.findElement(By.id("a2")).sendKeys("Admin");
		
		Thread.sleep(2000);
		driver.findElement(By.id("a3")).sendKeys("Admin");
		
		Thread.sleep(2000);
		driver.findElement(By.id("a4")).sendKeys("Admin");
		
		Thread.sleep(2000);
		driver.findElement(By.id("a5")).sendKeys("Admin");
		
		
		Thread.sleep(2000);
		driver.findElement(By.id("a1")).clear();
		
		Thread.sleep(2000);
		driver.findElement(By.id("a2")).clear();
		
		Thread.sleep(2000);
		driver.findElement(By.id("a3")).clear();
		
		Thread.sleep(2000);
		driver.findElement(By.id("a4")).clear();
		
		Thread.sleep(2000);
		driver.findElement(By.id("a5")).clear();
		
		driver.close();
		

	}

}
