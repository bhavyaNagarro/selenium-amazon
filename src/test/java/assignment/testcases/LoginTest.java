package assignment.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import assignment.pages.basePage;
import assignment.pages.homePage;
import assignment.pages.loginPage;

import assignment.utilities.ReadingPropertiesFile;

public class LoginTest extends basePage {
	@Test
	public void login() {

		driver.findElement(homePage.btn_signIn).click();
		
		driver.findElement(loginPage.txt_username).sendKeys(ReadingPropertiesFile.getProperty("username"));
		
		driver.findElement(loginPage.btn_continue).click();
		
		driver.findElement(loginPage.txt_password).sendKeys(ReadingPropertiesFile.getProperty("password"));
		
		driver.findElement(loginPage.btn_signIn).click();
		
		System.out.println("Login Test passed");
	}
}
