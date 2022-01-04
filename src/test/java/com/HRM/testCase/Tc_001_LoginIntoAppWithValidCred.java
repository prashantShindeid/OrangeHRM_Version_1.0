package com.HRM.testCase;

import org.testng.Assert;

import com.HRM.pages.HRM_LoginPage;
import com.HRM.utilities.BaseClass;

 

public class Tc_001_LoginIntoAppWithValidCred extends BaseClass{

 
	@org.testng.annotations.Test
	public void hrm_Login() {
		
	    	HRM_LoginPage lp=new HRM_LoginPage(driver);
	    	lp.setUserName(userrName);
	    	log.info("username set a "+userrName);
	    	lp.setPassword(passWord);
	    	log.info("password is set a"+passWord);
	    	lp.loginButton();
	    	log.info("Clicked to login button");
	    	
	    	String expectedTitle="OrangeHRM";
	    	if(driver.getTitle().equals(expectedTitle)) {
	    		 
	    		log.info("Actual title"+driver.getTitle()+"is macthed with Expected title "+expectedTitle);
	    		 Assert.assertTrue(true, "Expected title & Actual title has matched");
	    	}else {
	    		System.out.println("Title did not matched");
	    		Assert.assertTrue(false, "Expected title & Actual title did not matched");
	    	}
	}
}
