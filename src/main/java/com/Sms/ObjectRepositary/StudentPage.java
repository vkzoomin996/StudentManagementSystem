package com.Sms.ObjectRepositary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class StudentPage {
	
	@FindBy(xpath="//input[@id='index_number']")
	private WebElement indexno;
	
	@FindBy(xpath="//input[@id='full_name']")
	private WebElement fullno;
	
	@FindBy(xpath="//input[@id='i_name']")
	private WebElement iname;
	
	@FindBy(xpath="//input[@id='address']")
	private WebElement address;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='phone']")
	private WebElement phone;
	
	@FindBy(xpath="//input[@id='b_date']")
	private WebElement bdate;
	
	@FindBy(xpath="//select[@id='gender']")
	private WebElement sgender;
	
	@FindBy(xpath="//input[@id='fileToUpload']")
	private WebElement sphoto;
	
	@FindBy(xpath="//input[@id='g_full_name']")
	private WebElement gname;
	
	@FindBy(xpath="//input[@id='g_i_name']")
	private WebElement giname;
	
	@FindBy(xpath="//input[@id='g_address']")
	private WebElement gaddress;
	
	@FindBy(xpath="//input[@id='g_email']")
	private WebElement gemail;
	
	@FindBy(xpath="//input[@id='g_phone']")
	private WebElement gphone;
	
	@FindBy(xpath="//input[@id='g_b_date']")
	private WebElement gdob;
	
	@FindBy(xpath="//select[@id='g_gender']")
	private WebElement ggender;
	
	@FindBy(xpath="//input[@id='g_fileToUpload']")
	private WebElement gphoto;
	
	@FindBy(xpath="//button[@id='btnSubmit']")
	private WebElement btnsubmit;
	
	@FindBy(id="grade")
	private WebElement grade;
	
	@FindBy(xpath="//input[@value='17' or @value='18' ]")
	private WebElement checkbox;
	
	@FindBy(id="btnSubmit1")
	private WebElement btn1;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-md']")
	private WebElement btn;
	
	public StudentPage(WebDriver driver)
	{
		PageFactory.initElements(driver , this);
	}

	public WebElement getIndexno() {
		return indexno;
	}

	public WebElement getFullno() {
		return fullno;
	}

	public WebElement getIname() {
		return iname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getBdate() {
		return bdate;
	}

	public WebElement getSgender() {
		return sgender;
	}

	public WebElement getSphoto() {
		return sphoto;
	}

	public WebElement getGname() {
		return gname;
	}

	public WebElement getGiname() {
		return giname;
	}

	public WebElement getGaddress() {
		return gaddress;
	}

	public WebElement getGemail() {
		return gemail;
	}

	public WebElement getGphone() {
		return gphone;
	}

	public WebElement getGdob() {
		return gdob;
	}

	public WebElement getGgender() {
		return ggender;
	}

	public WebElement getGphoto() {
		return gphoto;
	}

	public WebElement getBtnsubmit() {
		return btnsubmit;
	}

	public WebElement getGrade() {
		return grade;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getBtn1() {
		return btn1;
	}

	public WebElement getBtn() {
		return btn;
	}
	 public void studpage()
	 {
		 
	 }
	
	
      
      
}
      