package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class Junitscript {
	
EdgeDriver driver;

@Before

	public void setUp()
	{
	driver=new EdgeDriver();
	driver.get("https://www.youtube.com");
}


@Test
public void test1()
{
	
	driver.findElement(By.name("search_query")).sendKeys("Books",Keys.ENTER);
	
	String title1=driver.getTitle();
	System.out.println("title1");
}


}
