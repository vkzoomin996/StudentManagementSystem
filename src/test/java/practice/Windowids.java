package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowids {
	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("launch the browser",true);
 		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Reporter.log("navigate to application",true);

		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Reporter.log("click on orange HRM element",true);

		driver.switchTo().newWindow(WindowType.WINDOW);
		Reporter.log(" new Tab will be open",true);

  driver.get("https://mail.google.com/mail/");
	Reporter.log("navigate to the application",true);

   	Set<String> windowids = driver.getWindowHandles();
   	Iterator<String> it = windowids.iterator();
   	String parentid=it.next();
   	String childid=it.next();
   	System.out.println(parentid);
   	System.out.println(childid);
   	driver.switchTo().window(parentid);
    	
   	


}
}