package com.Mars.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Helper.BrowserFactory;

public class SanityTestPage {

//	WebDriver driver;

	public SanityTestPage(WebDriver driver) {

		PageFactory.initElements(BrowserFactory.driver, this);

	}

	
	@FindBy(how = How.XPATH, using = "//*[@id=\"account-profile-section\"]/div/section[1]/div/a[1]")
	@CacheLookup
	WebElement dashBoard;

	public void sanityMars() {

		dashBoard.click();

	}

}
