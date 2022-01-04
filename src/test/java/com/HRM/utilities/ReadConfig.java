package com.HRM.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties po;
	public ReadConfig() {
		 File f = new File(".\\Configurations\\config.properties");
		 
		 try {
			  po=new Properties();
			FileInputStream fi=new FileInputStream(f);
			po.load(fi);
		} catch (Exception e) {
			System.out.println("Unable to load file"+e);
		}
	}
	public String getURL() {
		String url =po.getProperty("url");
		return url;
	}
	public String getUsernameL() {
		String userName =po.getProperty("userrName");
		return userName;
	}
	public String getPassWord() {
		String pass =po.getProperty("passWord");
		return pass;
	}
	public String getChromeDriverPath() {
		String value =po.getProperty("chrome");
		return value;
	}
	public String getFirefoxDriverPath() {
		String value =po.getProperty("firefox");
		return value;
	}
	
}
