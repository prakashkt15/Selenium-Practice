package seleniumWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMapXpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/maps/@12.9982682,77.5507348,15z");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@class='eYqqWd']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='sb_ifc51']")).sendKeys("Davanagere");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='sb_ifc52']")).sendKeys("Bangalore");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"directions-searchbox-1\"]/button[1]")).click();
	}
}
