/*
 * package Pages;
 * 
 * import org.apache.commons.io.FileUtils; import
 * org.openqa.selenium.OutputType; import org.openqa.selenium.TakesScreenshot;
 * import org.openqa.selenium.WebDriver;
 * 
 * import java.io.File; import java.io.IOException;
 * 
 * public class ScreenshotUtil {
 * 
 * public static void takeScreenshot(WebDriver driver, String fileName) { //
 * Convert the WebDriver object to TakeScreenshot TakesScreenshot scrShot =
 * ((TakesScreenshot) driver);
 * 
 * // Call getScreenshotAs method to create an image file File srcFile =
 * scrShot.getScreenshotAs(OutputType.FILE);
 * 
 * // Move image file to a new destination File destFile = new
 * File("./screenshots/" + fileName + ".png");
 * 
 * // Copy file at destination try { FileUtils.copyFile(srcFile, destFile); }
 * catch (IOException e) { e.printStackTrace(); } } }
 * 
 */