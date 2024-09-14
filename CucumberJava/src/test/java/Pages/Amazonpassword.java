package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Amazonpassword {
	
WebDriver driver=null;

By usr_Password = By.name("password");

By btn_submit= By.id("signInSubmit");

public Amazonpassword(WebDriver driver)

{
	this.driver=driver;
}

public void enterpassword(String Password)
{
	driver.findElement(usr_Password).sendKeys(Password);
}

public void clicksubmitbutton()
{
	driver.findElement(btn_submit).click();
}

}
