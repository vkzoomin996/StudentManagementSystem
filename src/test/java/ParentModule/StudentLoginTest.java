package ParentModule;

import java.io.FileInputStream;
 import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Sms.GenericUtility.BaseClass;
import com.Sms.GenericUtility.FileUtility;
import com.Sms.GenericUtility.WebDriverUtility;
import com.Sms.ObjectRepositary.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(com.Sms.GenericUtility.ListenerImpClass.class)

public class StudentLoginTest  extends BaseClass {
	
	@Test
	public void login() throws Throwable{
	 FileUtility flib= new FileUtility();
	 String URL=flib.readDataFromPropertyFile("url");
 		//String EMAIL=flib.readDataFromPropertyFile("userr");//parent
		//String EMAIL=flib.readDataFromPropertyFile("user");//teacher
		String EMAIL=flib.readDataFromPropertyFile("email");//student
		String  PASSWORD=flib.readDataFromPropertyFile("password");
		
       driver.get(URL);
       wlib.waitforpageload(driver);
       LoginPage lp = new LoginPage(driver);
       lp.login(EMAIL, PASSWORD);
       System.out.println("login to the applcation");
       String expected="Student Management System123456";
		
		String ele = driver.getTitle();
		Assert.assertEquals(ele, expected);
		 
	
	
}}