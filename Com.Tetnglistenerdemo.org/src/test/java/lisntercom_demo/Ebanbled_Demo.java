package lisntercom_demo;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Ebanbled_Demo {
	

	ExtentReports extentreport;
	ExtentHtmlReporter htmlreport;
	ExtentTest test;
	
	
	@BeforeClass
	public void beforclass() {
		extentreport=new ExtentReports();
		System.out.println("hiiiiiiiii");
		htmlreport=new ExtentHtmlReporter("F:\\Com.Tetnglistenerdemo.org\\test-output.html");
		extentreport.attachReporter(htmlreport);

		
		System.out.println(" i am before class");
		
		
		
	}
	
	@AfterClass
	public void afterclass() {
		
		extentreport.flush();
		
		System.out.println(" i am after class");
		
	}
	
	@BeforeMethod
	public void beforemethod() {
		
		System.out.println(" i am before method");
		
	}
	
	@Test(dependsOnMethods="openfacebook")
	public void opengoogle() {
		
		System.out.println("this is the open google");
		System.out.println("i am priority 1");
		
		Assert.assertEquals("mithun", "mithun");
	}
	
	@Test(enabled=true)
	public void openfacebook() {
		
		System.out.println("this is the open facebook");
		System.out.println(" i am priporty 0");
		Assert.assertEquals("sasi", "sasi");
	}
	
	@AfterMethod
	public void aftermethod() {
		
		System.out.println("i am after method");
		
	}

}
