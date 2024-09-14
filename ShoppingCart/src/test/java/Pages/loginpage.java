package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {

WebDriver driver= null;	
	
	By user_name = By.name("user-name");
	
	By pass_word = By.name("password");
	
	By btn_login = By.id("login-button");
	
	public loginpage(WebDriver driver)
	
	{
		this.driver=driver;
		
		System.out.println("user is on loginpageclass");
		
	}
	
	public void entercredentials(String username,String password)

	{
		
		driver.findElement(user_name).sendKeys(username);
		
				
		driver.findElement(pass_word).sendKeys(password);
		
			
	}

	
	public void clkloginbutton()
	{
		driver.findElement(btn_login).click();
	}

	
}
