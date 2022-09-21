package com.sgtesting.objectmap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginLogoutActitime {
	public static ChromeDriver oBrowser=null;
	public static Objectmapactitimepage oPage=null;
	public static void main(String[] args) {
		lauchBrowser();
		launchBrowser();
		Login();
		minimiseFlyWindow();
		createUser();
		modifyUser();
		deleteUser();
		Logout();
		closeApplication();
		
	}
	private static void lauchBrowser()
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
	private static void launchBrowser()
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
	private static void createUser()
	{
		try
		{
			oBrowser.findElement(oPage.getLocators("getUser")).click();
			Thread.sleep(1000);
			oBrowser.findElement(oPage.getLocators("AddUser")).click();
			Thread.sleep(1000);
			oBrowser.findElement(oPage.getLocators("Firstname")).sendKeys("abc");
			Thread.sleep(1000);
			oBrowser.findElement(oPage.getLocators("Lastname")).sendKeys("xyz");
			Thread.sleep(1000);
			oBrowser.findElement(oPage.getLocators("email")).sendKeys("abc@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(oPage.getLocators("Username")).sendKeys("Pradeep");
			Thread.sleep(1000);
			oBrowser.findElement(oPage.getLocators("password")).sendKeys("zxcv");
			Thread.sleep(1000);
			oBrowser.findElement(oPage.getLocators("Repassword")).sendKeys("zxcv");
			Thread.sleep(1000);
			oBrowser.findElement(oPage.getLocators("clickUser")).click();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyUser()
	{
		try
		{
			oBrowser.findElement(oPage.getLocators("clickuser")).click();
			Thread.sleep(1000);
			oBrowser.findElement(oPage.getLocators("editUser")).clear();;
			Thread.sleep(1000);
			oBrowser.findElement(oPage.getLocators("editUser")).sendKeys("abc12");
			Thread.sleep(1000);
			oBrowser.findElement(oPage.getLocators("savechanges")).click();
			Thread.sleep(3000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteUser()
	{
		try
		{
			oBrowser.findElement(oPage.getLocators("clickuser")).click();
			Thread.sleep(1000);
			oBrowser.findElement(oPage.getLocators("saveDelete")).click();
			Alert oalert=oBrowser.switchTo().alert();
			oalert.accept();
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
