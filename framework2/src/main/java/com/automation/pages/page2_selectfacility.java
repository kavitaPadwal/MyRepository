package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automation.Base.Base;
import com.automation.utilities.common;

public class page2_selectfacility extends Base  {
	
    
	
	public page2_selectfacility() {
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(name="facilityname")
	  WebElement dropdown;
	
	
	@FindBy(xpath="//input[@value='Submit']")
	    WebElement submit;
	
	
	
      
    	public page3_homepage Selectfacilitydropdown(String text) {
    		common.SelectByvisibleText(dropdown, text);
    	    submit.click();
    	    return new page3_homepage();
    	}
    	  
    	
    /*	public void clickonsubmit() {
    		submit.click();
			
    	}*/
    	

    	
      }

