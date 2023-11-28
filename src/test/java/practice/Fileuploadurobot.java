package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Fileuploadurobot {
	
		public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
 		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.foundit.in/seeker/single-page-registration?");
driver.findElement(By.xpath("//div[@class='uploadResume']")).click();
driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Veeresha K\\Documents\\DOC-20230815-WA0000..pdf");
 




}
}