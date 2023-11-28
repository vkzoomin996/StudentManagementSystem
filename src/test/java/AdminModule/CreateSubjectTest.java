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
    	  
 
}}