package test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\david\\git\\repository\\110820\\src\\main\\java\\feature\\oh.feature",
		glue= {"step"},
		plugin = {"pretty", "html:target/Destination"} 
		,tags= {"@Tourism", "@Russia"})
public class TestRunner {

}
