package pkg;

import org.openqa.selenium.edge.EdgeDriver;



public class Firstscript {

	public static void main(String[] args) {
		//launch browser
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://google.com");
		// get title
		String actualtitle=driver.getTitle();
		System.out.println("the title ="+actualtitle);
		String exp="google.com";
		if(actualtitle.equals(exp)) 
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}

	}

}
