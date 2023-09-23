package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonXpath {
EdgeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		
	}
	
	@Test
	public void test3()
	{
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("phones",Keys.ENTER);	
		 driver.findElement(By.xpath("//*[@id='nav-cart']")).click();
	}
	
}
