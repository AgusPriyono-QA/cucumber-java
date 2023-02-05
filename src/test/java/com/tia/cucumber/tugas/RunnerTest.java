package com.tia.cucumber.tugas;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
	features = {"src/main/resources/features/01-LoginTask.feature"},
	glue = "com.tia.cucumber.tugas",
	plugin = {"pretty","html:target/cucumber-reports.html","json:target/cucumber.json"})
public class RunnerTest extends AbstractTestNGCucumberTests {

}
