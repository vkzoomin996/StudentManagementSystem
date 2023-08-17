package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingMultipledatafromExcel {
	public static void main(String[] args) throws Throwable   {
		FileInputStream fis = new FileInputStream("./src/test/resources/testdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		int ro = sh.getLastRowNum();
		for( int i=0; i<=sh.getLastRowNum(); i++)
		{
			String usernam = sh.getRow(i).getCell(0).getStringCellValue();
			String passwd = sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(usernam+"  "+passwd);
			
		}
		
	}

}
