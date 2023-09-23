package testNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginValidation {
EdgeDriver driver;
	
	
	@BeforeTest(alwaysRun=true)
	public void setup()
	{
		driver=new EdgeDriver();
		driver.get("https://www.facebookcom");
	}	
	
	@Test
	public void test1()
	{
		driver.findElement(By.name("email")).sendKeys("123@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("12345");
		driver.findElement(By.name("login")).click();
		
		String exp="";
		String actual=driver.getCurrentUrl();
		if(actual.equals(exp))
		{
			System.out.println("login successfull");
		}
		else
		{
			System.out.println("login failed");
		}
}
}

