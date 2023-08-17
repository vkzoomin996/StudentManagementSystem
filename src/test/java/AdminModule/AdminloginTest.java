package AdminModule;

import static org.testng.Assert.fail;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Sms.GenericUtility.BaseClass;
import com.Sms.GenericUtility.FileUtility;
import com.Sms.GenericUtility.WebDriverUtility;
import com.Sms.ObjectRepositary.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdminloginTest extends BaseClass {
	 @Test
	 public void adminloginTest() throws Throwable {
		 FileUtility flib= new FileUtility();
		 String URL=flib.readDataFromPropertyFile("url");
			 
			String EMAIL=flib.readDataFromPropertyFile("username");//admin
			String  PASSWORD=flib.readDataFromPropertyFile("password");
	        driver.get(URL);
	        wlib.waitforpageload(driver);
	        LoginPage lp = new LoginPage(driver);
	        lp.login(EMAIL, PASSWORD);
	       fail();
	        System.out.println("login to the applcation");
			
   		String ele = driver.getTitle();
   		if(ele.equalsIgnoreCase("Student Management System")) {
  			System.out.println("login succesfully");
			  		System.out.println("login succesfully");	 
 			
  		}else {
  			System.out.println("email or password is incorrect");
  		}
  	
		
	}
}
