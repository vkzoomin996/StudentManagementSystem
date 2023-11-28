package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
 
public class Amazonphones {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
	driver.findElement(By.id("nav-search-submit-button")).click();
	 List<WebElement> options = driver.findElements(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[position()>3][position()<26]"));
	String phone="Nokia";
				System.out.println(options.size());
  WebElement ele =  driver.findElement(By.xpath("//span[text()='"+phone+"']"));
  ele.click();
  List<WebElement> nameofproduct = driver.findElements(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']//h2"));
  List<WebElement> prices = driver.findElements(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']//span[@class='a-price']"));
  for(int i=0; i<nameofproduct.size();i++ ) {
		System.out.println(nameofproduct.get(i).getText()+" "+prices.get(1).getText());
	}
driver.close();
}



}