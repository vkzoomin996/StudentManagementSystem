 package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Datapicker {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.get("https://ksrtc.in/oprs-web/");
	 driver.manage().window().maximize();
	 
	         String MonthYear="August 2023";
 			 driver.findElement(By.id("txtJourneyDate")).click();
 			while(true) {
				String test = driver.findElement(By.xpath(" //div[@class='ui-datepicker-title']")).getText();
	if(MonthYear.equalsIgnoreCase(test)) {
			driver.findElement(By.xpath("//a[normalize-space()='23']")).click();
			String text=driver.findElement(By.id("txtJourneyDate")).getText();
			 System.out.println(text);
		break;
	}
	else {
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='23']")).click();
		 
 			}
 			driver.close();
 			}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
