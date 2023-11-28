package ParentModule;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gejnj {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Reporter.log("open the applications");
		System.out.println("open the applications");
  		//button[normalize-space()='Confirm Alert Box']
		
			driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
			Reporter.log("click on Alert Box",true);
	  		Reporter.log("Switch driver control alert");

		 	Alert alert = driver.switchTo().alert();
		 	alert.accept();
 	
		 

		
 	}
}
