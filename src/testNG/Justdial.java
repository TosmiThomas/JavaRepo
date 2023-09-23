package testNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeGroups;

import utilities.BeforeTest;
import utilities.EdgeDriver;
import utilities.EdgeOptions;
import utilities.Test;

public class Justdial {
ChromeDriver driver;
	
	@BeforeGroups
	public void setup()
	{
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notificatios--");
		driver=new EdgeDriver(op);
		
	}
	@Test
	public void test1()
	{
		driver.get("https://www.justdial.com/");
	}
}
