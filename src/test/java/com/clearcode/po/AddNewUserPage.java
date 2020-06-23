package com.clearcode.po;

import org.openqa.selenium.By;

public class AddNewUserPage {
	public static By username_ip = By.id("user_login");
	public static By email_ip = By.id("email");
	public static By firstName_ip = By.id("first_name");
	public static By lastName_ip = By.id("last_name");
	public static By website_ip = By.id("url");
	public static By showPass_btn = By.xpath("//button[@type='button'][text()='Show password']");
	public static By password_ip = By.id("pass1-text");
	public static By select_role = By.id("role");
	public static By addNewUser_btn = By.id("createusersub");
	public static By confirmPass_chkBx = By.xpath("(//INPUT[@type='checkbox'])");
	public static By editUser_lnk = By.xpath("//*[@id='message']/p/a");
	public static By userDetails_tbl = By.xpath("//table[@class='wp-list-table widefat fixed striped users']");
	
}
