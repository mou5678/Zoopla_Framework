package zoopla.myrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin= {"pretty","json:target/cucumber.json" },
	//plugin={"pretty","html:Extend_Report/Sanityresult.html"},//this is to get the report of 
	//the test result in html format and it will automatically be saved in Extend_Report file 
	//and pretty means in a nice format
	features = "./Features",// This is for the path of the feature folder where we have the scenario
	glue = "zoopla/stepdef",//This is for the path of the step definition class where 
	//we have all the executable code
	dryRun = false,// by default false 
	//If we add any extra steps in our scenario then by using dryRun=true 
	//we can get the code for only that extra step.We don't need to get all the 
	//code for all the scenario again.
	// dryRun=true means stop the execution and give me new steps.
   // If false then do the execution.
	monochrome = true,// Its make the console more readable for us.
	tags = "@Sanity" // by this we can run the specific test
	)
public class ZooplaMyRunnerClass extends AbstractTestNGCucumberTests {
}
//After all the configurations in @CucumberOptions we have to extends the runner class to
//AbstractTestNGCucumberTests then we have to run the runner class


