import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_01 {

	@Test
	public  void publ() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Reporter.log("launch the browser",true);
		driver.get("http://rmgtestingserver/domain/Student_Management_System/view/login.php");
		Reporter.log("navigate to the application",true);
		driver.findElement(By.id("email")).sendKeys("dad1@gmail.com");
		Reporter.log("email address should be entered",true);
		driver.findElement(By.id("password")).sendKeys("12345");
		Reporter.log("password   should be entered",true);

		driver.findElement(By.id("btnSubmit")).click();
		Reporter.log(" click on submit button",true);
		String title = driver.getTitle();
        Assert.assertEquals(title, "Student Management System");

driver.close();
 
	}
	
	public  void pub2() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Reporter.log("launch the browser",true);
		driver.get("http://rmgtestingserver/domain/Student_Management_System/view/login.php");
		Reporter.log("navigate to the application",true);
		driver.findElement(By.id("email")).sendKeys("dad1@gmail.com");
		Reporter.log("email address should be entered",true);
		driver.findElement(By.id("password")).sendKeys("12345");
		Reporter.log("password   should be entered",true);

		driver.findElement(By.id("btnSubmit")).click();
		Reporter.log(" click on submit button",true);
		String title = driver.getTitle();
        Assert.assertNotEquals(title, "Student Management System");
        driver.close();

}
	@Test
	public  void pub3() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Reporter.log("launch the browser",true);
		driver.get("http://rmgtestingserver/domain/Student_Management_System/view/login.php");
		Reporter.log("navigate to the application",true);
		driver.findElement(By.id("email")).sendKeys("dad1@gmail.com");
		Reporter.log("email address should be entered",true);
		driver.findElement(By.id("password")).sendKeys("12345");
		Reporter.log("password   should be entered",true);

		driver.findElement(By.id("btnSubmit")).click();
		Reporter.log(" click on submit button",true);
		SoftAssert sf=new SoftAssert();
		
		String title = driver.getTitle();
		sf.assertEquals(title, "Student Management System");
		driver.close();

}
	@Test
	public  void pub4() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Reporter.log("launch the browser",true);
		driver.get("http://rmgtestingserver/domain/Student_Management_System/view/login.php");
		Reporter.log("navigate to the application",true);
		driver.findElement(By.id("email")).sendKeys("dad1@gmail.com");
		Reporter.log("email address should be entered",true);
		driver.findElement(By.id("password")).sendKeys("12345");
		Reporter.log("password   should be entered",true);

		driver.findElement(By.id("btnSubmit")).click();
		Reporter.log(" click on submit button",true);
		SoftAssert sf=new SoftAssert();
		
		String title = driver.getTitle();
		sf.assertEquals(title, "Student Mana4gement System");
		sf.assertEquals(title, "Student Management System");
		sf.assertEquals(title, "Student Mana4gement System");
         sf.assertAll();

         driver.close();

	
}
	@Test
	public  void pub5() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Reporter.log("launch the browser",true);
		driver.get("http://rmgtestingserver/domain/Student_Management_System/view/login.php");
		Reporter.log("navigate to the application",true);
		driver.findElement(By.id("email")).sendKeys("dad1@gmail.com");
		Reporter.log("email address should be entered",true);
		driver.findElement(By.id("password")).sendKeys("12345");
		Reporter.log("password   should be entered",true);

		driver.findElement(By.id("btnSubmit")).click();
		Reporter.log(" click on submit button",true);
 		
		String title = driver.getTitle();
		Assert.assertNull(title);
		Reporter.log("tc is failed",true);
		driver.close();

}
	@Test
	public  void pub6() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		Reporter.log("launch the browser",true);
		driver.get("http://rmgtestingserver/domain/Student_Management_System/view/login.php");
		Reporter.log("navigate to the application",true);
		driver.findElement(By.id("email")).sendKeys("dad1@gmail.com");
		Reporter.log("email address should be entered",true);
		driver.findElement(By.id("password")).sendKeys("12345");
		Reporter.log("password   should be entered",true);

		driver.findElement(By.id("btnSubmit")).click();
		Reporter.log(" click on submit button",true);
 		
		String title = driver.getTitle();
		Assert.assertNotNull(title);
		Reporter.log("tc is passed",true);
		driver.close();


		
}
	@Test
	public  void pub7() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Reporter.log("launch the browser",true);
		driver.get("http://rmgtestingserver/domain/Student_Management_System/view/login.php");
		Reporter.log("navigate to the application",true);
		driver.findElement(By.id("email")).sendKeys("dad1@gmail.com");
		Reporter.log("email address should be entered",true);
		driver.findElement(By.id("password")).sendKeys("12345");
		Reporter.log("password   should be entered",true);

		driver.findElement(By.id("btnSubmit")).click();
		Reporter.log(" click on submit button",true);
 		SoftAssert sa=new SoftAssert();
		String title = driver.getTitle();
		sa.assertNotNull(title);
		Reporter.log("tc is passed",true);
		driver.close();


		
}
	@Test
	public  void pub8() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Reporter.log("launch the browser",true);
		driver.get("http://rmgtestingserver/domain/Student_Management_System/view/login.php");
		Reporter.log("navigate to the application",true);
		driver.findElement(By.id("email")).sendKeys("dad1@gmail.com");
		Reporter.log("email address should be entered",true);
		driver.findElement(By.id("password")).sendKeys("12345");
		Reporter.log("password   should be entered",true);

		driver.findElement(By.id("btnSubmit")).click();
		Reporter.log(" click on submit button",true);
 		SoftAssert sa=new SoftAssert();
		String title = driver.getTitle();
		sa.assertNull(title);
		Reporter.log("tc is failed",true);
		sa.assertAll();
		driver.close();


		
}
	}