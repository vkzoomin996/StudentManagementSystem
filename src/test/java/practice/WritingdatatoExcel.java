package practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingdatatoExcel {
public static void main(String[] args) throws Throwable, IOException {
	
	FileInputStream fis=new FileInputStream("./src/test/resources/tdata.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	book.getSheet("sheet1").createRow(0).createCell(0).setCellValue("veeresha");
	book.getSheet("sheet1").createRow(1).createCell(0).setCellValue("vpp2");

	FileOutputStream fos=new FileOutputStream("./src/test/resources/tdata.xlsx");
	book.write(fos);
	
}
}
