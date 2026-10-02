package stepdefinations;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.PageObjectManager;
import pageObject.landingPage;
import utils.TestContextSetup;

public class landingPageStepDefination{
public WebDriver driver;
public String landingPageProductName;
public String kartPageProductName;
TestContextSetup testContextSetup;
PageObjectManager pageObjectManager;

public landingPageStepDefination(TestContextSetup testContextSetup)
{
	this.testContextSetup=testContextSetup;
}
	
	@Given("User is on GreenKart landing page")
	public void user_is_on_green_kart_landing_page() {
		landingPage landingpage = testContextSetup.pageObjectManager.getlandingPage();
	}
	@When("^user searched the product by shortname (.+) and extracted actual product name$")
	public void user_searched_the_product_by_shortname_and_extracted_actual_product_name(String shortName) throws InterruptedException {
		landingPage landingpage = testContextSetup.pageObjectManager.getlandingPage();
		landingpage.searchProduct(shortName);
		Thread.sleep(2000);
		testContextSetup.landingPageProductName = landingpage.extractProductName();
		System.out.println(testContextSetup.landingPageProductName+" is extracted from home page");	
	}
	

	@When("the user increases the quantity by {int} and adds the product to the cart")
	public void the_user_increases_the_quantity_by_and_adds_the_product_to_the_cart(Integer quantity) {
		landingPage landingpage = testContextSetup.pageObjectManager.getlandingPage();
		landingpage.quantityIncrement();
		landingpage.addToCart();
	}
	
}
