package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpageclass {
	
WebDriver driver=null;

	By txt_username = By.id("email");
	By txt_password = By.id("pass");
	By btn_login= By.name("login");
	
	public loginpageclass(WebDriver driver)
	{
		System.out.println("user is in =====login page POM==== class");
		this.driver = driver;
	}
	
	public void enterusername(String username)
	{
		driver.findElement(txt_username).sendKeys(username);
	
	}
	
	public void enterpassword(String password)
	{
		driver.findElement(txt_password).sendKeys(password);
	}
	public void clklogin()
	{
		driver.findElement(btn_login).click();
	}
		
}
