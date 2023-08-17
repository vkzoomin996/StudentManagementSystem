package practice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windowids {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
  
   	Set<String> windowids = driver.getWindowHandles();
   	Iterator<String> it = windowids.iterator();
   	String parentid=it.next();
   	String childid=it.next();
   	System.out.println(parentid);
   	System.out.println(childid);
   	driver.switchTo().window(parentid);


}
}