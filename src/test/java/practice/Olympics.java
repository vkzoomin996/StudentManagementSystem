package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Olympics {
 public static void main(String[] args) {
	

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		driver.get("https://olympics.com/en/olympic-games/tokyo-2020/medals");
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		String team="Argentina";
		WebElement gold=driver.findElement(By.xpath("//div[text()='"+team+"']/../../../..//div[@title='Gold']"));
		WebElement silver=driver.findElement(By.xpath("//div[text()='"+team+"']/../../../..//div[@title='Silver']"));
		WebElement bronze=	driver.findElement(By.xpath("//div[text()='"+team+"']/../../../..//div[@title='Bronze']"));
		WebElement total=	driver.findElement(By.xpath("//div[text()='"+team+"']/../../../..//div[@title='']"));
 		System.out.println(team   +"   :gold"+gold.getText()+" silver:"+silver.getText()+ "bronze:"+bronze.getText()+"total:"+total.getText());

 		driver.close();
 

		
	
}}
