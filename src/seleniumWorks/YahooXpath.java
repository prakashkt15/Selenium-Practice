package seleniumWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='text']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("prakash.kt@yahoo.com");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Next']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Ktp@15041999");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		

	}

}
