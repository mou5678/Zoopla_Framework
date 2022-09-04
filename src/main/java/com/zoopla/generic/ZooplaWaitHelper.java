package com.zoopla.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.zoopla.basepage.ZooplaBasePage;

public class ZooplaWaitHelper extends ZooplaBasePage {

	public static void waitUntilElementsToBePresent(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver,30);// 30 = 30 seconds is the waiting time.
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	}
//This is explicit wait. We can use it for any line of code when needed. for this reason we are keeping 
//it in a class so that I can call it by class name whenever needed.