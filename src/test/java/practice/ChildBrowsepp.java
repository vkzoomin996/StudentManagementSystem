package practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChildBrowsepp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
 		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("iphones");
		driver.findElement(By.xpath("//button[@type='submit']//*[name()='svg']")).click();
		driver.findElement(By.xpath("//div[normalize-space()='APPLE iPhone 14 (Midnight, 128 GB)']")).click();
		String pid=driver.getWindowHandle();
		Set<String> wid = driver.getWindowHandles();
		for (String id : wid) {
			driver.switchTo().window(id);
			
		}
}
}