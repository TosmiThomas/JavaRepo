package testNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragDrop {
EdgeDriver driver;
	
	
	@BeforeTest(alwaysRun=true)
	public void setup()
	{
		driver=new EdgeDriver();
		driver.get("https://demoqa.com/droppable");
	}	
	
	@Test
	public void test1()
	{
		WebElement src=driver.findElement(By.xpath(""));
		WebElement dest=driver.findElement(By.xpath(""));
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dest);
		act.perform();
		String exp="Dropped!";
		String actualtext=dest.getText();
		if(actualtext.equals(exp))
		{
			System.out.println("pass");
	}
		else
		{
			System.out.println("fail");
		}
	}
}
	
