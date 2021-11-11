package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"C:\\Users\\sonal\\eclipse-workspace\\01Phase2_Project_END\\src\\test\\java\\com\\features"},
		glue = {"com.steps"},
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"timeline:test-output-thread/",
				"html:cucumberhtml",
				"json:jsonReports/cucumber.json",
				"junit:CucumberReports/cucmber.xml"
				
		},
		tags = "@Contact"
		
		)


public class TestRunner {

}
