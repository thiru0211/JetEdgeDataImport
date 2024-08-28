package com.JetEdgeDI.RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\thirumaran\\eclipse-workspace\\JetEdgeDataImport\\src\\test\\resources\\FeatureFiles\\JE_DI_3_FOS_File_Upload.feature",
glue = "com.JedEdgeDI.StepDefinition",
//monochrome = true,
//dryRun = true,
//tags="@TC_42",
plugin = {"pretty","html:Reports/TestReport.html",
		"json:target/cucumber/cucumber.json",
		"html:Reports/cucumber-reports.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		})
public class JE_DI_3_FOSFileUploadRunnerTest {

}
