package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class addingitemstocart {
	
 WebDriver driver;
 
 WebDriverWait wait;
 
 	By itemselect = By.xpath("//div[contains(text(),'Sauce Labs Backpack')]");
 
 	By itemselect2=By.xpath("//div[contains(text(),'Sauce Labs Bolt T-Shirt')]");
 
	By itemselection = By.id("page_wrapper");

	By addtocartbtn= By.xpath("//button[text()='Add to cart']");
	
	By cartopen = By.cssSelector("a.shopping_cart_link");
	
	By continueshopping = By.id("continue-shopping");
	
	By checkout= By.id("checkout");
	
	By InfoFirstname =By.id("first-name");
	
	By InfoLastname =By.id("last-name");
	
	By postalcode = By.id("postal-code");
	
	By Continuebtn =By.id("continue");
	
	By LastElement= By.id("finish");
	
	
	
public addingitemstocart(WebDriver driver)
	
	{
		this.driver=driver;
		
		this.wait = new WebDriverWait(driver,java.time.Duration.ofSeconds(100));
		
		System.out.println("user is on addingitemstocartclass");

	}
		
	public void clkadditembutton()
	
	{
		WebElement itemselectButton = wait.until(ExpectedConditions.elementToBeClickable(itemselect));
		
		itemselectButton.click();

	}
	public void clkaddtocartbutton()
	{
		WebElement itemselectButton = wait.until(ExpectedConditions.elementToBeClickable(addtocartbtn));
		
		itemselectButton.click();
		
	}

	public void cartopenlink() {
		
		WebElement cartopenlink = wait.until(ExpectedConditions.elementToBeClickable(cartopen));
		
		cartopenlink.click();
		
	}
	
	public void continueshoppinglink() {
		
		WebElement cartopenlink = wait.until(ExpectedConditions.elementToBeClickable(continueshopping));
		
		cartopenlink.click();
		
	}
	
	public void clkadditembutton2()
	
	{
		WebElement itemselectButton = wait.until(ExpectedConditions.elementToBeClickable(itemselect2));
		
		itemselectButton.click();

	}
	
	public void checkoutbtn()
	{
		WebElement itemselectButton = wait.until(ExpectedConditions.elementToBeClickable(checkout));
		
		itemselectButton.click();

	}
	
	public void checkoutinfo(String firstname,String lastname,String Postalcode) throws InterruptedException
	{
		driver.findElement(InfoFirstname).sendKeys(firstname);
		
		Thread.sleep(1000);
		
		driver.findElement(InfoLastname).sendKeys(lastname);
		
		Thread.sleep(1000);
		
		driver.findElement(postalcode).sendKeys(Postalcode);
		
		Thread.sleep(1000);
		
		driver.findElement(Continuebtn).click();		
}
	
	public void finalpage()
	{
		/*WebDriverWait wait = new WebDriverWait(driver,java.time.Duration.ofSeconds(10));
	wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".btn btn_action btn_medium cart_button")));

	List<WebElement> elements = driver.findElements(By.cssSelector(".your-element-class"));

	if (!elements.isEmpty()) {
	    elements.get(elements.size() - 1).click();
	} else {
	    System.out.println("No elements found!");
	}*/
		driver.findElement(LastElement).click();
	}
}

