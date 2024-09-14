package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.AmazonLoginpage;
import Pages.Amazonpassword;
//import Pages.ScreenshotUtil;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logindemosteps_Amazon_POM {
	
	WebDriver driver = null;
	
	AmazonLoginpage amazonlogin= null;
	
	Amazonpassword Amazonpwd=null;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		System.out.println("Inside the Step user is on login page");
		
	    System.setProperty("webdriver.chrome.driver","C:/Users/deepa/eclipse-workspace/CucumberJava/src/test/resources/Drivers/chromedriver.exe");
	    
	     driver = new ChromeDriver();
	     
	     try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    	   
	    	
	    // driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     
	     driver.navigate().to("https://www.amazon.com/");
	     
	     try {
				Thread.sleep(15000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	     
	     driver.findElement(By.xpath("//span[@class='nav-line-1 nav-progressive-content' and text()='Hello, sign in']")).click();
	     
	     try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}	
	

	@When("^user enters the mobileno (.*)$")
	public void user_enters_the_mobilenumber(String Mobilenumber ) {
		
		amazonlogin = new AmazonLoginpage(driver);
		
		amazonlogin.entermobile(Mobilenumber);
		
				
		System.out.println("Inside the Step user enters the username and password");
		
//		driver.findElement(By.id("email")).sendKeys(username);
		
//		driver.findElement(By.id("pass")).sendKeys(password);
		 
		try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	@And("user clicks on the submit button")
	public void user_clicks_on_the_submit_button() {
		
		System.out.println("Inside the Step user clicks on the submit button");
		
		amazonlogin.clkcontinuebutton();
		//driver.findElement(By.name("login")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@And("^user enters the pwd (.*)$")
	public void user_enters_the_password(String Password ) {
		
		Amazonpwd= new Amazonpassword(driver);
		
		Amazonpwd.enterpassword(Password);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		System.out.println("Inside the Step user enters the username and password");
	}
	

	@And("user clicks on the Signin button")
	public void user_clicks_on_the_signin_button() {
		System.out.println("Inside the Step user clicks on the submit button");
		Amazonpwd.clicksubmitbutton();
		//driver.findElement(By.name("login")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Then("user is navigated to homepage")
	
	public void user_is_navigated_to_homepage() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Inside the Step user is navigated to homepage");
		
	}
	/*
	 * @AfterStep public void afterStep(Scenario scenario) { String screenshotName =
	 * scenario.getName().replaceAll(" ", "_") + "_" + System.currentTimeMillis();
	 * ScreenshotUtil.takeScreenshot(driver, screenshotName); }
	 */

}
