package StepDefinitions;

import Pages.addingitemstocart;
import Pages.loginpage;
import io.cucumber.java.en.*;




public class ShoppingCartMain {
	
	loginpage login;
	
	addingitemstocart additem;
	
	@Given("Shoppingcart website is open")
	
	public void Shoppingcartsite_is_open() throws InterruptedException {
		  		 
	     Hooks.driver.navigate().to("https://www.saucedemo.com/");
	     
	     Thread.sleep(2000);	     	    
	}

	@When("^user enters the (.*) and (.*)$")
	
	public void user_enters_the_username_and_password(String username,String password) throws Exception {
	   
		login = new loginpage(Hooks.driver);

		Thread.sleep(2000);
		
		login.entercredentials(username,password);

	}

	@And("clicks on the submit button")
	
	public void clicks_on_the_submit_button() throws InterruptedException {
				
		login.clkloginbutton();
		
		Thread.sleep(2000);
	}

	@Then("user is navigated to homepage")
	
	public void user_is_navigated_to_homepage() {
	   
	}

	@And("list of categories are displayed")
	public void list_of_categories_are_displayed() {
	    
	}

 @Given("User is on the product listing page")
 
public void user_is_on_the_product_listing_page() throws InterruptedException {
	
	 	Thread.sleep(2000);
	 
		additem = new addingitemstocart(Hooks.driver);
		
		Thread.sleep(2000);
		
		additem.clkadditembutton();
		
		Thread.sleep(7000);		
}

@When("User selects with quantity adds it to the cart")

public void user_selects_with_quantity_adds_it_to_the_cart() throws InterruptedException {
	
	additem.clkaddtocartbutton();
	
	Thread.sleep(7000);
   
}

@Then("The product should be added to the cart")

public void the_product_should_be_added_to_the_cart() throws InterruptedException {
	
	additem.cartopenlink();
	
	Thread.sleep(3000);
	
	additem.continueshoppinglink();
	
	Thread.sleep(2000);
	
	additem.clkadditembutton2();
	
	Thread.sleep(2000);
	
	additem.clkaddtocartbutton();
	
	Thread.sleep(2000);
	
	additem.cartopenlink();
	
	Thread.sleep(3000);
	
}

@When("User proceeds to checkout")

public void user_proceeds_to_checkout() throws InterruptedException {
	
	additem.checkoutbtn();
	
	Thread.sleep(3000);
}

@Then("^User should enter the checkout Information (.*),(.*) and (.*)$")

public void user_should_enter_the_checkout_Information(String Firstname,String Lastname,String Postalcode) throws InterruptedException {
	
	additem.checkoutinfo(Firstname, Lastname, Postalcode);
	
	Thread.sleep(2000);
	
	additem.finalpage();
	
	Thread.sleep(2000);
}

}