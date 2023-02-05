package com.tia.cucumber.order;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
	features = {"src/main/resources/features/02-Order.feature"},
	glue = "com.tia.cucumber.order",
	plugin = {"pretty","html:target/cucumber-reports.html","json:target/cucumber.json"})
public class RunnerTest extends AbstractTestNGCucumberTests {

}
