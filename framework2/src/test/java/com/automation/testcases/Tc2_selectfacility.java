package com.automation.testcases;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.automation.Base.Base;
import com.automation.pages.page1_Login;
import com.automation.pages.page2_selectfacility;
import com.automation.pages.page3_homepage;
import com.automation.utilities.common;
import com.automation.testcases.*;


public class Tc2_selectfacility extends Base  {
	@Test
	public void Selectfacility() {
		page1_Login login;
		page2_selectfacility facility;
		page3_homepage home;
		 login=new page1_Login();
	      facility=login.login(excel.getStringData("Login", 0, 0),excel.getStringData("Login", 0, 1));
	      
	 home=facility.Selectfacilitydropdown(excel.getStringData("Login", 1, 0));
		 
		
		
		
		
		
		
		/*page2_selectfacility obj= new page2_selectfacility();
		//page2_selectfacility obj=PageFactory.initElements(driver,page2_selectfacility.class);
	      //obj.Selectfacilitydropdown().selectByVisibleText("cityHospital");
		common.SelectByvisibleText( obj.Selectfacilitydropdown(),excel.getStringData("Login", 1, 0));*/
		
	      
	   
	}
	
	
}
