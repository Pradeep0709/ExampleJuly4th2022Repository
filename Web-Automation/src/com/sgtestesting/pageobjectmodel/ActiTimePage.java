package com.sgtestesting.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
		public ActiTimePage(WebDriver oBrowser)							
		{
			PageFactory.initElements(oBrowser,this);
		}
		private WebElement username;
		
		public WebElement getUsername()
		{
			return username;
		}
		private WebElement pwd;
		
		public WebElement getpassword()
		{
			return pwd;
		}
		
		@FindBy(xpath="//div[text()='Login ']")
		private WebElement oLogin;
		public WebElement getLogin()
		{
			return oLogin;
		}
		private WebElement gettingStartedShortcutsPanelId;
		public WebElement getMinimiseFlyWindow()
		{
			return gettingStartedShortcutsPanelId;
		}
		@FindBy(linkText="Logout")
		private WebElement oLogout;
		public WebElement getLogoutLink()
		{
			return oLogout;
		}
		@FindBy(xpath="//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[1]")
		private WebElement createUser;
		public WebElement getcreateUser()
		{
			return createUser;
		}
		@FindBy(xpath="//*[@id=\'createUserDiv\']/div/div[2]")
		private WebElement addUser;
		public WebElement getaddUser()
		{
			return addUser;
		}
		private WebElement firstName;
		public WebElement getFirstName()
		{
			return firstName;
		}
		private WebElement lastName;
		public WebElement getLastname()
		{
			return lastName;
		}
		private WebElement email;
		public WebElement getemail()
		{
			return email;
		}
		private WebElement userDataLightBox_usernameField;
		public WebElement getUsername1()
		{
			return userDataLightBox_usernameField;
		}
		private WebElement password;
		public WebElement getPassword()
		{
			return password;
		}
		private WebElement passwordCopy;
		public WebElement getpasswordCopy()
		{
			return passwordCopy;
		}
		@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
		private WebElement CreateUser;
		public WebElement getsavedUser()
		{
			return CreateUser;
		}
		@FindBy(xpath="//*[@id=\'userListTableContainer\']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
		private WebElement selectUser;
		public WebElement getselectuser()
		{
			return selectUser;
		}
		private WebElement userDataLightBox_deleteBtn;
		public WebElement getDeleteOperation()
		{
			return userDataLightBox_deleteBtn;
			
		}
		private WebElement userDataLightBox_firstNameField;
		public WebElement getModifyDetails()
		{
			return userDataLightBox_firstNameField;
		}
		@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
		private WebElement saveChange;
		public WebElement getsavechanges()
		{
			return saveChange;
		}
		@FindBy(xpath=("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]"))
		private WebElement AddNewUser;
		public WebElement getAddNewUser()
		{
			return AddNewUser;
		}
		@FindBy(xpath=("//*[@id=\'ext-gen172\']/div[14]/div[1]"))
		private WebElement NewCustomer;
		public WebElement getNewCustomer()
		{
			return NewCustomer;
		}
		private WebElement customerLightBox_nameField;
		public WebElement getCustomername()
		{
			return customerLightBox_nameField;
		}
		@FindBy(xpath=("//*[@id=\'customerLightBox_commitBtn\']/div/span"))
		private WebElement createCustomer;
		public WebElement getcreateCustomer()
		{
			return createCustomer;
		}
}

