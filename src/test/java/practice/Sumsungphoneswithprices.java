package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sumsungphoneswithprices {
	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
	driver.findElement(By.name("q")).sendKeys("sumsung phones");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	List<WebElement> names = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	List<WebElement> prices = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
	for(int i=0; i<=names.size();i++ ) {
			System.out.println(names.get(i).getText()+" "+prices.get(1).getText());
	}
driver.close();


}
}