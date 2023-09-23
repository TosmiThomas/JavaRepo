package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook2 {
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
		
}
}