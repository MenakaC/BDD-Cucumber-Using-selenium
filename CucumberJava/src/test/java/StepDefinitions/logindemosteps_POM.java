
  package StepDefinitions;
  
 import org.openqa.selenium.WebDriver; 
  import org.openqa.selenium.chrome.ChromeDriver;
  
  import Pages.loginpageclass; 
  
 import io.cucumber.java.en.And; 
 import io.cucumber.java.en.Given; 
 import io.cucumber.java.en.Then;
 import io.cucumber.java.en.When;
  
  public class logindemosteps_POM { 
	  WebDriver driver = null; 
	  loginpageclass login= null;
  
  @Given("user is on fblogin page")
  public void user_is_on_fblogin_page() throws InterruptedException {
  
  System.out.println("Inside the Step user is on login page");
  
  System.setProperty("webdriver.chrome.driver",
  "C:/Users/deepa/eclipse-workspace/CucumberJava/src/test/resources/Drivers/chromedriver.exe"
  );
  
  driver = new ChromeDriver();
  

	  Thread.sleep(2000);     
  
  // driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
  driver.manage().window().maximize();
  
  driver.navigate().to("https://www.facebook.com/"); }
  
  @When("^user enters the (.*) and (.*)$") 
  public void user_enters_the_username_and_password(String username,String password ) throws InterruptedException
  {
  login = new loginpageclass(driver);
  login.enterusername(username);
  login.enterpassword(password);
  
  System.out.println("Inside the Step user enters the username and password");
  
  // driver.findElement(By.id("email")).sendKeys(username);
  
  // driver.findElement(By.id("pass")).sendKeys(password);
  
 
  Thread.sleep(2000); 
   }
  
  @And("user clicks on submit button") 
  
  public void user_clicks_on_submit_button() throws InterruptedException {
	  
  System.out.println("Inside the Step user clicks on the submit button");
  
  login.clklogin(); 
  
  Thread.sleep(2000); 
  
  }
  
  @Then("user is navigated to fbhomepage") 
  
  public void user_is_navigated_to_fbhomepage() throws InterruptedException { 
	  
	 Thread.sleep(2000);
  
  System.out.println("Inside the Step user is navigated to homepage");
  
  }
  
  }
 