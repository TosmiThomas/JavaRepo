package testNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Parameterization {
	

EdgeDriver driver;
	
	
	@BeforeTest
	public void setup()
	{
		driver=new EdgeDriver();
		driver.get("https://www.google.com");
	}	
	@Test
	@Parameters("serach")
	public void test1(String s)
	{
		driver.findElement(By.name("q")).sendKeys(s);
	}
}
