package com.testng.extentreport;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;
import java.awt.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class SetupCheck {

	
//	public void extentdemo() {
//		
//		//create an object to initiate extent report engine
//		
//		ExtentReports extentReports=new ExtentReports();
//		
//		//initiate extent report reporter --> SparkReporter
//		//give the path of the folder in which extent report has to be created
//		ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter("C:\\Users\\HP\\eclipse-workspace\\TestNg-Phase2-Project\\extent-report\\report.html");
//		
//		//attach ExtentReports object to ExtentSparkReporter object
//		extentReports.attachReporter(extentSparkReporter);
//		extentReports.flush();
//		
//	}
	
	//OR
	
	@Test
	public void extentDemo2() throws IOException {
		
		ExtentReports extentReports=new ExtentReports();
		File file=new File("extentreports.html");
		ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter(file);
		extentReports.attachReporter(extentSparkReporter);
		
		//dummy test case add to report
		
		ExtentTest test1=extentReports.createTest("Test1");
		test1.pass("Test case pass");
		
		ExtentTest test2=extentReports.createTest("Test2");
		test2.pass("Test case pass");
		
		ExtentTest test3=extentReports.createTest("Test2");
		test3.log(Status.FAIL, "This test has failed");
		
		ExtentTest test4=extentReports.createTest("Test2");
		test4.skip( "This test has skipped");
		
		
		extentReports.flush();
		
		//automatically open the report for you on your desktop browser
		Desktop.getDesktop().browse(new File("extentreports.html").toURI());
		
	}
	
}
