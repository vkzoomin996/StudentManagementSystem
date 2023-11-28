 package com.Sms.GenericUtility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
 @Listeners(com.Sms.GenericUtility.ListenerImpClass.class)
public class ListenerImpClass  implements ITestListener {
	ExtentReports report;
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result   ) {
		// Executing starts from here
		String methodname = result.getMethod().getMethodName();
	      test=report.createTest(methodname);
	      Reporter.log(methodname+"------>testscript execution statred");
		

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		test.log(Status.PASS, methodname+"----->passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String failed= result.getMethod().getMethodName()+new JavaUtility().getSystemdate();

		//String FScript =result.getMethod().getMethodName();
		//String FailedScript = FScript+new JavaUtility().getSystemdate();
	     EventFiringWebDriver edriver= new EventFiringWebDriver(BaseClass.sdriver);
		 File src =edriver.getScreenshotAs(OutputType.FILE);
		 File dest= new File("./Screenshotss/FailedScript1.png");
		 try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
 			e.printStackTrace();
		}
		 test.log(Status.FAIL, failed+"------->failed");
		 test.log(Status.FAIL, result.getThrowable());
		 Reporter.log(failed+"-------->TestScreipt Failed");
		 
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methodname = result.getMethod().getMethodName();
		test.log(Status.SKIP, methodname+"------>skipped");
		test.log(Status.SKIP,result.getThrowable());
		Reporter.log(methodname+"----->testScript skipped");

  	}

	@Override
	public void onStart(ITestContext context) {
		//create html report
		ExtentSparkReporter htmlreport= new ExtentSparkReporter("./ExtentReport/report.html");
		htmlreport.config().setDocumentTitle("Student management system");
		htmlreport.config().setTheme(Theme.STANDARD);
		htmlreport.config().setReportName("parent");
		
		
		ExtentReports report= new ExtentReports();
		report.attachReporter(htmlreport);
		report.setSystemInfo("OS", "Windows");
		report.setSystemInfo("Base-Browser","chrome");
		report.setSystemInfo("Base-url","http://rmgtestingserver/domain/Student_Management_System/view/login.php");
        report.setSystemInfo("reporter Name", "Veeresha K");
		 
	}

	@Override
	public void onFinish(ITestContext context) {
	
		//consolidate the report
		report.flush();
	}

}
