package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Readdatafromcmdprompt {
	@Test
	public void readdatafromcmdprompt()
	{
		
	String URL = System.getProperty("url");
	//String BROWSER = System.getProperty("browser");
	String USERNAME = System.getProperty("username");
	String PASSWORD = System.getProperty("password");
	
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(URL);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.findElement(By.id("email")).sendKeys(USERNAME);
	driver.findElement(By.id("pass")).sendKeys(PASSWORD);
	driver.findElement(By.name("login")).click();
	driver.close();
	}
}
