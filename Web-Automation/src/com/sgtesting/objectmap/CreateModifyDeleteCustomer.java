package com.sgtesting.objectmap;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateModifyDeleteCustomer {
	public static ChromeDriver oBrowser=null;
	public static Objectmapactitimepage oPage=null;
	public static void main(String[] args) {
		
		launchBrowser();
		navigate();
		Login();
		minimiseFlyWindow();
		createCustomer();
		modifyCustomer();
		deleteCustomer();
		Logout();
		closeApplication();
	}
	private static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",path+"\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new Objectmapactitimepage("objectmap.properties");
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
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Login()
	{
		try
		{
			oBrowser.findElement(oPage.getLocators("Username")).sendKeys("admin");
			Thread.sleep(1000);
			oBrowser.findElement(oPage.getLocators("Password")).sendKeys("manager");
			Thread.sleep(1000);
			oBrowser.findElement(oPage.getLocators("Login")).click();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimiseFlyWindow()
	{
		try
		{
		oBrowser.findElement(oPage.getLocators("minFlywindow")).click();
		Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createCustomer()
	{
		try
		{
			oBrowser.findElement(oPage.getLocators("clicktask")).click();
			Thread.sleep(1000);
			oBrowser.findElement(oPage.getLocators("addNew")).click();
			Thread.sleep(1000);
			oBrowser.findElement(oPage.getLocators("addCust")).click();
			Thread.sleep(1000);
			oBrowser.findElement(oPage.getLocators("custname")).sendKeys("Pradeep");
			Thread.sleep(1000);
			oBrowser.findElement(oPage.getLocators("createcus")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyCustomer()
	{
		try
		{
			oBrowser.findElement(oPage.getLocators("options")).click();
			Thread.sleep(1000);
			oBrowser.findElement(oPage.getLocators("editcus")).click();
			Thread.sleep(1000);
			oBrowser.findElement(oPage.getLocators("editcus")).sendKeys("ABC");
			oBrowser.findElement(oPage.getLocators("options")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteCustomer()
	{
		try
		{
			oBrowser.findElement(oPage.getLocators("options")).click();
			Thread.sleep(1000);
			oBrowser.findElement(oPage.getLocators("action")).click();
			Thread.sleep(1000);
			oBrowser.findElement(oPage.getLocators("delete")).click();;
			Thread.sleep(3000);
			oBrowser.findElement(oPage.getLocators("actiondelete")).click();;
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Logout()
	{
		try
		{
			oBrowser.findElement(oPage.getLocators("logout")).click();
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
			oBrowser.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
