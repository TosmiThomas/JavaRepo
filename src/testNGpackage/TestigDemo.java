 package testNGpackage;


import org.testng.annotations.Test;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;



public class TestigDemo {
	EdgeDriver driver;
	
	
	@BeforeTest(alwaysRun=true)
	public void setup()
	{
		driver=new EdgeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.youtube.com/");
	}
	
	
	@Test(priority=2,invocationCount=3)
	public void test1()
	{
		System.out.println("test1");
		
	}
	
	@Test(priority=3,enabled=false)
	public void test2()
	{
		System.out.println("test2");
		
	}
	
	@Test(priority=1)
	public void test3()
	{
		System.out.println("test3");
		
	}
	@AfterMethod
	public void afermethod()
	{
		System.out.println("aftermethod");
		
	}
	
	@AfterTest
	public void teardown()
	{
		System.out.println("aftermethod");
		
	}
	
	
}
