package com.scp.java.business.logic;

import org.testng.Assert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(value = ReportListener.class)
public class LoginTest {

	@BeforeClass
	public void x1() {
		System.out.println("before class");
	}
	
	@AfterClass
	public void x2() {
		System.out.println("After class");
	}
	
	@BeforeMethod
	public void x3() {
		System.out.println("before MEthod");
	}
	
	@AfterMethod
	public void x4() {
		System.out.println("After method");
	}
		
	public void m1(String unm,String pwd,String emsg) {
		System.out.println(unm +" : " +pwd +" " +emsg);
		LoginFunctionality loginFun = new LoginFunctionality();
		String actualMsg = loginFun.verifyUserCredentionls(unm, pwd);
		Assert.assertEquals(actualMsg, emsg);
	}
	
	
	
	@Test(priority = 1)
	public void verifyInvalidCredentails() {
		LoginFunctionality loginFun = new LoginFunctionality();
		String actualMsg = loginFun.verifyUserCredentionls("Admin", "admin123");
		Assert.assertEquals(actualMsg, AppConstants.LOGIN_SUCCESS);

	}
	

	public void calculate(int num1,int num2) throws InvalidParamTwoExcep {
		if (num2==0) {
			throw new InvalidParamTwoExcep("Second Number cannot be Zero");
		}
		
	}
	
}


/**
TEST
	SUITE --  All Test classes and Methods
	CLASS -- atleast one Test Method
	METHOD -- any method annotated with @Test
	
	TEST
	GROUPS

	
	before 
	
		Suite -- collection of all test methods irrective of test classes
		class -- any java class with atleast one test method
		method -- any instance method annoated with @Test or written inside ny classes
				which is been annoated with @Test
		Test -- logically collection of Test classes
		Group -- Logically Grouping of Test Methods irrespective of classes
		
	
			After
			
	
	
	aaaa	bbbb	Invalid Credentionals

*/



class InvalidParamTwoExcep extends Exception{
		public InvalidParamTwoExcep(String msg) {
			super(msg);
		}
}