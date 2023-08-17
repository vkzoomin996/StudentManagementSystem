package practice;



import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinksTest2 {
	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		// launch the web application
		driver.get("http://www.deadlinkcity.com/");
		//driver.get("http://rmgtestingserver/domain/Student_Management_System/view/login.php");
 		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		
		
		
		
		List<WebElement> listlinks = driver.findElements(By.xpath("//a"));
		System.out.println(listlinks.size());
		//Create an empty array
		ArrayList<String> links = new ArrayList<String>();
		for(int i=0; i<listlinks.size(); i++)
		
		{
			String eachlink = listlinks.get(i).getAttribute("href");
			URL url= null;
			int statusCode=0;
			try {
				//load the url
				url=new URL(eachlink);
				// open the url connection
				HttpURLConnection  HttpURLConnection =(HttpURLConnection)url.openConnection();
				statusCode=HttpURLConnection.getResponseCode();
				
				
				//check the status code
				if(statusCode>=400)
				{
					links.add(eachlink+"-------->"+statusCode);
				}
			}
			catch(Exception e) {
				links.add(eachlink+"-------->"+statusCode);
}
			
			}
		System.out.println(links);
			
			driver.close();
		}
		
		

	}


