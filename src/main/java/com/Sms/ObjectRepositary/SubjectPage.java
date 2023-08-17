package com.Sms.ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SubjectPage {
@FindBy(xpath="//input[@id='name']")
private WebElement subname;
@FindBy(xpath="//button[normalize-space()='Submit']")
private WebElement Submitbtn;

public SubjectPage(WebDriver driver)
{
	PageFactory.initElements(driver , this);
}
public WebElement getSubname() {
	return subname;
}
public WebElement getSubmitbtn() {
	return Submitbtn;
}

//business lib
public void subpage(String Subject) {
	subname.sendKeys(Subject);
	Submitbtn.click();
}

}
