package com.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	public static void reports(String Jsonreport) {
		File jsonFile = new File("C:\\Users\\UDAY MADHU\\eclipse-workspace\\MavenCucumber\\src\\test\\resources\\Report");
		
		Configuration config =new Configuration(jsonFile, "AdacinHotelJvmReport");
		config.addClassifications("OS", "Windows11");
		config.addClassifications("Browser", "Chrome");
		config.addClassifications("Sprint", "52");
		config.addClassifications("Report BY", "Uday");
		
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(Jsonreport);
		
		
		ReportBuilder rBuilder = new ReportBuilder(jsonFiles, config);
		rBuilder.generateReports();
		
		
	}
	

}
