package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphones");
		driver.findElement(By.id("nav-search-submit-button")).click();
 
		
		List<WebElement> nameofproduct = driver.findElements(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']//h2"));
 		List<WebElement> prices = driver.findElements(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']//span[@class='a-price-whole'][number(translate(text(),'₹,',''))<70000]"));
		for(int i=0; i<=nameofproduct.size();i++ ) {                                                                                                                            
			String text = prices.get(i).getText();
 			String myprice = text.replace(",","");
 			Integer actualprice = Integer.valueOf(myprice);
			if(actualprice<=70000) {
				System.out.println(nameofproduct.get(i).getText()+" "+prices.get(2).getText());
			}
		}
driver.close();
		
		
	}

}
