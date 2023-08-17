package com.Sms.ObjectRepositary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GradePage {
	@FindBy(id="name")
	private WebElement   name;
	
	@FindBy(id="admission_fee")
	private WebElement   admission_fee;
	
	
	@FindBy(id="hall_charge")
	private WebElement   hall_charge;
	
	
	@FindBy(id="btnSubmit")
	private WebElement   btn;
	
	@FindBy(id="mark_range_text_1")
	private WebElement   mark_range_text_1;
	
	@FindBy(id="mark_grade_text_1")
	private WebElement   mark_grade_text_1;
	
	@FindBy(id="btnSubmit1")
	private WebElement   btnSubmit1;

public GradePage(WebDriver driver)
	{
		PageFactory.initElements(driver , this);
	}
//utilization
public WebElement getName() {
		return name;
	}
	public WebElement getAdmission_fee() {
		return admission_fee;
	}
	public WebElement getHall_charge() {
		return hall_charge;
	}
	public WebElement getBtn() {
		return btn;
	}
	public WebElement getMark_range_text_1() {
		return mark_range_text_1;
	}
	public WebElement getMark_grade_text_1() {
		return mark_grade_text_1;
	}
	public WebElement getBtnSubmit1() {
		return btnSubmit1;
	}
//business lib
	public void gradepage(  String gradename, String admissionfee, String hallcharge    ) throws Throwable {
		name.sendKeys(gradename);
		admission_fee.sendKeys(admissionfee); 
		hall_charge.sendKeys(hallcharge);
		btn.click();
		
	}
	public void addrange(String markrangetext1, String markgradetext1) {
		mark_range_text_1.sendKeys(markrangetext1);
		mark_grade_text_1.sendKeys(markgradetext1);
		btnSubmit1.click();
}}


 