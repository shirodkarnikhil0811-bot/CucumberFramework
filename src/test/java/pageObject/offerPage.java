package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class offerPage {
	
	By search = By.xpath("//input[@type='search']");
	By offerPageProductName = By.cssSelector("tbody tr td:nth-child(1)");
	
	WebDriver driver;
	
	public offerPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void searchProduct(String name)
	{
		driver.findElement(search).sendKeys(name);
	}
	
	public String extractProductName()
	{
		return driver.findElement(offerPageProductName).getText().trim();
	}
	
}
