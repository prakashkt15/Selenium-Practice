package seleniumWorks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeCSS {

	public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.youtube.com/");
	
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[name='search_query']")).sendKeys("selenium");
	
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
	
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("span[title='Selenium WebDriver with Java']")).click();

	}

}
