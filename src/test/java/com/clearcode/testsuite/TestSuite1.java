package com.clearcode.testsuite;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.clearcode.po.HomePage;
import com.clearcode.po.LoginPage;
import com.clearcode.po.MenuBar;
import com.clearcode.po.PatientPage;

import dataProvider.TestData;

public class TestSuite1 extends TestSetup{

	@Test(enabled=false,priority=1,dataProvider="admin",dataProviderClass=TestData.class)
	public void createPatient(String userName, String password) throws InterruptedException {
		wdu.type(LoginPage.username_ip, userName);
		wdu.type(LoginPage.pwd_ip, password);
		wdu.click(LoginPage.login_btn);
		/*wdu.mouseOver(MenuBar.patient_menu);
		wdu.click(MenuBar.newPatient_menu);
		wdu.selectByVisibleText(PatientPage.title_select, data[2]);
		wdu.type(PatientPage.fname_ip, data[3]);
		wdu.type(PatientPage.lname_ip, data[4]);*/
		
	}
	
	@Test(dataProvider="SearchPatient",dataProviderClass=TestData.class)
	public void searchPatient(String user, String pwd, String title, String fname, String lname) throws InterruptedException {
		wdu.type(HomePage.username_ip, user);
		wdu.type(HomePage.pwd_ip, pwd);
		wdu.click(HomePage.login_btn);
		wdu.mouseOver(MenuBar.patient_menu);
		wdu.click(MenuBar.newPatient_menu);
		wdu.selectByVisibleText(PatientPage.title_select, title);
		wdu.type(PatientPage.fname_ip, fname);
		wdu.type(PatientPage.lname_ip, lname);
	}*/
	
}
