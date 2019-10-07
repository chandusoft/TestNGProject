package com.scp.java.business.logic;

import static com.scp.java.business.logic.AppConstants.*;

public class LoginFunctionality {
	String DB_USER="Admin";
	String DB_PASS = "admin123";
	
	public String verifyUserCredentionls(String user,String passwd) {
			String returnval = LOGIN_FAILED;
			if(user==null || user.length()==0) {
				returnval=EMPTY_USERNAME;
			}else if(passwd==null || passwd.length()==0) {
				returnval=EMPTY_PASSWORD;
			}else if(DB_USER.equals(user) && DB_PASS.equals(passwd)) {
				returnval=LOGIN_SUCCESS;
			}
			return returnval;
	}
	
}
