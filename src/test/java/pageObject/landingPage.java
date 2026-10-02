package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingPage {
	By search = By.xpath("//input[@type='search']");
	By productName = By.cssSelector("h4[class='product-name']");
	By topDealLink = By.linkText("Top Deals");
	By quantityIncrement = By.cssSelector(".increment");
	By addToCart = By.xpath("//button[contains(text(),'ADD TO CART')]");
	By clickCartImage = By.cssSelector("img[alt='Cart']");
	By proceedToCheckoutBtn= By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	WebDriver driver;
	
	public landingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void searchProduct(String name)
	{
		driver.findElement(search).sendKeys(name);
	}
	
	public String extractProductName()
	{
		return driver.findElement(productName).getText().split("-")[0].trim();
	}
	
	public void clikTopDeals()
	{
		driver.findElement(topDealLink).click();
	}
	
	public void quantityIncrement()
	{
		WebElement incrementBtn = driver.findElement(quantityIncrement);
		for(int i=0; i<3; i++)
		{
			incrementBtn.click();
		}	
	}
	
	public void addToCart()
	{
		driver.findElement(addToCart).click();
	}
	
	public void clickCartImage()
	{
		driver.findElement(clickCartImage).click();
	}
	
	public void proceedToCheckoutBtn()
	{
		driver.findElement(proceedToCheckoutBtn).click();
	}
}
