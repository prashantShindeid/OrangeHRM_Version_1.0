package com.HRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HRM_LoginPage {

	WebDriver driver;
	
	@FindBy(xpath = "//input[@id='txtUsername']")
	WebElement userName;
	
	@FindBy(xpath = "//input[@id='txtPassword']")
	WebElement passWord;
	
	@FindBy(xpath = "//input[@id='btnLogin']")
	WebElement logginButton;
	
	 
	   public  HRM_LoginPage(WebDriver d) {
		   driver=d;
		   PageFactory.initElements(driver, this);
	   }
	   public void setUserName(String userNameValue) {
		 userName.sendKeys(userNameValue);    
	   }
	  public void setPassword(String password) {
		 passWord.sendKeys(password);
	   }
	  public void loginButton() {
		   logginButton.click();   
	  }

}
