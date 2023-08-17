package com.Sms.ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Sms.GenericUtility.WebDriverUtility;

public class MySonsExamhistoryPage {
	WebDriverUtility wlib=new WebDriverUtility();

	@FindBy(xpath="//select[@id='year']")
	private  WebElement selectyear;
	
	@FindBy(xpath="//select[@id='exam']")
	private  WebElement selectexam;
	
	
	@FindBy(id="btnSubmit")
	private  WebElement submitbtnn;	

	@FindBy(xpath="//h2[normalize-space()='2017 - Term 1 Exam']")
	private  WebElement Exammarks;
	
	//intialization
			public MySonsExamhistoryPage(WebDriver driver)
			{
				PageFactory.initElements(driver , this);
			}
			//utilization
			public WebElement getSelectyear() {
				return selectyear;
			}
			public WebElement getSelectexam() {
				return selectexam;
			}
			public WebElement getSubmitbtnn() {
				return submitbtnn;
			}
			public WebElement getExammarks() {
				return Exammarks;
			}
			public void mysonwxamhis(   )
			{
				selectyear.click();
				 wlib.select(selectyear, "2017")	;
				 selectexam.click();
				 wlib.select(selectexam, 1);
 				

				 submitbtnn.click();
				 String Exammarkss = Exammarks.getText();
				 if(Exammarkss.equalsIgnoreCase("2017 - Term 1 Exam")) {
						
						System.out.println("2017 - Term 1 Exam result should be displyed");
						
					}
					else
					{
						
						System.out.println("2017 - Term 1 Exam result should not be displyed");
					}
				 
				 


			}
}
