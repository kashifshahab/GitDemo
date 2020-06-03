package CucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//Feature file

//@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Features", glue="StepDifinitions")
														   //Package Name
public class TestRunner extends AbstractTestNGCucumberTests{

}
