package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import Pages.loginpage;
import io.cucumber.java.en.*;

public class ShoppingCartMain {
	WebDriver driver= null;
	
	loginpage login=null;
	
	@Given("Shoppingcart website is open")
	
	public void Shoppingcartsite_is_open() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:/Users/deepa/eclipse-workspace/ShoppingCart/src/test/resources/Drivers/chromedriver.exe");
		
		 driver = new ChromeDriver();
		 
		 Thread.sleep(3000);
		 		 
	     driver.manage().window().maximize();
	     
	     driver.navigate().to("https://www.saucedemo.com/");
	     
	     Thread.sleep(2000);
	     	    
	}

	@When("^user enters the (.*) and (.*)$")
	
	public void user_enters_the_username_and_password(String username,String password) throws Exception {
	   
login = new loginpage(driver);

Thread.sleep(2000);
		
login.entercredentials(username,password);

	}

	@And("clicks on the submit button")
	
	public void clicks_on_the_submit_button() throws InterruptedException {
		
		login = new loginpage(driver);
		
		login.clkloginbutton();
		 
		Thread.sleep(2000);
	}

	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() {
	   
	}

	@And("list of categories are displayed")
	public void list_of_categories_are_displayed() {
	    
	}



}
