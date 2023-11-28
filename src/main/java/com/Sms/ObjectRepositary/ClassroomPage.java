package com.Sms.ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClassroomPage {
	
@FindBy(xpath="//input[@id='name']")
private WebElement classroomname ;

@FindBy(xpath="//input[@id='student_count']")
private WebElement stdcount ;

@FindBy(xpath="//button[@id='btnSubmit']")
private WebElement subbtn ;

public ClassroomPage(WebDriver driver)
{
	PageFactory.initElements(driver , this);
}

public WebElement getClassroomname() {
	return classroomname;
}

public WebElement getStdcount() {
	return stdcount;
}

public WebElement getSubbtn() {
	return subbtn;
}
//business lib
public void classroomdetails(WebDriver driver,String classname, String studentcount) {
	classroomname.sendKeys(classname);
	stdcount.sendKeys(studentcount);
	subbtn.click();
	
	
}
}
 