package com.scp.java.business.logic;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ReportListener implements ITestListener {
	
	static int passcount=239;
	static int skipcount=30;
	static int failcount=34;
	
	@Override
	public void onFinish(ITestContext arg0) {
			try {
				System.out.println(passcount);
				System.out.println(failcount);
				System.out.println(skipcount);
				ReportGen.generatePieChart(passcount,failcount,skipcount);
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		failcount++;
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		skipcount++;
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		passcount++;
	}

}
