package com.automation.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.Base.Base;


public class page1_Login extends Base {
	public page1_Login() {
	PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(name="username")
	  WebElement username;
	
	
	@FindBy(name="password")
	  WebElement password;
	
	@FindBy(name="submit")
	  WebElement submit;
	
	
	public page2_selectfacility login (String uname,String pass) {
	    
		username.sendKeys(uname);
		password.sendKeys(pass);
		submit.click();
		return new page2_selectfacility();
		
	
	}
	
}


