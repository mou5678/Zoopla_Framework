package zoopla.stepdef;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import com.zoopla.basepage.ZooplaBasePage;
import com.zoopla.elementspage.ZooplaLoginElementsPage;
import com.zoopla.generic.ZooplaCommonUtility;
import com.zoopla.generic.ZooplaWaitHelper;
import io.cucumber.java.en.*;

public class ZooplaStepDefClass extends ZooplaBasePage {
	ZooplaLoginElementsPage pf;
	
	@Given("User able to open a any browser")
	public void user_able_to_open_a_any_browser() {
		logger.info("User able to open a any browser");
		ZooplaStepDefClass.initialization();//call the static method by the class name and all the function
// under this method will work.
//ZooplaElementsPageClass pf = new ZooplaElementsPageClass();If we do this then it will become local 
//and then we can't call it in other method.
		pf = new ZooplaLoginElementsPage();//we create here the object of elementspage so that we can use 
		//the elementspage as we can't extend it because we already extend one class here.
	}
	@Given("User able to enter {string} url")
	public void user_able_to_enter_url(String url) {
		logger.info("User able to enter url");
	   driver.get(url);//we call this with the help of the basepage WebDriver instance.
	}
	@When("User able to click on sign-in button")
	public void user_able_to_click_on_sign_in_button() {
		logger.info("User able to click on sign-in button");
	   pf.getClickonSignin().click(); //with the help of the elementspage instance we call this method.
	}
	@When("User able to enter valid userName & password")
	public void user_able_to_enter_valid_user_name_password() {
		logger.info("User able to enter valid userName & password");
		pf.getUserNameAndPassword(prop.getProperty("userName"), prop.getProperty("pwd"));
		//pf.getUserName().sendKeys("deym4346@gmail.com");
	  // pf.getPassword().sendKeys("#Sylhet2014@");
	}
	@When("User able to click on login button")
	public void user_able_to_click_on_login_button(){
		logger.info("User able to click on login button");
	//ZooplaCommonUtility.getActionClick(pf.getSignBTN());//Here the target element is the pf.getSignBTN
	//pf.getSignBTN().click();//We will not use it.
	ZooplaWaitHelper.waitUntilElementsToBePresent(pf.getclickonloginbutton());//waiting time
	ZooplaCommonUtility.getJSClick(pf.getclickonloginbutton());
	}
	@Then("User can verify the user information {string} on the grid")
	public void user_can_verify_the_user_information_on_the_grid(String text) {
		logger.info("User can verify the user information {string} on the grid");
	ZooplaCommonUtility.getVerifyTheResult(text, pf.getverifyText().getText());
	//Assert.assertEquals(text, pf.getverifyText().getText()); //by using assert class from testng
	// System.out.println(pf.getverifyText().getText());
	//if(text.equals(pf.getverifyText().getText())){      //by using java if else condition
	//System.out.println("Test is passed.");
	//}else {System.out.println("Test is not passed.");}
	
	}
}
