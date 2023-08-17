package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchaappusepro {
	@Test
	public   void  fblogin() {
 
			
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Excel map=new Excel();
//		map.veresh(null, driver)
 		driver.findElement(By.name("login")).click();
		String Actual=driver.getTitle();
 		String expected="(20+) Facebook";
		
		Assert.assertEquals(Actual, expected);
		
			 
		


		
	}

}
