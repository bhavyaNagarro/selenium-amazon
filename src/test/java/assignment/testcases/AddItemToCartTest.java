package assignment.testcases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import assignment.pages.addItemToCart;
import assignment.pages.basePage;

public class AddItemToCartTest extends basePage{
	
	@Test
	public void addItemToCart() {
		driver.findElement(addItemToCart.slider_offersPage).click();
		
		System.out.println("Add To Cart Test Case Passed");
	}

}
