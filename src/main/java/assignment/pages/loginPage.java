package assignment.pages;

import org.openqa.selenium.By;

public class loginPage {
	
	public static By txt_username = By.xpath("//input[@id='ap_email']");
	public static By btn_continue = By.xpath("//input[@id='continue']");
	public static By txt_password = By.xpath("//input[@id='ap_password']");
	public static By btn_signIn = By.xpath("//input[@id='signInSubmit']");
}
