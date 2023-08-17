package com.Sms.ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Sms.GenericUtility.WebDriverUtility;

public class Addstudent {
	WebDriverUtility wlib = new WebDriverUtility();
	@FindBy(xpath="//a[@class='btn btn-success btn-sm pull-right']" )
	private WebElement   add;
	
	@FindBy(id="day" )
	private WebElement   selectday;
	
	@FindBy(xpath="//select[@name='grade_id']" )
	private WebElement   selectgrade ;
	
	@FindBy(xpath="//select[@id='subject']" )
	private WebElement   subject ;
	
	@FindBy(xpath="//select[@id='classroom']" )
	private WebElement  classroom  ;
	
	@FindBy(xpath="//input[@id='start_time']" )
	private WebElement  starttime  ;
	
	@FindBy(xpath="//input[@id='end_time']" )
	private WebElement  endtime  ;
	
	@FindBy(xpath="//button[@id='btnSubmit']" )
	private WebElement  subbtn  ;
	
	//intialization
			public Addstudent(WebDriver driver)
			{
				PageFactory.initElements(driver , this);
			}

	public WebElement getAdd() {
		return add;
	}

	
	public WebElement getSelectday() {
		return selectday;
	}

	

	public WebElement getSelectgrade() {
		return selectgrade;
	}

	

	public WebElement getSubject() {
		return subject;
	}

	

	public WebElement getClassroom() {
		return classroom;
	}

	

	public WebElement getStarttime() {
		return starttime;
	}

	

	public WebElement getEndtime() {
		return endtime;
	}

	

	public WebElement getSubbtn() {
		return subbtn;
	}
	
	
	public void Addstudent(String value, String value1)
	{
			 
		add.click();
		
		wlib.selec1t(selectday, "Tuesday");
		selectgrade.click();
		wlib.selec1t(selectgrade, "Grade 1");
		subject.click();
		wlib.selec1t(subject, "DBMS");
		classroom.click();
		wlib.selec1t(classroom, "Class C");
		starttime.click();
		starttime.sendKeys(value);
		endtime.click();
		endtime.sendKeys(value1);
		subbtn.click();
		
		

}
	

}
