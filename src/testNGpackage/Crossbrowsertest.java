package testNGpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Crossbrowsertest {

WebDriver driver;
	
	@Parameters("browser")
	@BeforeTest
	public void setup(String browser)
	{		
		if(browser.equalsIgnoreCase("Edge"))
		{	
		driver=new EdgeDriver();
	     }
		else if (browser.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();	
		}		
	}
	@Test
	public void test1()
	{
		driver.get("https://www.facebook.com/");
	}
}
