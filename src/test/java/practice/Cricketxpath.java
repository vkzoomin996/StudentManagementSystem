package practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cricketxpath {
	public static void main(String[] args) throws Throwable {
 	
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/t20i");
		//featch all the data in the table
		List<WebElement> options = driver.findElements(By.xpath("//table/tbody[*]/tr[*][*]"));
		    for(WebElement ele:options) {
		    	System.out.println(ele.getText());
		    
		    }
		/*//fetch country name along with matches which are >30
		List<WebElement> teams = driver.findElements(By.xpath("//table//tr[*]/td[*]//span[@class='u-hide-phablet']"));
		List<WebElement> matches = driver.findElements(By.xpath("//table//tr[*]/td[3][@class='table-body__cell u-center-text' and text()>30]"));
	 for(int i=0; i<=teams.size(); i++) {
		 System.out.println(teams.get(i).getText()+""+matches.get(i).getText());
		}*/
	 Thread.sleep(4000);
		//featch the 10 country names from the table
		
	 
	 List<WebElement> names = driver.findElements(By.xpath("(//table//tr[*]/td[*]//span[@class='u-hide-phablet' ])[position()<11]"));
			
		 for( int i=0; i<names.size(); i++) {
			 String value = names.get(i).getText();
			 System.out.println(value);
		 }
	driver.close();
}	 
}