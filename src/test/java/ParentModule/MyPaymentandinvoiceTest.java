package ParentModule;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.Sms.GenericUtility.BaseClass;
import com.Sms.GenericUtility.FileUtility;
import com.Sms.GenericUtility.WebDriverUtility;
import com.Sms.ObjectRepositary.DashboardPage;
import com.Sms.ObjectRepositary.LoginPage;
import com.Sms.ObjectRepositary.My_paymentsPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyPaymentandinvoiceTest extends BaseClass {
 
	 
		 @Test(groups="system")
		 public void myPaymentandinvoiceTest() throws Throwable {
			 FileUtility flib= new FileUtility();
			 
			 String URL=flib.readDataFromPropertyFile("url");
				String EMAIL=flib.readDataFromPropertyFile("email");//student
				//String EMAIL=flib.readDataFromPropertyFile("userr");//parent
				//String EMAIL=flib.readDataFromPropertyFile("user");//teacher
				String  PASSWORD=flib.readDataFromPropertyFile("password");
		        driver.get(URL);
		        wlib.waitforpageload(driver);
		        LoginPage lp = new LoginPage(driver);
		        lp.login(EMAIL, PASSWORD);
			String ele = driver.getTitle();
	   		if(ele.equalsIgnoreCase("Student Management System")) {
	  			System.out.println("login succesfully");
	 			
	  		}else {
	  			System.out.println("email or password is incorrect");
	  		}
       DashboardPage dp = new DashboardPage(driver);
       dp.dashboard();
        
       My_paymentsPage mpp=new My_paymentsPage(driver);
       mpp.mypaypage();
 		 
		
	}
		
	}



