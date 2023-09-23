package pkg;


import java.net.HttpURLConnection;

import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Linkcount2 

	 {
		EdgeDriver driver;
			
			@Before
			public void setUp()
			{
				driver=new EdgeDriver();
				driver.get("https://www.facebook.com");			
			}
			
			@Test
			public void test4() throws Exception
			{		
				List<WebElement> allLinks=driver.findElements(By.tagName("a"));
				
				System.out.println("total no of links="+allLinks.size());
			
				for (WebElement link : allLinks)
				{
					String link1=link.getAttribute("href");
					verify(link1);
				}
					
				}
			// to verify the response code is 200 or 400 

			private void verify(String link1) throws Exception 
			{
				try
				{
				URL n =new URL(link1);                      // to open a link using java code and also create object
				HttpURLConnection con=(HttpURLConnection)n.openConnection(); // url connection is defied in the http connection ,type casting
				con.connect();
				if(con.getResponseCode()==200)
				{
					System.out.println("response code is 200----"+link1);
				}
				else if(con.getResponseCode()==400)
				{
					System.out.println("response code is 400----"+link1);
				}	
				}
				
				catch(Exception e)
				{
				System.out.println(e.getMessage())	;
				
				}
	
	}

}
