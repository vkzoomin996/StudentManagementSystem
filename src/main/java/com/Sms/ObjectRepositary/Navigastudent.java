package com.Sms.ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Sms.GenericUtility.WebDriverUtility;

public class Navigastudent {
	WebDriverUtility wlib=new WebDriverUtility();

	
	@FindBy(xpath="//select[@id='grade']")
	private WebElement Grade;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement submitbtn;
	//intialization
			public Navigastudent(WebDriver driver)
			{
				PageFactory.initElements(driver , this);
			}
			public WebElement getGrade() {
				return Grade;
			}
			public WebElement getSubmitbtn() {
				return submitbtn;
			}
			//business lib
			
			public void navigst()
			{
				Grade.click();
				wlib.selec1t(Grade,"Grade 1");
				submitbtn.click();
			}

}
