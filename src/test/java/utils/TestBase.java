package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException 
	{
		FileInputStream fls = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties");
		Properties prop = new Properties();
		prop.load(fls);
		String url = prop.getProperty("QAUrl");
		
		if (driver==null)
		{
			if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
			{
			driver = new ChromeDriver();
			driver.get(url);
			}
			if(prop.getProperty("browser").equalsIgnoreCase("firefox"))//helps if someone write Firefox in capital letter in global.properties
			{
			// firefox code
			}
		}
		return driver;
	}

}
