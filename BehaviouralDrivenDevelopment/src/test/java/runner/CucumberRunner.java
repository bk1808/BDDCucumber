package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/* this class is a centralised place to execute all feature files with the 
 * help of step defenition file. I will combine all the feature files with
 * step defenition file without any extra coding required. It can be 
 * integrated with TestNG using @CucumberOptions annotation*/

/* @CucumberOptions annotation is responsible to glue together 'feature files'
 * and 'step defenition files' also it will give help us by giving attributes
 * to develop different kind of reporting*/

/* to run CucumberRunner clss, every single runner class extends to a class
 * called AbstractTestNGCucumberTests - this class is responsible to pickup
 * each and every feature file for execution*/

/* for the below annotation provide the feature file path along with step_defenition file package name
 * tags = "@Smoke or @Regression" anyone will execute
 * tags = "@Smoke and @Regression" all of them will execute 
 * tags = "not @Smoke" to execute all the scenarior except the ones which have @Smoke as tag
 * tags will execute individually 
 * dryRun = it accepts boolean value, it fills the gap of step definition, i t matches the feature file steps with step defenition methods, it will check
 * and give the output accordingly
 * if we give dryRun = false it executes all the scripts normally*/

@CucumberOptions(features = { "./src/test/java/features" }, glue = { "step_defenitions", "hook" }, tags = "@Search", 

dryRun = true,

plugin = {
		"html:Reports/CucumberReport.html", "json:Reports/CucumberJSONReport.json", 
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class CucumberRunner extends AbstractTestNGCucumberTests {

}
