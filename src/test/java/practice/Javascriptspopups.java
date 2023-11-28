package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Javascriptspopups {
	@Test
	public void  javascriptspopups() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
 		WebDriver driver= new ChromeDriver();
 		Reporter.log("launch the browser",true);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		 driver.switchTo().alert().accept();
		 driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
			Thread.sleep(3000);
 		 driver.switchTo().alert().dismiss();
 		 driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
			Thread.sleep(3000);
  		Alert a= driver.switchTo().alert();
  		a.sendKeys("veere");
  		a.accept();

	}
}


