package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features= {"src/test/resources/AppFeatures/ISOPage.feature"},
        glue= {"StepDefinitions", "AppHooks"},
       plugin= {"pretty"},
    		   
    		 //*[@id="myId"]/div/table/tbody/tr/td/table/tbody/tr/td/table[4]/tbody/tr[1]/td/div/table[8]/tbody/tr/td/br
       tags= "@DeviceManagement"		
     
        )




public class PortalRunner { 

}




