package seleniumWorks;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertAndConformationPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/v1/index.php");
		
		Thread.sleep(1000);
		driver.findElement(By.name("uid")).sendKeys("admin");
		
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("12345");
		
		Thread.sleep(1000);
		driver.findElement(By.name("btnLogin")).click();
		
		Alert a = driver.switchTo().alert();
		
		String t = a.getText();
		System.out.println(t);
		
		a.accept();
		

	}

}
