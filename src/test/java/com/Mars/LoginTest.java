package com.Mars;

import org.testng.annotations.Test;

import com.Mars.Pages.LoginPage;
import com.aventstack.extentreports.Status;

public class LoginTest extends BaseTest {

	@Test
	public void loginMars() {

		testLog = reports.createTest("LoginTest");
		testLog.log(Status.INFO, "Test Started");

		LoginPage page = new LoginPage(driver);
		page.loginMars();

		testLog.log(Status.PASS, "Logged in Successfully");
	}
}
