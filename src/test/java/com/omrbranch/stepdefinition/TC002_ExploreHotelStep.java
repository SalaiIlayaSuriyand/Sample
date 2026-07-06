package com.omrbranch.stepdefinition;

import org.junit.Assert;

import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC002_ExploreHotelStep {
	

	PageObjectManager pom = new PageObjectManager();
	
	@When("User search hotel {string}, {string}, {string}, {string}, {string}, {string}, {string} and {string}")
	public void userSearchHotelAnd(String State, String City, String RoomType, String CheckInDate, String CheckOutDate, String noOfRoom, String noOfAdults, String NoOfChilds) throws InterruptedException {
	
	pom.getExploreHotelPage().userSearchHotelWithAllDetails(State, City, RoomType, CheckInDate, CheckOutDate, noOfRoom, noOfAdults, NoOfChilds);
	Thread.sleep(2000);
	
	}
	
	@When("User search hotel {string}, {string}, {string}, {string}, {string} and {string}")
	public void userSearchHotelAnd(String State, String City, String CheckInDate, String CheckOutDate, String NoOfRoom, String NoOfAdults) throws InterruptedException {
		pom.getExploreHotelPage().userSearchHotelMandateFields(State, City, CheckInDate, CheckOutDate, NoOfRoom, NoOfAdults);
		Thread.sleep(2000);
		pom.getSelectHotelPage().selectHotelMsg();
		Thread.sleep(2000);
	}

	@When("User click sort from low to high")
	public void userClickSortFromLowToHigh() {

	}
	

	@When("User click sort from descending order")
	public void userClickSortFromDescendingOrder() {
	}
	
	@When("User click Suite room type")
	public void userClickSuiteRoomType() {

	}
	
	@Then("User should verify after filtering that Suite room type is listed")
	public void userShouldVerifyAfterFilteringThatSuiteRoomTypeIsListed() {

	}

	@Then("User should verify after search hotel success message {string}")
	public void userShouldVerifyAfterSearchHotelSuccessMessage(String SearchSuccessMsg) {
		String ActualMessage = pom.getSelectHotelPage().selectHotelMsg();
		Assert.assertEquals("Validate Welcome Hotel Msg", SearchSuccessMsg, ActualMessage);
		
	}

	@Then("User should verify the header contains {string}")
	public void userShouldVerifyTheHeaderContains(String string) {
	  
	}

	@Then("User should verify after sorting that names are listed in descending order")
	public void userShouldVerifyAfterSortingThatNamesAreListedInDescendingOrder() {
	
	}

	@Then("User click Search button")
	public void userClickSearchButton() {

	}
	@Then("User should verify after search hotel error message {string}, {string}, {string}, {string}, {string} and {string}")
	public void userShouldVerifyAfterSearchHotelErrorMessageAnd(String string, String string2, String string3, String string4, String string5, String string6) {

	}
	
	@Then("User should verify after sorting that prices are listed from low to high")
	public void userShouldVerifyAfterSortingThatPricesAreListedFromLowToHigh() {

	}
}

