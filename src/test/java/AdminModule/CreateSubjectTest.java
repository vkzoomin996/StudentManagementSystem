package AdminModule;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Sms.GenericUtility.BaseClass;
import com.Sms.GenericUtility.ExcelUtility;
import com.Sms.GenericUtility.FileUtility;
import com.Sms.GenericUtility.JavaUtility;
import com.Sms.GenericUtility.WebDriverUtility;
import com.Sms.ObjectRepositary.ClassroomPage;
import com.Sms.ObjectRepositary.DashboardPage;
import com.Sms.ObjectRepositary.GradePage;
import com.Sms.ObjectRepositary.LoginPage;
import com.Sms.ObjectRepositary.SubjectPage;
import com.Sms.ObjectRepositary.SubjectRoutingPage;
import com.Sms.ObjectRepositary.TeacherPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateSubjectTest extends BaseClass {
	
	@Test(groups="system")
	public void createSubjectTest() throws IOException, Throwable {
		JavaUtility jlib= new JavaUtility();
		int random = jlib.getRandom();

		ExcelUtility elib= new ExcelUtility();
		String mail="@gmail.com";
 	 
	  String classname= elib.readdatafromExcel("classroom", 0, 1)+random;
	     String studentcount  =elib.readdatafromExcel("classroom" , 1, 1);
	     String gradename=  elib.readdatafromExcel("Grade", 0, 1)+random;
	     String admissionfee=  elib.readdatafromExcel("Grade", 1, 1);
	     String hallcharge=  elib.readdatafromExcel("Grade", 2, 1);
	     String markrangetext1=  elib.readdatafromExcel("Grade", 3, 1);
	     String markgradetext1=  elib.readdatafromExcel("Grade", 4, 1);
   	  String Subject= elib.readdatafromExcel("Subject", 0, 1)+random;
   	 String indexnoo=  elib.readdatafromExcel("Teacher", 0, 1)+random;
     String fullnamee=  elib.readdatafromExcel("Teacher", 1, 1);
	     String inamee=  elib.readdatafromExcel("Teacher", 2, 1);
	     String addres=  elib.readdatafromExcel("Teacher", 3, 1);
	     String phoneno=  elib.readdatafromExcel("Teacher", 4, 1);
	     String emaill=  elib.readdatafromExcel("Teacher", 5, 1)+random+mail;
	     String filetoupload=  elib.readdatafromExcel("Teacher", 6, 1);

	       	
	     FileUtility flib= new FileUtility();
		 String URL=flib.readDataFromPropertyFile("url");
			//String EMAIL=flib.readDataFromPropertyFile("email");//student
			//String EMAIL=flib.readDataFromPropertyFile("userr");//parent
			//String EMAIL=flib.readDataFromPropertyFile("user");//teacher
			String EMAIL=flib.readDataFromPropertyFile("username");//admin
			String  PASSWORD=flib.readDataFromPropertyFile("password");
	        driver.get(URL);
	        wlib.waitforpageload(driver);
	        LoginPage lp = new LoginPage(driver);
	        lp.login(EMAIL, PASSWORD);
	        System.out.println("login to the applcation");
			
   		String ele = driver.getTitle();
   		if(ele.equalsIgnoreCase("Student Management System")) {
  			System.out.println("login succesfully");
 			
  		}else {
  			System.out.println("email or password is incorrect");
  		}
  	
     
       DashboardPage dp = new DashboardPage(driver);
       dp.dashclassroom();
       ClassroomPage cp= new ClassroomPage(driver);
    	   cp.classroomdetails( driver,classname, studentcount);
    	   Thread.sleep(5000);
       dp.dashboardgrade();
       Thread.sleep(5000);
       GradePage gp = new GradePage(driver) ;
     gp.gradepage(gradename ,admissionfee,hallcharge);
    	   gp.addrange(markrangetext1, markrangetext1);
    	   Thread.sleep(2500);
    	   dp.dssubb();
    	  SubjectPage sp = new SubjectPage(driver);
    	  sp.subpage(Subject);
    	  Thread.sleep(4000);
    	  dp.dashteacher();
    	  TeacherPage tp =new TeacherPage(driver);
    	  tp.teacherpage(driver,indexnoo, fullnamee, inamee, addres, phoneno, emaill, filetoupload);
    	 Thread.sleep(3000);
    	  dp.dashsubrouting();
    	  SubjectRoutingPage subr = new SubjectRoutingPage(driver);
    	  subr.subrouting();
    	  
       
       
   		 
   		//dash board classroom
//   		//classroompage
//   		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Gp-114"+jlib.getRandom());
//   		driver.findElement(By.xpath("//input[@id='student_count']")).sendKeys("138");
//   		driver.findElement(By.xpath("//button[@id='btnSubmit']")).click();
   		//grade
   		//dashboard grade
   		//driver.findElement(By.xpath("(//a[@href='grade.php'])[1]")).click();
   	  //hread.sleep(3000);//span[normalize-space()='Grade']
   	  //gradepage 
//   		driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("p"+jlib.getRandom());
//      driver.findElement(By.xpath("//input[@id='admission_fee']")).sendKeys("70400");
//      driver.findElement(By.xpath("//input[@id='hall_charge']")).sendKeys("28");
//      driver.findElement(By.xpath("//button[@id='btnSubmit']")).click(); 
//      driver.findElement(By.xpath("//input[@id='mark_range_text_1']")).sendKeys("90-100");
//      driver.findElement(By.xpath("//input[@id='mark_grade_text_1']")).sendKeys("s");
//      driver.findElement(By.xpath("//div[@class='panel-footer bg-blue-active']//button[@id='btnSubmit1']")).click();
//      Thread.sleep(5000);
//      
      //dashboard subject
     // driver.findElement(By.xpath("//span[normalize-space()='Subject']")).click();
      
      //subjectpage
	
      //driver.findElement(By.id("name")).sendKeys("Sub-7");
      //driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
      Thread.sleep(3000);

      //Teacher dashboard
     // driver.findElement(By.xpath("//span[normalize-space()='Teacher']")).click();
     // driver.findElement(By.xpath("//a[normalize-space()='Add Teacher']")).click();
      
//      //teacherpage
	    


      
      
      
//      driver.findElement(By.xpath("//input[@id='index_number']")).sendKeys("v"+jlib.getRandom());
//      driver.findElement(By.xpath("//input[@id='full_name']")).sendKeys("vijayalaxmi");
//      driver.findElement(By.xpath("//input[@id='i_name']")).sendKeys("vj");
//      driver.findElement(By.xpath("//input[@id='address']")).sendKeys("bellary");
//    WebElement dd = driver.findElement(By.xpath("//select[@id='gender']"));
//    Select sel =new Select(dd);
//    sel.selectByIndex(1);
//     driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("874-901-2569");
//     driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Veeresha"+jlib.getRandom()+mail);
//     driver.findElement(By.xpath("//input[@id='fileToUpload']")).sendKeys("C:\\Users\\Veeresha K\\Pictures\\hpllp details.png");
//     driver.findElement(By.xpath("//button[@id='btnSubmit']")).click();
//     Thread.sleep(5000);
     //subject routing dashboard

      // WebElement subjectrou = driver.findElement(By.xpath(""));
      // subjectrou.click();
//     //subject routing page 
//      driver.findElement(By.xpath("//a[normalize-space()='Add']")).click();
//     WebElement selectgrade = driver.findElement(By.xpath("(//select[@class='form-control'])[1]"));
//     Select sel2= new Select(selectgrade);
//     sel2.selectByIndex(2);
//     WebElement selectsubjec = driver.findElement(By.id("subject"));
//     Select sel3= new Select(selectsubjec);
//     sel3.selectByIndex(1);
//    WebElement selectTeacher = driver.findElement(By.id("teacher"));
//    Select sel4= new Select(selectTeacher);
//    sel4.selectByIndex(1);
//         driver.findElement(By.id("fee")).sendKeys("2500");
//         driver.findElement(By.id("btnSubmit")).click();
//	
//	}
//}
}}