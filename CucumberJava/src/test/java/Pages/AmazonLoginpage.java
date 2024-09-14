package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonLoginpage {
	WebDriver driver= null;	
	
	By mobile_name = By.name("email");
	
	By btn_Continue = By.id("continue");
	
	public AmazonLoginpage(WebDriver driver)
	
	{
		this.driver=driver;
		
		System.out.println("user is on Amazonloginpageclass");
		
	}
	
	public void entermobile(String Mobilenumber)

	{
		
		driver.findElement(mobile_name).sendKeys(Mobilenumber);
		
	}
	
	public void clkcontinuebutton()
	{
		driver.findElement(btn_Continue).click();
	}
			
}
