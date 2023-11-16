package seleniumWorks;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DataDriven {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		FileInputStream fis=new FileInputStream("./Excel/DDT.xlsx");
		
		Workbook book=WorkbookFactory.create(fis);
		
		Sheet sheet = book.getSheet("Sheet1");
		
		Row row=sheet.getRow(0);
		Cell cell = row.getCell(0);
		String value1=cell.toString();
		
		Row row1=sheet.getRow(0);
		Cell cell1 = row1.getCell(1);
		String value2=cell1.toString();
		
		System.out.println(value1);
		System.out.println(value2);
		
		
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(value1);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(value2);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();


	}

}
