package com.sgtestesting.pageobjectmodel;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateuserDeleteUserDemo1 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		lauchBrowser();
		navigate();
		login();
		minimizeFlyOutWindow();
		createUser();
		deleteuser();
		Logout();
		closeApplication();
	}
	private static void lauchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\ECLIPSETOOL\\eclipse\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.navigate().to("http://localhost:81/login.do");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oPage.getUsername().sendKeys("admin");
			Thread.sleep(3000);
			oPage.getpassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void minimizeFlyOutWindow()
	{
		try
		{
			oPage.getMinimiseFlyWindow().click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createUser()
	{
		try
		{
			oPage.getcreateUser().click();
			oPage.getaddUser().click();
			Thread.sleep(2000);
			oPage.getFirstName().sendKeys("abc");
			oPage.getLastname().sendKeys("xyz");
			oPage.getemail().sendKeys("demo1@gmail.com");
			oPage.getUsername1().sendKeys("demo1");
			oPage.getPassword().sendKeys("zxcv");
			oPage.getpasswordCopy().sendKeys("zxcv");
			oPage.getsavedUser().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteuser()
	{
		try
		{
			oPage.getselectuser().click();
			Thread.sleep(2000);
			oPage.getDeleteOperation().click();
			Thread.sleep(3000);
			Alert oalert=oBrowser.switchTo().alert();
			oalert.accept();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Logout()
	{
		try
		{
			oPage.getLogoutLink().click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
