package testNGpackage;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import org.testng.annotations.Test;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class DataDriven {

	
	@Test
	public void test() throws Exception
	
	{
		FileInputStream f=new FileInputStream("T:\\software testing\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet sh=wb.getSheet("Sheet1");
		int row=sh.getLastRowNum();
		for(int i=1;i<=row;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			String password=sh.getRow(i).getCell(1).getNumericCellVlue();
			System.out.println("username="+username +"\n"+"password="+password);
			
		}
	}
}
