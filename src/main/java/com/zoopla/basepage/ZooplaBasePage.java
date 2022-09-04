package com.zoopla.basepage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ZooplaBasePage {
public static Logger logger; //we declare this variable to get the log file. Here Logger is a class.
public Properties prop;
public static WebDriver driver;

public ZooplaBasePage(){
logger = Logger.getLogger("Mousumi Dey");//to get the logger name
PropertyConfigurator.configure("log4j.properties");//this is for configuration with log4j.properties file.
	
	try {
		prop = new Properties();
		FileInputStream ip = new FileInputStream("./src/main/java/com/config/ZooplaConfig.properties");
        //System.getProperty("user.dir") + "/src/main/java/com/config/ZooplaConfig.properties");
	    prop.load(ip);}
	catch (FileNotFoundException e1) {
		e1.printStackTrace();}
	catch (IOException e) {
		e.printStackTrace();}
 }
public static void initialization() {
	//System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriverManager.chromedriver().setup();//To avoid the version change of the chrome driver
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);//waiting time for loading is 7 
	//seconds here.
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
}
}
