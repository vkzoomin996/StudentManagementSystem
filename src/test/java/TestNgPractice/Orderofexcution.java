package TestNgPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Orderofexcution {
	
	@BeforeSuite
	public void config_BS() {
		System.out.println("connection to the database");
	}
	@BeforeClass
	public void config_BC() {
		System.out.println("Launch the browser");
	}
	@BeforeClass
	public void config_BC1() {
		System.out.println("Launch theeeee browser");
	}
	@BeforeMethod
	public void config_BM() {
		System.out.println("Login to the application");
	}
	@Test
	public void config_TS()
	{
		System.out.println("click on my profile");
	}
	@Test
	public void config_TS1()
	{
		System.out.println("click on my student");
	}
	
	
	@AfterClass
	public void config_AC() {
		System.out.println("close the browser");
	}
	@AfterMethod
	public void config_AM() {
		System.out.println("Logout to the application");
	}
	@AfterSuite
	public void config_AS() {
		System.out.println("disconnection to the database");
	}

}
