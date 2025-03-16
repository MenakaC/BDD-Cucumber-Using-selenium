package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class Hooks {
	
    public static WebDriver driver;

    @BeforeAll
    
    public static void setUp() throws InterruptedException {
    	
    	System.setProperty("webdriver.chrome.driver","C:/Users/deepa/eclipse-workspace/ShoppingCart/src/test/resources/Drivers/chromedriver.exe");
		
        driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        Thread.sleep(3000);
    }

    @AfterAll
    
    public static void tearDown() throws InterruptedException {
    	
    	Thread.sleep(10000);
    	
        if (driver != null) {
        	
            driver.quit();
        }
    }
 	
}
