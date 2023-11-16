package seleniumWorks;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FetchTitleUrlSrc {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String src = driver.getPageSource();
		System.out.println(src);
		
		driver.close();
		
	}
}
