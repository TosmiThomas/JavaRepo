package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook {

	EdgeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		
	}
	
	@Test
	public void test1()
	{
		
		//path
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("123@gmail.com",Keys.ENTER);
		
		//driver.findElement(By.id("email")).sendKeys("123@gmail.com",Keys.ENTER);
		//driver.findElement(By.id("pass")).sendKeys("123",Keys.ENTER);
		//driver.findElement(By.name("login")).click(); 
		
	}
}
