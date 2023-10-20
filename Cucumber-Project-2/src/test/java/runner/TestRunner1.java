package runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "C:\\Users\\HP\\eclipse-workspace\\Cucumber-Project-2\\src\\test\\java\\features\\wikipage.feature",
	glue = {"steps"},
	dryRun = false,
	plugin = {"pretty",
			  "html:target/TestreportToday.html"}, 
	monochrome = true, // console output will be in more readable format
	tags = "@login"
		
		)


public class TestRunner1 {

}