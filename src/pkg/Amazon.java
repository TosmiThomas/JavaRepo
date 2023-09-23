package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon {
EdgeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		
	}
	
	@Test
	public void test2()
	{
		
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("phones",Keys.ENTER);	
		
	    driver.findElement(By.xpath("//*[@id='nav-cart']")).click();
	    
	   // driver.findElement(By.xpath("//div[@id='nav-link-accountList-nav-line-1']")).click();
	    
	    //driver.findElement(By.xpath("//input[@name='email']")).sendKeys("123@gmail.com",Keys.ENTER);	
	    
	    //driver.findElement(By.xpath("//input[@id='continue']]")).click();
	    
	   // driver.navigate().back();
	   // driver.navigate().back();
	    
	   // driver.findElement(By.xpath("//div[@id='nav-xshop']/a[9]")).click();
	    
	   // driver.findElement(By.xpath("//div[@id='nav-hamburger-menu']")).click();
	    
	}
}
