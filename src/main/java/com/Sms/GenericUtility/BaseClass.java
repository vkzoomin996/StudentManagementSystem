package com.Sms.GenericUtility;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.Sms.ObjectRepositary.HomePage;
import com.Sms.ObjectRepositary.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public	DatabaseUtility dlib= new DatabaseUtility();
	public ExcelUtility elib= new ExcelUtility();
	public FileUtility flib= new FileUtility();
	public JavaUtility jlib =new JavaUtility();
	public WebDriverUtility wlib = new WebDriverUtility();
	public  WebDriver driver;
	public static WebDriver sdriver;
	
	@BeforeSuite(alwaysRun=true)
	public void config_BS() throws Throwable {
		dlib.connectionToDB();
		System.out.println("connection to the DB");
	}
 	@BeforeClass(alwaysRun=true )
	public void config_BC() throws Throwable
	{
		String Browser =flib.readDataFromPropertyFile("browser");
		if(Browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();

}
		else if(Browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		else 
			{
				WebDriverManager.edgedriver().setup();
				driver= new EdgeDriver();
			}
		
		System.out.println("-----launch the browser----");
		sdriver =driver;
 
		wlib.maximize(driver);
		wlib.waitforpageload(driver);
	}
	@BeforeMethod(alwaysRun=true)
	public void congig_BM() throws Throwable
	{ 
		 

		System.out.println("login");
	}
	@AfterMethod(alwaysRun=true)
	public void congig_AM()throws Throwable {
		
 		System.out.println("----logout from application----");
	}
	@AfterClass(alwaysRun=true)
	public void config_AC() {
		driver.quit();
		System.out.println("----close the browser------");
	}
	@AfterSuite(alwaysRun=true)
	public void config_AS() throws Throwable
	{
		dlib.closeDB();
		System.out.println("----close the dataBase---");
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
