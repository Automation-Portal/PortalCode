package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features= {"src/test/resources/AppFeatures/ISOPage.feature"},
        glue= {"StepDefinitions", "AppHooks"},
       plugin= {"pretty"},
    		   
    		   
       tags= "@SUBISOOMAHA"		
     
        )




public class PortalRunner { 

}



