package com.zoopla.elementspage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoopla.basepage.ZooplaBasePage;

public class ZooplaLoginElementsPage extends ZooplaBasePage{ //Inheritance concept

public	ZooplaLoginElementsPage(){//It's a constructor
	    // This initElements method will create all WebElements
		PageFactory.initElements(driver, this);//PageFactory is a class and initElements is a static method                                                                                                    
		//WebElements are created by using the driver instance and  we get access to webdriver by extending 
		//the BasePage and "this" which refers to the current class property.
		}
@FindBy(linkText="Sign in")
@CacheLookup // It means computer cache memory which helps to run faster
private WebElement ClickonSignin;// private variable which is Encapsulation concept
public WebElement getClickonSignin() {// getter method to get the access to private variable
	return ClickonSignin;
}
@FindBy(xpath="//input[contains(@type,'email')]")
@CacheLookup
private WebElement userName;
public WebElement getUserName() {
	return userName;
}
@FindBy(id="password")
@CacheLookup
private WebElement password;
public WebElement getPassword() {
	return password;
}
public void getUserNameAndPassword(String uName, String pwd) {//In this parameterized method we combine 
	//line 27 and 33 method together and declare 2 new variable uName And pwd.
	getUserName().sendKeys(uName);
	getPassword().sendKeys(pwd);
}
@FindBy(xpath="//*[@id='main-content']/div/div/form/div[6]/div/button")
@CacheLookup
private WebElement clickonloginbutton;
public WebElement getclickonloginbutton()  {
	return clickonloginbutton;
}
@FindBy(xpath="//*[text()='Welcome back to your account']")
@CacheLookup
private WebElement verifytext;
public WebElement getverifyText()  {
	return verifytext;
}
}