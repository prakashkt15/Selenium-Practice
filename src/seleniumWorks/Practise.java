package seleniumWorks;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		//driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@rel='async']")).click();
		
		WebElement ele = driver.findElement(By.xpath("//select[@id='day']"));
		
		Thread.sleep(2000);
		Select sc=new Select(ele);
		List<WebElement> opt = sc.getOptions();
		
		for (WebElement we : opt) {
			System.out.println(we.getText());
		}

	}

}
