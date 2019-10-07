package com.scp.java.business.logic;

import org.testng.annotations.DataProvider;

public class TestData {


	@DataProvider(name = "logindata")
static	public Object[][] test_data() {
		Object [][] data = new Object[8][3];
		
		data[0][0]="";
		data[0][1]="";
		data[0][2]=AppConstants.EMPTY_USERNAME;
		
		data[1][0]="admin123";
		data[1][1]="Admin";
		data[1][2]=AppConstants.LOGIN_FAILED;
		
		data[2][0]="ADMIN";
		data[2][1]="";
		data[2][2]=AppConstants.LOGIN_FAILED;
		
		data[3][0]="ad";
		data[3][1]="admin123";
		data[3][2]=AppConstants.LOGIN_FAILED;
		
		data[4][0]="Admin";
		data[4][1]="admin";
		data[4][2]=AppConstants.LOGIN_FAILED;
		
		data[5][0]="";
		data[5][1]="admin";
		data[5][2]=AppConstants.EMPTY_USERNAME;
		
		data[6][0]="Admin";
		data[6][1]="";
		data[6][2]=AppConstants.EMPTY_PASSWORD;
		

		data[7][0]="Admin";
		data[7][1]="admin123";
		data[7][2]=AppConstants.LOGIN_SUCCESS;
		
		return data;
	}

	
}
