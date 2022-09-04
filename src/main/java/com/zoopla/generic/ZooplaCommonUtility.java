package com.zoopla.generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.zoopla.basepage.ZooplaBasePage;

public class ZooplaCommonUtility extends ZooplaBasePage{//we extends basepage here because we need driver 
	//from the basepage.
	
	
	//Action Click
	public static void getActionClick(WebElement elm) {
		//We are using parameterized method because by using parameterized method
		//we can call this function anywhere in the project.
		// WebElement is from selenium.
		Actions obj = new Actions(driver);
		obj.click(elm).build().perform();//Mostly we are using Actions class
	}//We are not using it directly in coding level we are using it in generic package under 
	//common utility class.
	
	//JS Click
	public static void getJSClick(WebElement elm) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", elm);
	}// JS is more powerful but it's slow. So most of the time we will use the Action class.
	
	public static boolean getVerifyTheResult(String Actual, String Expected) {
      Assert.assertEquals(Actual, Expected);//testng
      if (Expected.equals(Actual)) {
			System.out.println("Expected And Actual are equal");
		}else {
			System.out.println("Expected And Actual are not equal");
		}
		return true;}
}
//get.click() is a bad approach. Sometimes it may fail. For this reason actionclick() is the best approach.
//If some elements are not clickable by actionclick() then we use JS click.


