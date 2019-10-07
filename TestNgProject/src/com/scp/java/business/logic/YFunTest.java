package com.scp.java.business.logic;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(value = ReportListener.class)
public class YFunTest {


	@BeforeSuite
	public void xm1() {
		System.out.println("inside before suite11");
	}
	
	
	@Test(groups = {"A","C"})
	public void m1() {
		System.out.println("inside m1-- YTest");
	}
	
	
	@Test
	public void m2() {
		System.out.println("inside m2-- YTest");
	}
	
	
	@Test
	public void m3() {
		System.out.println("inside m3-- YTest");
	}
	

	@Test
	public void m11() {
		System.out.println("inside m11-- YTest");
	}
	
	
	@Test
	public void m22() {
		System.out.println("inside m22-- YTest");
	}
	
	@AfterSuite
	public void xm2() {
		System.out.println("inside After suite");
	}
	
	
	@Test
	public void m33() {
		System.out.println("inside m33-- YTest");
	}
	

	@Test
	public void m111() {
		System.out.println("inside m111-- YTest");
	}
	
	
	@Test
	public void m222() {
		System.out.println("inside m222-- YTest");
	}
	
	
	@Test
	public void m331() {
		System.out.println("inside m333-- YTest");
	}
}
