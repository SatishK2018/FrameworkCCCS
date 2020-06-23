package com.clearcode.po;

import org.openqa.selenium.By;

public class MenuBar {
	//new line
	public static By users_menu = By.xpath("//DIV[@class='wp-menu-name'][text()='Users']");
	public static By addNewUser_menu = By.xpath("//A[@href='user-new.php'][text()='Add New']");
	public static By allUser_menu = By.xpath("//A[@href='users.php'][text()='All Users']");
}
