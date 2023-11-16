package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebtableExample {
	
	//Declaration
	@FindBy(xpath="//tr[2]/td[3]/input[@type='checkbox']")
	private WebElement stdCheckbox;
	
	@FindBy(xpath="//tr[2]/td[5]/select/option[2]")
	private WebElement selectType;
	
	@FindBy(xpath="//button[.='Update']")
	private WebElement update;
	
	@FindBy(xpath="//p[.=' Details updated successfully.']")
	private WebElement message;
	
	
	//Initialization
	public WebtableExample (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void checkStdCheckbox()
	{
		stdCheckbox.click();
	}
	
	public void selectOption()
	{
		selectType.click();
	}
	
	public void clickButton()
	{
		update.click();
	}
	
	public void getMessage()
	{
		System.out.println(message.getText());
	}
}
