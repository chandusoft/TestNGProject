package com.scp.java.business.logic;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(value = ReportListener.class)
public class ZFunTest {


	@Test
	public void m1() {
		System.out.println("inside m1-- ZTest");
	}
	
	
	@Test
	public void m2() {
		System.out.println("inside m2-- ZTest");
	}
	
	
}
