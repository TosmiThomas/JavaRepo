package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Rediff {

EdgeDriver driver;
	
	@Before
	public void setUp()
	{
		driver=new EdgeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	
	@Test
	public void test3()
	{
		boolean logo=driver.findElement(By.xpath("//*[@id='wrapper']/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
		if(logo)
		{
			System.out.println("log is present");
		}
		else
		{
			System.out.println("log is  not present");
		}
		
		
		Boolean radio =driver.findElement(By.xpath(null))
		
}
}