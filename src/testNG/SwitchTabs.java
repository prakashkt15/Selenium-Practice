package testNG;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchTabs {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.selenium.dev/");
		
		driver.findElement(By.linkText("Downloads")).click();
		
		Set<String> allid = driver.getWindowHandles();
		int count=allid.size();
		
		System.out.println(count);
		
		for (String string : allid) {
			System.out.println(string);
		}
	
		
		
	}
}
