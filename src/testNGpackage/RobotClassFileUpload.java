package testNGpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RobotClassFileUpload {

	EdgeDriver driver;
		
	@BeforeTest
	public void setup()
	{
		
		
		EdgeOptions options=new EdgeOptions();
		options.addArguments("--remote--allow--origins*");
		driver=new EdgeDriver ();
		
	}	
	
	@Test

		public void fileuploadpgm() throws Exception
		{
			driver.get(" https://www.ilovepdf.com/word_to_pdf");
			driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
			
			fileUpload("T:\\software testing\\sample");
		}
	public void fileUpload (String p) throws AWTException
	
	{
		StringSelection strSelection =new StringSelection(p); //to upload a path in a clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
		
		
		Robot robot=new Robot();
		
		robot.delay(3000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(3000);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
		
		
	}

