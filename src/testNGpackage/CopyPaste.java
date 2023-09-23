package testNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CopyPaste {

EdgeDriver driver;
	
	
	@BeforeTest(alwaysRun=true)
	public void setup()
	{
		driver=new EdgeDriver();
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void test1()
	{
	  WebElement firstname=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input ")); //ithu copy cheyanda element
	  WebElement redifid=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));//thu paste cheyanda element
	  firstname.sendKeys("hello"); // value passing
	  Actions act=new Actions(driver);
	      
	  act.keyDown(firstname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);//ivade select cheyan control+A cheyunnu
	  act.keyDown(firstname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);//ivade copy cheyan control+c cheyunnu
	  act.keyDown(redifid,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);//ivade paste cheyan control+v cheyunnu
	  act.perform();
	}
}




















