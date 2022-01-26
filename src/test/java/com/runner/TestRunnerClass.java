package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.report.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun= false, monochrome = true, plugin= {"json:src\\test\\resources\\Report\\ouput.json"} ,features = { "src\\test\\resources" }, glue = { "com.stepdef" })
public class TestRunnerClass {

	@AfterClass
	public static void jvmReport() {
		JvmReport.reports("C:\\Users\\UDAY MADHU\\eclipse-workspace\\MavenCucumber\\src\\test\\resources\\Report\\ouput.json");

	}

}
