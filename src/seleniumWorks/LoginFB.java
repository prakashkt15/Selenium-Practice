package seleniumWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFB {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("admin");
		
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys("1234");
		
		Thread.sleep(1000);
		driver.findElement(By.name("login")).click();

	}

}
