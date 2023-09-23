package pkg;

import org.openqa.selenium.edge.EdgeDriver;

public class Pagesource {

	public static void main(String[] args) {
		
		EdgeDriver driver= new EdgeDriver();
		driver.get("https://www.google.com");
		String src=driver.getPageSource();
		if(src.contains("Gmail"))
		{
			System.out.println("text is present");
		}
		else
		{
			System.out.println("text is not present");
		}
		
	}

}
