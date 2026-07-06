package com.omrbranch.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.utility.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(id="email")
	 	private WebElement Txtemail;
		
		@FindBy (id="pass")
		private WebElement TxtPassword;
		
		@FindBy(xpath="//button[text()='Login']")
		private WebElement BtnLogin;
		
		@FindBy(id="errorMessage")
		private WebElement GetLoginErrorMsgTxt;
		
		
		public void login(String emailId, String password) {
			sendKeysElement(Txtemail, emailId);
			sendKeysElement(TxtPassword, password);
			clickElement(BtnLogin);
		}
		
		public String getLoginErrorMsgText() {
			String text = GetLoginErrorMsgTxt.getText();
			return text;
			
		}

		public void loginEnterKey(String emailId, String password) {
			sendKeysElement(Txtemail, emailId);
			sendKeysElementEnter(TxtPassword, password);
			
		}
				
		public String getLoginErrorMessageText() {
			String GetErrorMsg = getTextElement(GetLoginErrorMsgTxt);
			return GetErrorMsg;			
		}
}
