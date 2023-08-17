package com.Sms.ObjectRepositary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Sms.GenericUtility.JavaUtility;

public class SubjectRoutingPage {
@FindBy(xpath="//a[normalize-space()='Add']")
private WebElement add;
@FindBy(xpath="(//select[@class='form-control'])[1]")
private WebElement selectgrade;
@FindBy(id="subject")
private WebElement selectsubject;
@FindBy(id="teacher")
private WebElement selectteacher;
@FindBy(id="fee")
private WebElement fee;
@FindBy(id="btnSubmit")
private WebElement btnSubmit; 
public SubjectRoutingPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public WebElement getAdd() {
	return add;
}
public WebElement getSelectgrade() {
	return selectgrade;
}
public WebElement getSelectsubject() {
	return selectsubject;
}
public WebElement getSelectteacher() {
	return selectteacher;
}
public WebElement getFee() {
	return fee;
}
public WebElement getBtnSubmit() {
	return btnSubmit;
}
public void subrouting()
{
	JavaUtility jlib= new JavaUtility();
	int random = jlib.getRandom();
	add.click();
	Select sel= new Select(selectgrade);
	sel.selectByIndex(2);
	Select sel1= new Select(selectsubject);
	sel1.selectByIndex(1);
	Select sel2= new Select(selectteacher);
	sel2.selectByIndex(1);
	fee.sendKeys("2500"+random)  ;
	btnSubmit.click();
}
  
 
 
  

}
 