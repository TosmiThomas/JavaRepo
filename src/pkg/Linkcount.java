package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Linkcount {
EdgeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		
	}
	
	@Test
	public void test3()
	{
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("total no of links="+allLinks.size());
	
		for (WebElement link : allLinks) {
		    String linkText = link.getText();//to find element textusing getText
		    String linkHref = link.getAttribute("href");
		    System.out.println("Text: " + linkText + ", Href: " + linkHref);
		}

}
}