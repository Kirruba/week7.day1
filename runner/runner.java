package week7.day1.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/week7/day1/feature", glue = "week7.day1.steps", monochrome = true, publish = true, tags = "@lead")
public class runner extends AbstractTestNGCucumberTests {

}
