package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertCode {
EdgeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.get("file:///T:/Selenium/AlertCode.html");
		
	}
	
	@Test
	public void test3()
	{
		
		  driver.findElement(By.xpath("//html/body/input[1]")).click();
		 
		  Alert a=driver.switchTo().alert();    //alert handle
		 String text= a.getText();  // Get the text from the alert
		  
		  System.out.println(text);
		    a.accept();
		    
		    if(text.equalsIgnoreCase("hello iama lert box"));
		    {
		    	System.out.println("pass");
		    } 
		    	System.out.println("fail ");
		    }
		   driver.findElement(By.xpath("//html/body/input[2]")). sendKeys("ammu");
		   driver.findElement(By.xpath("//html/body/input[3]")).sendKeys("appu");
		   driver.findElement(By.xpath("//html/body/input[4]")).click();
		 
}
}