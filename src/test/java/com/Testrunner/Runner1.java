package com.Testrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//Cucumber class
@RunWith(Cucumber.class)
@CucumberOptions(

	//	features = "src/test/resources/Features/Addvacancy.feature", 
		features = "C:\\workspace\\OHRMcucumber\\src\\test\\resources\\Features\\Addvacancy.feature", 
		glue = { "com.StepDefinition" }, 
	//	glue = { "Stepdefinition" },
		plugin = {"pretty", "html:src/test/resources/Reports/cucumber-html-report", "json:src/test/resources/Reports/cucumber-html-report/jsonreport",
				"com.cucumber.listener.ExtentCucumberFormatter:src/test/resources/Reports/Extentreports/Extentreport.html" },// tags = {"@tc_03_recruiter" }, 
				monochrome = true)
 //tags = { }

public class Runner1 {
	@AfterClass
	public static void extendReport() {
		Reporter.loadXMLConfig("src\\test\\resources\\configproperties\\extent_config.xml");
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Windows");
		Reporter.setTestRunnerOutput("Sample test runner output message");

}}
