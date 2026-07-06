package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.utility.BaseClass;

public class ExploreHotelPage extends BaseClass{

	public ExploreHotelPage(){
		PageFactory.initElements(driver, this);

	}
		@FindBy(xpath="//a[contains(text(),'Welcome')]")
		private WebElement WelcomeMsg;
	
		@FindBy(xpath="//a[contains(text(),'Welcome')]")
		private WebElement welcomeMsg;
		
		@FindBy(id="state")
		private WebElement selectState;
		
		@FindBy(xpath="//span[@title='Select City *']")
		private WebElement clickselectCity;
		
		@FindBy(xpath="//input[@type='search']")
		private WebElement searchCityTxtBox;
		
		@FindBy(xpath="//textarea[@class='select2-search__field']")
		private WebElement selectRoomType;
		
		@FindBy(name="check_in")
		private WebElement check_In_Date;
		
		@FindBy(name="check_out")
		private WebElement check_Out_Date;
		
		@FindBy(name="no_rooms")
		private WebElement noOfRoom;
		
		@FindBy(name="no_adults")
		private WebElement noOfAdults;
		
		@FindBy(id="no_child")
		private WebElement noOfChild;

		@FindBy(id="hotelsearch_iframe")
		private WebElement frameHotelSearchAndReset;
		
		@FindBy(xpath="//button[text()='Search']")
		private WebElement BtnSearch;
		
		
		public WebElement getSelectState() {
			return selectState;
		}

		public WebElement getClickselectCity() {
			return clickselectCity;
		}
		
		public WebElement getSearchCityTxtBox() {
			return searchCityTxtBox;
		}


		public WebElement getSelectRoomType() {
			return selectRoomType;
		}


		public WebElement getCheck_In_Date() {
			return check_In_Date;
		}


		public WebElement getCheck_Out_Date() {
			return check_Out_Date;
		}


		public WebElement getNoOfRoom() {
			return noOfRoom;
		}


		public WebElement getNoOfAdults() {
			return noOfAdults;
		}


		public WebElement getNoOfChild() {
			return noOfChild;
		}


		public WebElement getFrameHotelSearchAndReset() {
			return frameHotelSearchAndReset;
		}


		public WebElement getBtnSearch() {
			return BtnSearch;
		}
		
		public String getLoginSuccessMessageText() {
			String WelcomeMessage = getTextElement(WelcomeMsg);
			return WelcomeMessage;
		}
		
		public void userSearchHotelWithAllDetails(String State, String City, 
				String RoomType, String CheckInDate, String CheckOutDate, 
				String Room, String Adults, String Child) {
			
			selectOptionByText(selectState, State);
			clickElement(clickselectCity);
			sendKeysElementEnter(searchCityTxtBox, City);
			sendKeysElementEnter(selectRoomType, RoomType);
			sendKeysElementJS(check_In_Date, CheckInDate);
			sendKeysElementJS(check_Out_Date, CheckOutDate);
			selectOptionByText(noOfRoom, Room);
			selectOptionByText(noOfAdults, Adults);
			sendKeysElementEnter(noOfChild, Child);
			driver.switchTo().frame(frameHotelSearchAndReset);
			clickElement(BtnSearch);
			driver.switchTo().defaultContent();		
		}
		
	public void userSearchHotelMandateFields
	(String State, String City, 
			String CheckInDate, 
			String CheckOutDate, String Room, String Adults) {
		
		selectOptionByText(selectState, State);
		clickElement(clickselectCity);
		sendKeysElementEnter(searchCityTxtBox, City);
		sendKeysElementJS(check_In_Date, CheckInDate);
		sendKeysElementJS(check_Out_Date, CheckOutDate);
		selectOptionByText(noOfRoom, Room);
		selectOptionByText(noOfAdults, Adults);
		
		driver.switchTo().frame(frameHotelSearchAndReset);
		clickElement(BtnSearch);
		driver.switchTo().defaultContent();
				    
		}
	}

