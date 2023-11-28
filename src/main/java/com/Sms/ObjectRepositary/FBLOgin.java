package com.Sms.ObjectRepositary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBLOgin {
	@FindBy(id="name")
	private WebElement username;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="lnbtn")
	private WebElement loginbtn;
	public FBLOgin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getUsername() {
		return username;
	}
	public void setUsername(WebElement username) {
		this.username = username;
	}
	public WebElement getPassword() {
		return password;
	}
	public void setPassword(WebElement password) {
		this.password = password;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	public void setLoginbtn(WebElement loginbtn) {
		this.loginbtn = loginbtn;
	}
	public void fblogin() {
		username.sendKeys("bsjb");
		password.sendKeys("jfj");
		loginbtn.click();
	}

}
