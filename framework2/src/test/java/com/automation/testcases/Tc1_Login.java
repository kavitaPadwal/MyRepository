package com.automation.testcases;



import org.testng.annotations.Test;

import com.automation.Base.Base;
import com.automation.pages.page1_Login;
import com.automation.pages.page2_selectfacility;




public class Tc1_Login extends Base {
	@Test
	public void login() {
		
		
		
		page1_Login login=new page1_Login();
		login.login(excel.getStringData("Login", 0, 0),excel.getStringData("Login", 0, 1));
		
		
	}

}
