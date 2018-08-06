package com.Mars;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Helper.BrowserFactory;

public class BaseTest {

	protected WebDriver driver;
	protected ExtentHtmlReporter reporter;
	protected ExtentReports reports;
	protected ExtentTest testLog;

	@BeforeTest
	public void testInit() {

		reporter = new ExtentHtmlReporter("./reports/MarsTestReport.html");
		reports = new ExtentReports();
		reports.attachReporter(reporter);
	}

	@BeforeMethod
	protected void methodSetUp() {
		BrowserFactory.startBrowser("chrome");
		System.out.println("Method Set Up");
//		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
//		driver = new ChromeDriver();
	}

	@AfterMethod
	protected void methodtearDown(ITestResult result) {

		if (result.getStatus() == ITestResult.SUCCESS) {
			testLog.log(Status.PASS, "Test passed");

		} else if (result.getStatus() == ITestResult.FAILURE) {
			testLog.log(Status.FAIL, "Test failed");

		} else if (result.getStatus() == ITestResult.FAILURE) {
			testLog.log(Status.SKIP, "Test Skipped");

		}
		System.out.println("Method Tear Down");
		BrowserFactory.driver.quit();
	}

	@AfterTest
	public void clearUp() {
		reports.flush();
	}
}
