//package Pages;
//import io.cucumber.java.AfterStep;
//import io.cucumber.java.Scenario;
//import org.openqa.selenium.WebDriver;
//
//public class Hooks {
//	WebDriver driver= null;	
//
//    public Hooks(WebDriver driver) {
//        this.driver = driver;
//    }
//
//    @AfterStep
//    public void afterStep(Scenario scenario) {
//        String screenshotName = scenario.getName().replaceAll(" ", "_") + "_" + System.currentTimeMillis();
//        ScreenshotUtil.takeScreenshot(driver, screenshotName);
//    }
//}