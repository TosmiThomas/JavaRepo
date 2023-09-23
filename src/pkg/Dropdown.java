package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
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
		WebElement day=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select daydetails=new Select(day);
		daydetails.selectByValue("04");
		
		List<WebElement>li=daydetails.getOptions();
		System.out.println("ount of days"+li.size());
		
		
		
		
		
		
		
		
		
		
		
	}
}

