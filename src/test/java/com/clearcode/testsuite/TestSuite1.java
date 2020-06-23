package com.clearcode.testsuite;


import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.clearcode.po.AddNewUserPage;
import com.clearcode.po.UserPage;
import com.clearcode.po.LoginPage;
import com.clearcode.po.MenuBar;

import dataProvider.TestData;

public class TestSuite1 extends TestSetup{

	@Test(priority=1,dataProvider="AdminLogin",dataProviderClass=TestData.class)
	public void adminLogin(String username, String password) throws InterruptedException {
		wdu.type(LoginPage.username_ip, username);
		wdu.type(LoginPage.pwd_ip, password);
		wdu.click(LoginPage.login_btn);
	}
	
	@Test(priority=10,dataProvider="AddNewUser",dataProviderClass=TestData.class)
	public void addNewUser(String user,String email,String fname, String lname, String url, String pwd, String role) throws InterruptedException {
		wdu.mouseOver(MenuBar.users_menu);
		wdu.click(MenuBar.addNewUser_menu);
		wdu.type(AddNewUserPage.username_ip, user);
		wdu.type(AddNewUserPage.email_ip, email);
		wdu.type(AddNewUserPage.firstName_ip, fname);
		wdu.type(AddNewUserPage.lastName_ip, lname);
		wdu.type(AddNewUserPage.website_ip, url);
		wdu.click(AddNewUserPage.showPass_btn);
		wdu.type(AddNewUserPage.password_ip, pwd);
		wdu.click(AddNewUserPage.confirmPass_chkBx);
		wdu.selectByVisibleText(AddNewUserPage.select_role, role);
		wdu.click(AddNewUserPage.addNewUser_btn);
		wdu.assertText(AddNewUserPage.editUser_lnk,"Edit user" );
		wdu.assertUserDetails(user, email, role);
	}
	
	@Test(priority=20,dataProvider="UserChangeRole",dataProviderClass=TestData.class)
	public void userChangeRole(String user,String role) throws InterruptedException {
		wdu.mouseOver(MenuBar.users_menu);
		wdu.click(MenuBar.allUser_menu);
		wdu.clickUserCheckBx(user);
		wdu.selectByVisibleText(UserPage.changeRole_LstBx, role);
		wdu.click(UserPage.change_btn);
		wdu.assertText(UserPage.changedRole_messg, "Changed roles.");
		wdu.verifyChangedRole(user, role);		
	}
		
}
