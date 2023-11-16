package seleniumWorks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenshotExample {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File("C:\\Users\\PRAKASH\\Pictures\\Camera Roll\\Flipkart.jpeg");
		FileUtils.copyFile(src, dst);
		
		driver.switchTo().window(null);

	}

}
