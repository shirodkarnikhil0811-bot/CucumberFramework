package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

	WebDriver driver;
	
	
	By productName = By.xpath("//p[@class='product-name']");
	
	public CheckoutPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String productName() 
	{
		return driver.findElement(productName).getText().split("-")[0].trim();
		
	}

}
