package com.omrbranch.stepdefinition;

import org.junit.Assert;

import com.omrbranch.pagemanager.PageObjectManager;
import com.omrbranch.pages.ExploreHotelPage;

import io.cucumber.java.en.*;

public class TC001_LoginSetup {
	PageObjectManager pom = new PageObjectManager();

	@Given("User is on the OMR Branch hotel page")
	public void userIsOnTheOMRBranchHotelPage() {
	    
	}
	
	@When("User enters {string} and {string}")
	public void userEntersAnd(String emailId, String password) {
	    pom.getLoginPage().login(emailId, password);
	}
	
	@Then("User should verify success message after login {string}")
	public void userShouldVerifySuccessMessageAfterLogin(String expLoginMessage) {
		String actLoginSuccessMessageText = pom.getExploreHotelPage().getLoginSuccessMessageText();
		Assert.assertEquals("Verify succcess message after login", expLoginMessage, actLoginSuccessMessageText);
	}

	@When("User enters {string} and {string} with enter key")
	public void userEntersAndWithEnterKey(String emailId, String password) {
	    pom.getLoginPage().loginEnterKey(emailId, password);
	}

	@Then("User should verify error message after login {string}")
	public void userShouldVerifyErrorMessageAfterLogin(String exploginErrorMessage) {
		String actLoginErrorMessageText = pom.getLoginPage().getLoginErrorMessageText();
		boolean contains = actLoginErrorMessageText.contains(exploginErrorMessage);
		Assert.assertTrue("Verify after login with error message", contains);
	}
}
