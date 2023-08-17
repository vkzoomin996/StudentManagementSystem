package com.Sms.ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdatemystudentPage {
	@FindBy(xpath="//a[@class='btn btn-info btn-xs']" )
	private WebElement   edit ;
	
	
	@FindBy(xpath="//input[@id='email']" )
	private WebElement   email ;
	
	@FindBy(xpath="//button[@id='btnSubmit']" )
	private WebElement   update ;
	
	//intialization
			public UpdatemystudentPage(WebDriver driver)
			{
				PageFactory.initElements(driver , this);
			}

			public WebElement getEdit() {
				return edit;
			}

			public WebElement getEmail() {
				return email;
			}

			public WebElement getUpdate() {
				return update;
			}
			
			
			// business lib
			
			public void updatemystudent() throws InterruptedException {
				edit.click();
				email.clear();
				Thread.sleep(3000);
				email.sendKeys("pooja@gmail.com");
				update.click();

}}
