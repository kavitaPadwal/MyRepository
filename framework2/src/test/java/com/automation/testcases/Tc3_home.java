package com.automation.testcases;

import org.testng.annotations.Test;

import com.automation.Base.Base;
import com.automation.pages.page1_Login;
import com.automation.pages.page2_selectfacility;
import com.automation.pages.page3_homepage;


@Test
public class Tc3_home extends Base {
	
	public void home() {
		page1_Login login;
		page2_selectfacility facility;
		page3_homepage home;
		
		
		login=new page1_Login();
		home=new page3_homepage();
		facility=login.login(excel.getStringData("Login", 0, 0),excel.getStringData("Login", 0, 1));
		 home.clickonaddnew(excel.getStringData("Login",2, 0)); 
		
	}

}
     