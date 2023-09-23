package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Fbloginpage;

public class Fblogintest {
WebDriver driver;

@BeforeTest
public void setup()
{
	driver=new EdgeDriver();
	driver.get("https://www.facebook.com");
	
}
@Test
public void fbtest()
{
	 Fbloginpage ob =new  Fbloginpage(driver);
	 ob.setvalues("123@gmail.com","ammu");
	 ob.login();
	
}


}
