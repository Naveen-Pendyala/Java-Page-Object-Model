package com.Mars.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Helper.BrowserFactory;

public class LoginPage

{
	WebDriver driver;

	public LoginPage(WebDriver driver) {

		PageFactory.initElements(BrowserFactory.driver, this);

	}

	// 1.Click on Sign to login to the application
	@FindBy(how = How.XPATH, using = "//*[@id=\"home\"]/div/div/div[1]/div/a[2]")
	@CacheLookup
	WebElement clickSignin;

	// 2.Enter the email address
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/form/div[1]/input")
	@CacheLookup
	WebElement userName;

	// 3.Enter the username
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/form/div[2]/input")
	@CacheLookup
	WebElement password;

	// 4.Click on login button to login in to the application
	@FindBy(how = How.XPATH, using = "/html/body/div[2]/div/div/div[1]/form/div[4]/div")
	@CacheLookup
	WebElement loginButton;

	// 5.Click on login button to login in to the application
	@FindBy(how = How.XPATH, using = "//*[@id=\"account-profile-section\"]/div/section[1]/div/a[3]")
	WebElement Listings;

	public void loginMars() {

		clickSignin.click();

		// 1.Enter user name
		userName.sendKeys("naveen.pendy@gmail.com");

		// 2.Enter Password
		password.sendKeys("Test#@123");

		// 3.Click login button
		loginButton.click();

		// 4.Click profile button
		Listings.click();

	}

}
