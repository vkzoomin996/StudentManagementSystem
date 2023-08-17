package TeacherModule;


 
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Sms.GenericUtility.BaseClass;
import com.Sms.GenericUtility.FileUtility;
import com.Sms.GenericUtility.WebDriverUtility;
import com.Sms.ObjectRepositary.DashboardPage;
import com.Sms.ObjectRepositary.LoginPage;
import com.Sms.ObjectRepositary.Navigastudent;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class NavigatetoMyStudentTest extends BaseClass {
		@Test(groups="smoke")
		public void navigatetoMyStudentTest() throws Throwable {
			 FileUtility flib= new FileUtility();
			 String URL=flib.readDataFromPropertyFile("url");
				//String EMAIL=flib.readDataFromPropertyFile("email");//student
				//String EMAIL=flib.readDataFromPropertyFile("userr");//parent
				String EMAIL=flib.readDataFromPropertyFile("user");//teacher
				
				String  PASSWORD=flib.readDataFromPropertyFile("password");
				Thread.sleep(10000);

				driver.get(URL);
		        wlib.waitforpageload(driver);
		        LoginPage lp = new LoginPage(driver);
		        lp.login(EMAIL, PASSWORD);
		 DashboardPage dp=new DashboardPage(driver);
	       dp.dashbonavi();
	       Navigastudent ngt=new Navigastudent(driver);
	       ngt.navigst();
 

		}

	}



