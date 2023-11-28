package com.Sms.GenericUtility;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	/**
	 * This method is used to maximize the window
	 * @param driver 
	 * 
	 */
	public void maximize(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	/**
	 * this method is used to wait for page load
	 * @param driver
	 */
	public void waitforpageload(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	/**
	 * this method is used to wait until element to be visible
	 * @param diver 
	 * @param element 
	 * 
	 */
	public void waitUntilElementtobevisible(WebDriver diver, WebElement element) {
		WebDriverWait  wait= WebDriverWait(diver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public WebDriverWait WebDriverWait(WebDriver diver, int i) {
		// TODO Auto-generated method stub
		return null;
	}
	/**
	 * this method is used for to handle dropdown using index
	 * @param element 
	 * @param element
	 * @param index 
	 */
	public void select(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	/**
	 * This method is used to handle dropdown using value
	 * @param element 
	 * @param element
	 * @param value 
	 */
	public void select(WebElement element, String value)
	{
		Select sel=new Select(element);
		sel.selectByValue(value);
	}
	/**
	 * This method is used to handle dropdown using text
	 * @param element 
	 * @param text
	 * @param element
	 * @param Text 
	 * @param element 
	 * @param Text 
	 */
	public void selec1t(WebElement element , String Text)
	
	{
		Select sel=new Select(element);
		sel.selectByVisibleText(Text);
	}
	/**
	 * This method will perform MouseHover action
	 * @param driver 
	 * @param driver
	 * @param element 
	 * @param element
	 */
	public void mousehover(WebDriver driver, WebElement element)
	{
		Actions act= new Actions(driver);
		act.moveToElement(element).click().perform();

}
	/**
	 * This method will perform drag and drop action
	 * @param driver 
 	 * @param src
 	 * @param dst
	 */
	public void dragAndDrop(WebDriver driver, WebElement src, WebElement dst)
	{
		Actions act =new Actions(driver);
		act.dragAndDrop(src, dst);
	}
	/**
	 * This method will double click on webpage
	 * @param driver 
	 * @param driver
	 * 
	 */
	public void doubleClickAction(WebDriver driver) 
	{
		Actions act = new Actions(driver);
		act.doubleClick().perform();
	}
		
	/**
	 * This method will perform right click on WebPage
	 * @param driver 
	 */
	public void rightClick(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.contextClick().perform();

	}
	/**
	 * This method will perform right click on element
	 * @param driver 
	 * @param driver
	 * @param element 
     */
	public void rightClick(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.contextClick(element).perform();

	}
	/**
	 * This Method will Press enter Key
	 * @param driver 
	 * @param driver
	 */
	public void enterKeyPress(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();

	}
	/**
	 * This method will press enter Key using robot 
	 * @param driver
	 * @throws Throwable 
	 */
	public void enterKey(WebDriver driver) throws Throwable
	{

		Robot rb = new Robot();
 		rb.keyPress(KeyEvent.VK_ENTER);
	}
	/**
	 * This method is used to release the key
	 * @throws Throwable 
	 * 
	 * 
	 */
		public void enterRelease() throws Throwable
		{
			Robot rb= new Robot();
			rb.keyRelease(KeyEvent.VK_ENTER);
		}
		/**
		 * This method will switch the frame based on index
		 * @param driver
		 * @param index
		 */
		public void switchToFrame(WebDriver driver,int index)
		{
			driver.switchTo().frame(index);
		}
		/**
		 * this method will switch the frame based on name or ID
		 * @param driver 
		 * @param namrOrID 
		 * 
		 */
		public void switchToFrame(WebDriver driver, String namrOrID)
		{
			driver.switchTo().frame(namrOrID);
		}
		/**
		 * this method will switch the frame based on address
		 * @param address 
		 * @param  
		 */
		public void switchToFrame(WebDriver driver, WebElement address ) 
		{
			driver.switchTo().frame(address);
		}
		/**
		 * This method  is used to cancel alert popup
		 * 
		 */
		public void acceptAlert(WebDriver driver)
		{
			driver.switchTo().alert().accept();
		}
		/**
		 * This method is used to cancel alert popup
		 */
		
		public void cancelAlert(WebDriver driver)
		{
			driver.switchTo().alert().dismiss();
		}
		/**
		 * This method will switch between windows
		 * @param driver
		 * @param partialTitle
		 */
		public void switchToWindow(WebDriver driver, String partialTitle)
		{
			//step1: use getWindowHandes to capture all window id's
			Set<String> windows = driver.getWindowHandles();
			
			//step2: iterate through the windows
			Iterator<String> it = windows.iterator();
			
			//step3: check whether there is next window
			while(it.hasNext())
			{
				//step4: capture current window id
				String winId = it.next();
				
				//step5: switch to current window and capture title 
				String currentWinTitle = driver.switchTo().window(winId).getTitle();
				
				//step6: check whether current window is expected
				if(currentWinTitle.contains(partialTitle))
				{
					break;
				}
			}
		}
		
		
		/**
		 * This method will take screenshot and store it in folder called as screenshot
		 * @param driver
		 * @param srcshot 
		 * @param srcshot 
		 * @param srcshot 
		 * @param srcshot 
		 * @param srcshot
		 * @return 
		 * @return
		 * @throws Throwable
		 */
		public static  String getScreenShot(WebDriver driver, String srcshot   ) throws Throwable
			{
				TakesScreenshot ts = (TakesScreenshot) driver;
				File src = ts.getScreenshotAs(OutputType.FILE);
				String path = ".\\screenshot\\"+srcshot+".png";
				File dst = new File(path);
				FileUtils.copyFile(src, dst);
				return srcshot;
				
				
				
			}
		
		/**
		 * This method will perform random scroll
		 * @param driver
		 */
		public void scrollBarAction(WebDriver driver)
		{
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,800)","");
		}
		
		
		/**
		 * This method will scroll until specified element is found
		 * @param driver
		 * @param element
		 */
		public void scrollAction(WebDriver driver, WebElement element)
		{
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			int y = element.getLocation().getY();
			jse.executeScript("window.scrollBy(0,"+y+")", element);
			//jse.executeScript("argument[0].scrollIntoView()", element);
		}
		 
		
		public void moveoffset(WebDriver driver, int i, int j) {
 Actions act =new 	Actions(driver);
 act.moveByOffset(i, j).perform();
		}
		public void releaseTab() throws AWTException {
 Robot r = new 	Robot();
 r.keyRelease(KeyEvent.VK_ENTER);
		}
		public void enterKeyPress1() throws Throwable {
			 Robot r = new 	Robot();
			 r.keyPress(KeyEvent.VK_ENTER);
		}
		public void enterKeyPress() {
			// TODO Auto-generated method stub
			
		}
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
































































































