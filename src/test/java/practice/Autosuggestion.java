package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

 
public class Autosuggestion {
	@Test
	public void  autosuggestion(){
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
 		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("gifts");
	List<WebElement> list = driver.findElements(By.xpath("//div[contains(@aria-label,'gifts ')]"));
	
	for (WebElement webElement : list) {
		System.out.println(webElement.getText());
	}
	}}
	