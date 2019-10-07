package com.scp.java.business.logic;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(value = ReportListener.class)
public class XFunTest {

	@Test(dataProvider = "logindata",dataProviderClass = TestData.class)
	public void m1(String u,String p,String m) {
		System.out.println("inside m1-- XTest");
	}
	
	
	@Test(enabled = false)
	public void m2() {
		System.out.println("inside m2-- XTest");
	}
	
	
	@Test(enabled = false)
	public void m3() {
		System.out.println("inside m3-- XTest");
	}
	
	@Test(enabled = false)
	public void m11() {
		System.out.println("inside m11-- XTest");
	}
	
	
	@Test(enabled = false)
	public void m22() {
		System.out.println("inside m22-- XTest");
	}
	
	
	@Test(enabled = false)
	public void m33() {
		System.out.println("inside m33-- XTest");
	}

}
