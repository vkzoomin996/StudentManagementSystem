package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
  
 
public class Excel {
		public static void main(String[] args) throws Throwable {
			
		
		FileInputStream fi=new FileInputStream("./src/test/resources/app.xlsx");
		Workbook wb = WorkbookFactory.create(fi);
	 	Sheet sh = wb.getSheet("Sheet1");
		int count=sh.getLastRowNum();
		HashMap<String,String> data=new HashMap<String,String>();//emptymap
		
		// reading data from excel
	 	for(int i=0; i<=count; i++) {
			String key = sh.getRow(i).getCell(0).getStringCellValue();
			String value = sh.getRow(i).getCell(1).getStringCellValue();
			data.put(key, value);
	 	}
	  
		for(Map.Entry entry: data.entrySet()) {
			System.out.println(entry.getKey()+"           "+entry.getValue());
		}
  
 	}
}
