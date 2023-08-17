package com.Sms.ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declaration
	@FindBy(id="email")
	private WebElement  usernameedt;
	
	@FindBy(id="password")
	private WebElement  passwordedt;
	
	@FindBy(id="btnSubmit")
	private WebElement  submitbtn;
	
	//intialization
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver , this);
	}

	public WebElement getUsernameedt() {
		return usernameedt;
	}

	public WebElement getPasswordedt() {
		return passwordedt;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}
	//business library 
	public void login(String EMAIL,String PASSWORD ) {
		usernameedt.sendKeys(EMAIL);
		passwordedt.sendKeys(PASSWORD);
		submitbtn.click();
		
	
	 
		
	}
	
	
	
	

}
