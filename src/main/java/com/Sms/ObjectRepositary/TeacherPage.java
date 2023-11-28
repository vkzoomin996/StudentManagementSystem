package com.Sms.ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TeacherPage {
@FindBy(xpath="//input[@id='index_number']")
private WebElement indexno;
@FindBy(xpath="//input[@id='full_name']")
private WebElement fullname;
@FindBy(xpath="//input[@id='i_name']")
private WebElement nameintial;
@FindBy(xpath="//input[@id='address']")
private WebElement address;
@FindBy(xpath="//select[@id='gender']")
private WebElement gender;
@FindBy(xpath="//input[@id='phone']")
private WebElement phone;
@FindBy(xpath="//input[@id='email']")
private WebElement email;
@FindBy(xpath="//input[@id='fileToUpload']")
private WebElement fileupload;
@FindBy(xpath="//button[@id='btnSubmit']")
private WebElement subtn;


public TeacherPage(WebDriver driver)
{
	PageFactory.initElements(driver , this);
}
public WebElement getIndexno() {
	return indexno;
}

public WebElement getFullname() {
	return fullname;
}

public WebElement getNameintial() {
	return nameintial;
}

public WebElement getAddress() {
	return address;
}

public WebElement getGender() {
	return gender;
}

public WebElement getPhone() {
	return phone;
}

public WebElement getEmail() {
	return email;
}

public WebElement getFileupload() {
	return fileupload;
}

public WebElement getSubtn() {
	return subtn;
}
 	

public void teacherpage(WebDriver driver,  String indexnoo ,String fullnamee,String inamee,String addres ,String phoneno ,String emaill ,String filetoupload   ) {
	indexno.sendKeys(indexnoo);
 	fullname.sendKeys(fullnamee);
	nameintial.sendKeys(inamee);
	address.sendKeys(addres);
     Select sel = new Select(gender);
     sel.selectByIndex(2);
     phone.sendKeys(phoneno);  
     
     email.sendKeys(emaill);
     fileupload.sendKeys(filetoupload);
     subtn.click();
     


}
}    