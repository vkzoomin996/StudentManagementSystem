package com.Sms.ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//img[@class='user-image']")
	
	private WebElement  sinoutprofile;
	
	@FindBy(xpath = "//span[text()='Dashboard']")
	private WebElement dashboard;
	
	@FindBy(xpath="//a[normalize-space()='Sign out']")
	private WebElement  sinoutbtn;


	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getDashboard() {
		return dashboard;
	}
	public WebElement getSinoutprofile() {
		return sinoutprofile;
	}
	public WebElement getSinoutbtn() {
		return sinoutbtn ;}
	
	public void signout( )    
	{
		dashboard.click();
		sinoutprofile.click();
		sinoutbtn.click();
	}
}
 