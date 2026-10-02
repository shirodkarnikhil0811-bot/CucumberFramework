package pageObject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public landingPage landingpage;
	public offerPage offerpage;
	public CheckoutPage checkoutPage;
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public landingPage getlandingPage()
	{
		landingpage = new landingPage(driver);
		return landingpage;
	}
	
	public offerPage getofferpage()
	{
		offerpage = new offerPage(driver);
		return offerpage;
	}
	
	public CheckoutPage getCheckoutPage()
	{
		checkoutPage = new CheckoutPage(driver);
		return checkoutPage;
	}

}
