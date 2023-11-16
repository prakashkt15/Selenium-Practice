package seleniumWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckMultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/PRAKASH/Desktop/Dropdown.html");
		
		WebElement ele  = driver.findElement(By.xpath("//select[@id='A2B']"));
		Thread.sleep(2000);
		
		Select s = new Select(ele);
		boolean b = s.isMultiple();
		
		if (b) {
			System.out.println("It is multi select");
		} else {
			System.out.println("It is Single select");
		}

	}

}
