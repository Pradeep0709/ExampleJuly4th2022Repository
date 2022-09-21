package com.sgtesting.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popupBrowser {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
	launchBrowser();
		navigate();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\ECLIPSETOOL\\eclipse\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
			Thread.sleep(2000);
			String parenthandle=oBrowser.getWindowHandle();
			Object[] allwindowhandle=oBrowser.getWindowHandles().toArray();
			for(int i=1;i<allwindowhandle.length;i++)
			{
				String Childwindow=allwindowhandle[i].toString();
				oBrowser.switchTo().window(Childwindow);
				oBrowser.findElement(By.xpath("//a[text()='Try Free']")).click();
				Thread.sleep(2000);
			}
			oBrowser.switchTo().window(parenthandle);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
