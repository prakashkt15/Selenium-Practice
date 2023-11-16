package seleniumWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooCSS {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[title='Sign In']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("prakash.kt@yahoo.com");
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Ktp@15041999");
		
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[type='submit']")).click();

	}

}
