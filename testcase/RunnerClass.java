package testcase;

import base.BaseClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/features",
glue={"pages"},
monochrome=true,
publish=true,
plugin = {"pretty", "html:reports/cucumber-report.html"})

public class RunnerClass extends BaseClass {
	
	
	
	
	}
