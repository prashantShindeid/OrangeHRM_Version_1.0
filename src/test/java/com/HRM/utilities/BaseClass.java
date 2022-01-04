package com.HRM.utilities;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public WebDriver driver;
	ReadConfig rd=new ReadConfig();
	public String url= rd.getURL();
	public String userrName=rd.getUsernameL();
	public String passWord=rd.getPassWord();
	public Logger log;
	@Parameters("browser")
	@BeforeClass
	public void setup(String browser) {
	 try {
			if(browser.equalsIgnoreCase("chrome")) {
				log=org.apache.logging.log4j.LogManager.getLogger();
				//System.setProperty("webdriver.chrome.driver", rd.getChromeDriverPath());
				WebDriverManager.chromedriver().setup();
			    driver = new ChromeDriver();
			    driver.manage().window().maximize();
			    driver.get(url);
			    log.info("Browser lanched Sucessfully");	
			}else if(browser.equalsIgnoreCase("firefox")) {
				log=org.apache.logging.log4j.LogManager.getLogger();
				//System.setProperty("webdriver.gecko.driver", rd.getFirefoxDriverPath());
				WebDriverManager.firefoxdriver().setup();
			    driver = new FirefoxDriver();
			    driver.manage().window().maximize();
			    driver.get(url);
			    log.info("Browser lanched Sucessfully");
			}
	} catch (Exception e) {
		 log.error("Browser did not lanched"+e);
	}
	}

	@AfterClass
	public void tearDown() {
		try {
			driver.quit();
			log.info("Browser is close Successfully");
			log.info("******End of Test Case******");
		} catch (Exception e) {
			log.info("Browser is not close "+e);
		}
		
	}
}
