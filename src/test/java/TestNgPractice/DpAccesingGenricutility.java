package TestNgPractice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Sms.GenericUtility.ExcelUtility;

public class DpAccesingGenricutility {
	@Test(dataProvider="getData_generic")
	public void fetchdata(String claint,String location , String quantity     )
	{
		System.out.println("claint------>"+claint     +"location------>"+location    + "quantity------>"+quantity);
	}
	
	@DataProvider 
	public Object getData_generic() throws Throwable{
		ExcelUtility eib= new ExcelUtility();
		Object value = eib.getDataFromExcel("DP");
		return value;
		
	} 

}
