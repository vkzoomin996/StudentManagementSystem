package practice;

import java.io.FileInputStream;
 
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

 
public class FetLastrownum {
	public static void main(String[] args) throws Throwable {
		
 		FileInputStream fi=new FileInputStream("./src/test/resources/excel.xlsx");
		Workbook wb = WorkbookFactory.create(fi);
		Sheet sh = wb.getSheet("DP");
		int count=sh.getLastRowNum();
      System.out.println(count);
  	return;

	}
	}


