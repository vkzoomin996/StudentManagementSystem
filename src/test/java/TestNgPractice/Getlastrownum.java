package TestNgPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import com.Sms.GenericUtility.IPathConstants;

public class Getlastrownum {
	@Test
	public void getdata() throws Throwable {
	FileInputStream fi = new FileInputStream(IPathConstants.ExcelPath);
	Workbook wb = WorkbookFactory.create(fi);
	 Sheet sh = wb.getSheet("Teacher");
	int lastrow = sh.getLastRowNum();
	System.out.println(lastrow);

}}
