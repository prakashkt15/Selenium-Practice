package seleniumWorks;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunchClose {
	public static void main(String[] args) throws InterruptedException {
		String key = "webdriver.gecko.driver";
		String value = "./Softwares/geckodriver.exe";
		
		System.setProperty(key, value);
		FirefoxDriver driver = new FirefoxDriver();
		
		Thread.sleep(2000);
		
		driver.close();//close only 1 tab
		//
		driver.quit();//close complete browser
	}
}
