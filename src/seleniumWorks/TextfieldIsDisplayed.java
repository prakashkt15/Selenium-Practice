package seleniumWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextfieldIsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/PRAKASH/Desktop/Selenium.html");
		
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.xpath("//input[@type='text']"));
		boolean b = ele.isDisplayed();
		
		if (b) {
			System.out.println("Textfield is enabled");
		} else {
			System.out.println("Textfield is disabled");
		}

	}

}
