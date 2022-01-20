package testing.sample;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features="Feature\\Agros.Feature",glue="org.sample")

public class Testrunnerclass extends AbstractTestNGCucumberTests {
	

}
