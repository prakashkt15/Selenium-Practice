package seleniumWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("file:///C:/Users/PRAKASH/Desktop/fileuploadpopup.html");
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.name("input file"));
	
		ele.sendKeys("\\C:\\Users\\PRAKASH\\Downloads\\NIKHILH.pdf\\");
		

	}

}
