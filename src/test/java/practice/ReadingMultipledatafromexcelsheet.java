package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMultipledatafromexcelsheet {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("./src/test/resources/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		int lastrow =sh.getLastRowNum();
		int lastcol=sh.getRow(lastrow).getLastCellNum();
		System.out.println("--------------------");
		for(int i=0;i<=lastrow; i++)
		{
			for(int j=0; j<lastcol; j++)
			{
				
				System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
			}
		}
		
	}

}
