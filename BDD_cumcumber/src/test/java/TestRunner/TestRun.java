package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="BDD_cumcumber\\Features\\Productbooking.feature",
		glue= {"stepDefinations"},
		monochrome=true,
		plugin= {"pretty","html:test-output"}
		
		
		
		)
		

public class TestRun 
{	
	
}
