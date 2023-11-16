package seleniumWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("//input[@id='email']"));
		
		int h = ele.getSize().getHeight();
		int w = ele.getSize().getWidth();
		
		System.out.println(h+" "+w);
		
		

	}

}
