package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

public class Datadriven{
	
	@Test
	public void test() throws FileNotFoundException
	{
		FileInputStream f=new FileInputStream("T:\\software testing\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet sh=wb.getSheet("sheet1");
		int row=sh.getLastRowNum();
		for(int i=1;i<=row;i++) 
		{
		String username=	sh.getRow(i).getCell(0).getStringCellValue();
		String password=	sh.getRow(i).getCell(1).getStringCellValue();
		System.out.println("userame="+username +"\n"+"password="+password);
		
		
}
	}
		
	}
