package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features= {"src/test/resources/AppFeatures/Login.feature"},
        glue= {"stepdefinations", "AppHooks"},
       plugin= {"pretty"
    		   
        }		
     
        )




public class PortalRunner {

}
