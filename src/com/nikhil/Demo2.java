package com.nikhil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.dezlearn.com/webtable-example/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//tr[2]/td[3]/following-sibling::td[1]/input[@type='checkbox']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tr[2]/td[5]/select/option[2]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tr[2]/td[6]/input[@type='text']")).sendKeys("nikhil");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Update']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[.=' Details updated successfully.']"));
	}

}
