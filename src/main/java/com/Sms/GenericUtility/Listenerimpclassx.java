package com.Sms.GenericUtility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenerimpclassx  implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
	 System.out.println(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		 
	}

	@Override
	public void onTestFailure(ITestResult result) {
		 
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		 
	}

	 

	 

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}
 

}
