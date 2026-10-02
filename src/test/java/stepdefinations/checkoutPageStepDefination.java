package stepdefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObject.CheckoutPage;
import pageObject.PageObjectManager;
import pageObject.landingPage;
import utils.TestContextSetup;

public class checkoutPageStepDefination {

	public WebDriver driver;
	public String landingPageProductName;
	public String kartPageProductName;
	public String checkoutProductName;
	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;

	public checkoutPageStepDefination(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
	}
	
//	public void switchToWindow() {
//		landingPage landingpage = testContextSetup.pageObjectManager.getlandingPage();
//		landingpage.clickCartImage();
//		landingpage.proceedToCheckoutBtn();
//		testContextSetup.genericUtils.switchTOChildWindow();	
//	}
	
	@Then("^the user navigates to the checkout page and verifies (.+) on the checkout page$")
    public void the_user_navigates_to_the_checkout_page_and_verifies_on_the_checkout_page(String shortProductName) throws InterruptedException {
		landingPage landingpage = testContextSetup.pageObjectManager.getlandingPage();
		landingpage.clickCartImage();
		landingpage.proceedToCheckoutBtn();
		Thread.sleep(10000);
		CheckoutPage checkoutPage = testContextSetup.pageObjectManager.getCheckoutPage();
		checkoutProductName = checkoutPage.productName();
		System.out.println(checkoutProductName+" is extracted from checkout page");		
	}
	
	@Then("the product name on the checkout page should match the landing page")
	public void the_product_name_on_the_checkout_page_should_match_the_landing_page() {
		Assert.assertEquals(testContextSetup.landingPageProductName, checkoutProductName);
	}
	
}
