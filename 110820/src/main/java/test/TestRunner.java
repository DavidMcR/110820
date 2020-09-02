package test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\david\\git\\repository\\110820\\src\\main\\java\\feature\\oh.feature",
		glue= {"step"}
		,tags= {"@SmokeTest"})
public class TestRunner {

}
