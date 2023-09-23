package testNGpackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowHandler {

	WebDriver d;
	
	@BeforeTest
	public void beforeTest()
	{
		d=new EdgeDriver();
	}
	@org.testng.annotations.Test
	public void  test()
	{
		d.get("https://demo.guru99.com/popup.php");
		
		String parentWindow=d.getWindowHandle();
		System.out.println("the parent window titile is " +d.getTitle());
		d.findElement(By.xpath("/html/body/p/a")).click();
		
		Set<String>  allWindowHandles = d.getWindowHandles();
		
		for (String handle : allWindowHandles)
		{
			if (!handle.equalsIgnoreCase(parentWindow))
			{
				d.switchTo().window(handle);
				
			String s=d.findElement(By.xpath("/html/body/form/tbody/tr/td/h2")).getText();
			System.out.println(s);
			d.close();
			}
			d.switchTo().window(parentWindow);
		}		
			
	
}
				

}
