package com.Sms.ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Sms.GenericUtility.WebDriverUtility;

public class My_paymentsPage {
	 
	@FindBy(xpath="//h3[normalize-space()='My Payment History']")
	private WebElement  mypaymenthistory;
 	
 	@FindBy(xpath="//tr[@class='odd']//a[@class='btn btn-success btn-xs'][normalize-space()='View Invoice']")
	private WebElement  viewinvoice;
 
 	@FindBy(xpath="//div[@class='panel panel-info']//div[@class='panel-body']")
	private String  srcshot;
 	
 	@FindBy(xpath="//h3[normalize-space()='INVOICE - #261']")
	private WebElement  invoiceno; 
  	
 	@FindBy(xpath="//span[@class='glyphicon glyphicon-remove']")
	private WebElement   closebtn;
 	
 	@FindBy(xpath="//tr[@class='odd']//a[@class='btn btn-info btn-xs'][normalize-space()='View Details']")
     private WebElement   viewdetails;
 	
 	@FindBy(xpath="//h3[contains(text(),'Monthly Fee for July')]")
	private WebElement   monthlyfe;
 	
 	@FindBy(xpath="//div[@class='panel-heading bg-aqua-active']//span[@class='glyphicon glyphicon-remove']")
	private WebElement  cancelbtn;
 	
 	//intialization
 			public My_paymentsPage(WebDriver driver)
 			{
 				PageFactory.initElements(driver , this);
 			}
 			//Utilization
 			
 			public WebElement getMypaymenthistory() {
 				return mypaymenthistory;
 			}

 			public WebElement getViewinvoice() {
 				return viewinvoice;
 			}

 			public String getSrcshot() {
 				return srcshot;
 			}

 			public WebElement getInvoiceno() {
 				return invoiceno;
 			}

 			public WebElement getClosebtn() {
 				return closebtn;
 			}

 			public WebElement getViewdetails() {
 				return viewdetails;
 			}

 			public WebElement getMonthlyfe() {
 				return monthlyfe;
 			}

 			public WebElement getCancelbtn() {
 				return cancelbtn;
 			}
 			
 			
 			// business lib
 			public void mypaypage(    ) throws Throwable {
 				String	text	=mypaymenthistory.getText();
 			if( text.equalsIgnoreCase("My Payment History")) {
 				System.out.println("my payment preview page should be displayed");
 			}
 			else
 			{
 				System.out.println("my payment preview page should not be displayed");
 		
 			}
   				viewinvoice.click();
   				
   				String invoicenoo=invoiceno.getText();
   				System.out.println(invoicenoo);
   			 if( invoicenoo.equalsIgnoreCase("INVOICE - #261"))
   			{
   				System.out.println("invoice page should be displayed");
   			}else {
   				System.out.println("invoice page should not be displayed");

   			}
   			WebDriverUtility wlib=new WebDriverUtility();
   			// wlib.getScreenShot( driver, srcshot  );
  				closebtn.click();
 				viewdetails.click();
 				String	monthlyfee=monthlyfe.getText();
 				if(monthlyfee.equalsIgnoreCase("Monthly Fee for July")) {
 					System.out.println("Monthly Fee for July page should be displayed");
 				}
 				else
 				{
 					System.out.println("Monthly Fee for July page should not  be displayed");
 			
 				}
  				cancelbtn.click();
				   
   			}
 				

}
