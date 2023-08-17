package practice;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mysql.cj.jdbc.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hashmapreading
{
	public static void main(String[] args) throws Throwable     {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		FileInputStream fis = new FileInputStream("./src/test/resources/app.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
 		int ro = sh.getLastRowNum();
		HashMap<String, String> data= new HashMap<String, String>();
		
	
	// reading the data from excel to hashmap
 for(int i=0; i<=ro; i++) {
	String key = sh.getRow(i).getCell(0).getStringCellValue();
	 String value = sh.getRow(i).getCell(1).getStringCellValue();
       data.put(key, value);
 }
        
	// read data from Hashmap
      
       for(Entry<String, String>  entry:data.entrySet()) {
    	   driver.findElement(By.id(entry.getKey())).sendKeys(entry.getValue());
     	//driver.findElement(By.id(entry.getKey())).sendKeys(entry.getValue());
    	 // driver.findElement(By.id(entry.getKey())).sendKeys(entry.getValue());
driver.findElement(By.name("login")) .click();
    	  
       }
 }}
	 