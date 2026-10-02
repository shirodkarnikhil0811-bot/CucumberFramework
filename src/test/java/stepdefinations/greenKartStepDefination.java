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
import pageObject.landingPage;
import pageObject.offerPage;
import utils.TestContextSetup;

public class greenKartStepDefination{
public WebDriver driver;
public String landingPageProductName;
public String kartPageProductName;
TestContextSetup testContextSetup;

public greenKartStepDefination(TestContextSetup testContextSetup)
{
	this.testContextSetup=testContextSetup;
}

public void switchTOChildWindow(){
	landingPage landingpage = testContextSetup.pageObjectManager.getlandingPage();
	landingpage.clikTopDeals();
	testContextSetup.genericUtils.switchTOChildWindow();
}
	
	
	@Then("^user searched (.+) product by shortname in offers page$")
	public void user_searched_product_by_shortname_in_offers_page(String shortName) {
		switchTOChildWindow();
		offerPage offerpage = testContextSetup.pageObjectManager.getofferpage();
		offerpage.searchProduct(shortName);
	    kartPageProductName = offerpage.extractProductName();
	    System.out.println(kartPageProductName+" is extracted from kart page");
	}

	
	@Then("validate name in offers page matches with Landing page")
	public void validate_name_in_offers_page_matches_with_landing_page() {
	    Assert.assertEquals(testContextSetup.landingPageProductName, kartPageProductName);
	}
}
