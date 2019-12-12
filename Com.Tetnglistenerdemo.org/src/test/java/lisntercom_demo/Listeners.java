package lisntercom_demo;

import org.testng.TestListenerAdapter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends TestListenerAdapter{
	
	
		
	
	
	public void onTestStart(ITestResult result) {
		System.out.println("on test start");
		
	}
	
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("on test succes");
		
	}
	
	public void onTestFailure(ITestResult result) {
		System.out.println(" on test failuer");
		
	}
	
	public void onTestSkipped(ITestResult result) {
		
		System.out.println(" on test skipped");
	}
	
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("onTestFailedButWithinSuccessPercentage");
		
	}
	
	public void onStart(ITestContext context) {
		System.out.println("on start");
		
	}
	
	
	public void onFinish(ITestContext context) {
		System.out.println("on finish");
		
	}
	
	
	
}	
	
	