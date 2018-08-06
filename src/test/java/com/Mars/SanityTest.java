package com.Mars;

import org.testng.annotations.Test;

import com.Mars.Pages.LoginPage;
import com.Mars.Pages.SanityTestPage;
import com.aventstack.extentreports.Status;

public class SanityTest extends BaseTest {

	@Test
	public void Sanitymars() throws InterruptedException {

		testLog = reports.createTest("LoginTest");
		testLog.log(Status.INFO, "Test Started");
		testLog.log(Status.INFO, "Browser Started and application Launched");
		LoginPage page = new LoginPage(driver);
		page.loginMars();

		Thread.sleep(15000);
		SanityTestPage test = new SanityTestPage(driver);
		test.sanityMars();
		testLog.log(Status.PASS, "User able to click on login button");

		testLog.log(Status.PASS, "User Logged in Successfully");
		
		
	}
}
