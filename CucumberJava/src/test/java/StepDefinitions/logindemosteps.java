/*
 * package StepDefinitions;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * import io.cucumber.java.en.And; import io.cucumber.java.en.Given; import
 * io.cucumber.java.en.Then; import io.cucumber.java.en.When;
 * 
 * public class logindemosteps { WebDriver driver = null;
 * 
 * @Given("user is on fblogin page") public void user_is_on_fblogin_page() {
 * 
 * System.out.println("Inside the Step user is on login page");
 * 
 * System.setProperty("webdriver.chrome.driver",
 * "C:/Users/deepa/eclipse-workspace/CucumberJava/src/test/resources/Drivers/chromedriver.exe"
 * ); driver = new ChromeDriver();
 * 
 * try { Thread.sleep(2000); } catch (InterruptedException e) { // TODO
 * Auto-generated catch block e.printStackTrace(); }
 * 
 * 
 * 
 * // driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
 * driver.manage().window().maximize();
 * driver.navigate().to("https://www.facebook.com/"); }
 * 
 * @When("^user enters the (.*) and (.*)$") public void
 * user_enters_the_username_and_password(String username,String password ) {
 * System.out.println("Inside the Step user enters the username and password");
 * driver.findElement(By.id("email")).sendKeys(username);
 * driver.findElement(By.id("pass")).sendKeys(password); try {
 * Thread.sleep(2000); } catch (InterruptedException e) { // TODO Auto-generated
 * catch block e.printStackTrace(); } }
 * 
 * @And("user clicks on submit button") public void
 * user_clicks_on_submit_button() {
 * System.out.println("Inside the Step user clicks on the submit button");
 * driver.findElement(By.name("login")).click(); try { Thread.sleep(2000); }
 * catch (InterruptedException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); }
 * 
 * }
 * 
 * @Then("user is navigated to fbhomepage") public void
 * user_is_navigated_to_fbhomepage() { try { Thread.sleep(2000); } catch
 * (InterruptedException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); }
 * 
 * System.out.println("Inside the Step user is navigated to homepage");
 * 
 * }
 * 
 * }
 */