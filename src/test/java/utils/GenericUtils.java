package utils;

import java.util.Iterator;
import java.util.Set;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import io.cucumber.messages.types.Duration;



public class GenericUtils {

public WebDriver driver;

public GenericUtils(WebDriver driver)
{
	this.driver=driver;
}

	public void switchTOChildWindow(){
	    //switch to child window
	    Set <String> s1 = driver.getWindowHandles();
	    Iterator<String> i1 = s1.iterator();
	    String parentWindow = i1.next();
	    String childWindow = i1.next();
	    driver.switchTo().window(childWindow);
	}
	
//	public WebElement waitForElementToAppear(By locator) {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//    }
}
