package TestNgPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Sms.GenericUtility.IPathConstants;

public class DataProviderfromExcel {

	@Test(dataProvider="getDataFromExcel")
	public void fetchdata(String claint,String location , String quantity     )
	{
		System.out.println("claint------>"+claint     +"location------>"+location    + "quantity------>"+quantity);
	}
	@DataProvider
	public Object[][] getDataFromExcel() throws Throwable    {
		FileInputStream fi = new FileInputStream(IPathConstants.ExcelPath);
		Workbook wb = WorkbookFactory.create(fi);
		 Sheet sh = wb.getSheet("DP");
		int lastrow = sh.getLastRowNum();
		int lastcell = sh.getRow(0).getLastCellNum();
		Object[][] obj = new Object[lastrow+1][lastcell];
		for(int i=0; i<=lastrow; i++) //row
		{
			for(int j=0; j<lastcell; j++)//col
			{
				obj[i][j]	=sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		return obj;
		
	}
}
