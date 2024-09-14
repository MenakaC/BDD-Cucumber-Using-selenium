package StepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import Pages.ScreenshotUtil;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;


public class Googlesearchsteps {
	WebDriver driver = null;
	
	@Given("ChromeBrowser is open")
	public void Chromebrowser_is_open() {
	    System.out.println("Inside step-Browser is open");
	    System.setProperty("webdriver.chrome.driver","C:/Users/deepa/eclipse-workspace/CucumberJava/src/test/resources/Drivers/chromedriver.exe");
	     driver = new ChromeDriver();
	     
	     try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  	   
    	
	    // driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	     
	    }

	@And("User is on google search webpage")
	public void user_is_on_google_search_webpage() {
		 System.out.println("Inside step-User is on google search webpage");
		 driver.navigate().to("https://google.com");
		 driver.manage().window().maximize();
	}

	@When("User enters a text in search page")
	public void user_enters_a_text_in_search_page() {
		System.out.println("Inside step-user_enters_a_text_in_search_page");
		driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
	}

	@And("hits enter")
	public void hits_enter() {
		System.out.println("Inside step-hits enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("Inside step-user_is_navigated_to_search_results");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    	   
		
		driver.getPageSource().contains("Online Courses");
		driver.close();
		driver.quit();
	}
	/*@AfterStep
    public void afterStep(Scenario scenario) {
        String screenshotName = scenario.getName().replaceAll(" ", "_") + "_" + System.currentTimeMillis();
        ScreenshotUtil.takeScreenshot(driver, screenshotName);
 }*/
}
