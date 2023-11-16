package seleniumWorks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ZZZZZZZZZ {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		 List<WebElement> ele = driver.findElements(By.xpath("//a"));
		 int s = ele.size();
		 System.out.println(s);
		
		 for(WebElement w:ele)
		 {
			 w.getText();
		 }
		 for(int i=0;i<s;i++)
		 {
			 WebElement txt = ele.get(i);
			 String text = txt.getText();
			 System.out.println(text);
			 
		 }

		
		driver.close();
		
		
		

	}

}
