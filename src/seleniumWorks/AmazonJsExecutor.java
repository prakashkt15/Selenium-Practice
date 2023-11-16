package seleniumWorks;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonJsExecutor {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//a[.='Facebook']"));
		Point loc = ele.getLocation();
		System.out.println(loc);
		
		int x=loc.getX();
		System.out.println(x);
		
		int y=loc.getY();
		System.out.println(y);
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(18,2596)");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("");
		
		

	}

}
