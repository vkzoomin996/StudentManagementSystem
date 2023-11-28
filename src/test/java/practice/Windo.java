package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windo {
	@Test
	public void jnc() {
		WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
 driver.get("http://rmgtestingserver:8888/")	;
  }

}
