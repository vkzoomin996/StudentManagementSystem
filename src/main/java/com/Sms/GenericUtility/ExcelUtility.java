package com.Sms.GenericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class ExcelUtility {
	/**
	 * this method is used to read the data from excel
	 * @author Veeresha K
	 * @param sheetname
	 * @param rowno
	 * @param CelNo
	 * @return 
	 * @throws Throwable
	 * @throws IOException
	 */
public String readdatafromExcel(String sheetname,int rowno,int CelNo) throws Throwable, IOException {
	FileInputStream fi=new FileInputStream(IPathConstants.ExcelPath);
	Workbook wb = WorkbookFactory.create(fi);
 	String value=wb.getSheet(sheetname).getRow(rowno).getCell(CelNo).toString();
 	return value;
}
/**
 * this method is used to Write data into excel
 * @author Veeresha K
 * @param sheetname
 * @param rowno
 * @param CelNo
 * @param data
 * @throws Throwable
 */
public void writedataintoExcel(String sheetname,int rowno,int CelNo,String data) throws Throwable {
	FileInputStream fi=new FileInputStream(IPathConstants.ExcelPath);
	Workbook wb = WorkbookFactory.create(fi);
 	wb.getSheet(sheetname).createRow(rowno).createCell(CelNo).setCellValue(data);
 	FileOutputStream fos= new FileOutputStream(IPathConstants.ExcelPath);
 	wb.write(fos);
 	wb.close();
 	}
/**
 * this method is used to get the last row number
 * @author Veeresha K
 * @param sheetname
 * @return
 * @throws Throwable
 */
public int getlastRowno(String sheetname) throws Throwable
{
	FileInputStream fi=new FileInputStream(IPathConstants.ExcelPath);
	Workbook wb = WorkbookFactory.create(fi);
	Sheet sh = wb.getSheet(sheetname);
	int count=sh.getLastRowNum();
	return count;
}
/**
 * this method is used to get multiple data from excel
 * @author Veeresha K
 * @param sheetname 
 * @param sheetname 
 * @param keycoluno 
 * @param valuecoluno 
 * @param keycelno 
 * @param valuecelno 
 * @param valuecoluno 
 * @param driver 
 * @param driver 
 * @return
 * @throws Throwable 
 */
public HashMap<String,String> getMultipleDataFromExcel(String sheetname, int keycoluno, int valuecoluno) throws Throwable{
	
	FileInputStream fi=new FileInputStream(IPathConstants.ExcelPath);
	Workbook wb = WorkbookFactory.create(fi);
 	Sheet sh = wb.getSheet(sheetname);
	int count=sh.getLastRowNum();
	HashMap<String,String> map=new HashMap<String,String>();//emptymap
 	for(int i=0; i<=count; i++) {
		String key = sh.getRow(i).getCell(keycoluno).toString();
		String value = sh.getRow(i).getCell(valuecoluno).toString();
		map.put(key, value);
 	}
  
 	return map;
}

@DataProvider
public Object[][] getDataFromExcel(String Sheetname) throws Throwable    {
	FileInputStream fi = new FileInputStream(IPathConstants.ExcelPath);
	Workbook wb = WorkbookFactory.create(fi);
	 Sheet sh = wb.getSheet(Sheetname);
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
	
}}
