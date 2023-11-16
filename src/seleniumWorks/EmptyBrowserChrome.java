package seleniumWorks;

import org.openqa.selenium.chrome.ChromeDriver;

public class EmptyBrowserChrome {

	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String value = "./Softwares/chromedriver.exe";
		
		System.setProperty(key, value);
		
		ChromeDriver driver = new ChromeDriver();

	}

}
