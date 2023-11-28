package twoTasks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJet {

	@Test
	public void task1() {
		

		System.setProperty("webdriver.chrome.driver", "./src/main/resources/selenium-server-4.11.0.jar");
		WebDriver driver= new ChromeDriver();

		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[text()='round trip']")).click();
		
	}

}
