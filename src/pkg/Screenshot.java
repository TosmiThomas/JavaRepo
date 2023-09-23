package pkg;

import java.io.File;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
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
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("T://screenshot1.png"));        // to take screen shotin  DRIVE
				
				WebElement button=driver.findElement(By.xpath("/html/body/input[1]"));
				File src1=button.getScreenshotAs(OutputType.FILE);
				FileHandler.copy(src1, new File("./screenshot/error.png"));
			
				
	}
}
