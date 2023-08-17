package com.Sms.ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	@FindBy(xpath="//a[@href='my_payments.php']")
	private WebElement  mypaymentlink;
	//declaration
	@FindBy(xpath="//span[normalize-space()='Exam']")
	private WebElement examtele;
	
	@FindBy(xpath="//ul[@class='treeview-menu menu-open']")
	private WebElement examdd;
	
	@FindBy(xpath="//a[@href='my_sons_exam_marks_history.php']")
	private WebElement exammarkshistorybtn;
	
	
	
	@FindBy(xpath="//span[text()='My Student']")
	private WebElement mystudentel;
	
	@FindBy(xpath="//span[text()='Timetable']")
	private WebElement timetable;
	
	
	 
	
	@FindBy(xpath="//a[text()=' My Timetable']")
	private WebElement mytimetable;
	
 	
	@FindBy(xpath="//a[@href='grade.php']")
	private WebElement grade;
	
 	
 	@FindBy(xpath="//span[text()='Subject']")
	private WebElement Subject;
 	
 	@FindBy(xpath="//span[normalize-space()='Student']")
	private WebElement  student;
	
 	@FindBy(xpath="//a[normalize-space()='Add Student']")
	private WebElement  addstudent;
 	
 	@FindBy(xpath="//span[normalize-space()='Classroom']")
	private WebElement  classroom;
 	
 	@FindBy(xpath="//span[text()='Teacher']")
	private WebElement  teacher;
 	
 	@FindBy(xpath="//a[text()=' Add Teacher']")
	private WebElement  addteacher;
	 
 	@FindBy(xpath="//span[text()='Subject Routing']")
	private WebElement  subrouting;
		//intialization
		public DashboardPage(WebDriver driver)
		{
			PageFactory.initElements(driver , this);
		}
		//utilization
		public WebElement getMypaymentlink() {
				return mypaymentlink;
			}
		public WebElement getExamtele() {
			return examtele;
		}
		
		
		public WebElement getExamdd() {
			return examdd;
		}
		public WebElement getExammarkshistorybtn() {
			return exammarkshistorybtn;
		}
		
		public WebElement getTimetable() {
			return timetable;
		}
		 
		public WebElement getMytimetable() {
			return mytimetable;
		}
		public void dashboard()
		{
				mypaymentlink.click();
				 

		}
		public WebElement getMystudentel() {
			return mystudentel;
		}
		public WebElement getGrade() {
			return grade;
		}
		public WebElement getSubject() {
			return Subject;
		}
		public WebElement getStudent() {
			return student;
		}

		public WebElement getAddstudent() {
			return addstudent;
		}
		public WebElement getClassroom() {
			return classroom;
		}
		public WebElement getTeacher() {
			return teacher;
		}
		public WebElement getAddteacher() {
			return addteacher;
		}
		
		
		public WebElement getSubrouting() {
		return subrouting;
	}
	

		public void dashboardd()
		{
 				examtele.click();
				System.out.println(examdd.getText());
				exammarkshistorybtn.click();

		}public void dashbonavi()
		{
				 
			mystudentel.click();

	}
		public void dashaddstu()
		{
				 
			timetable.click();
			mytimetable.click();
		}
		 
		public void dashboardgrade() {
 			grade.click();

		}
		public void dssubb() {
			Subject.click();
		}
		public void dashstudent() {
			student.click();
			addstudent.click();
		}
		public void dashclassroom()
		{
			classroom.click();
		}
		public void dashteacher()
		{
			teacher.click();
			addteacher.click();
}
		public void dashsubrouting() {
 				subrouting.click();
 		}
}
