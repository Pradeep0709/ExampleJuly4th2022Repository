package com.sgtesting.Tests;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonloginDemo {
public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		LaunchBrowser();
		navigate();
		SelectVideo();
		//Login();
		//minimizeFlyoutWindow();
		//createUser();
		//deleteUser();
		//Logout();
		//getLinks();
		//closeApplication();
	}
	private static void LaunchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ECLIPSETOOL\\eclipse\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
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
			//oBrowser.get("https://www.youtube.com/watch?v=g6fnFALEseI");
			oBrowser.get("https://en.wikipedia.org/wiki/WorldWideWeb");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void SelectVideo()
	{
		try
		{
			oBrowser.manage().window().maximize();
			Thread.sleep(4000);
			//String Text=oBrowser.findElement(By.xpath("//div[@class='style-scope ytd-watch-flexy'][@id='secondary']")).getText();
			//System.out.println(Text);
			//Thread.sleep(4000);
			List<WebElement> olinks=oBrowser.findElements(By.xpath	("//a[@href]"));
			for(int i=0;i<olinks.size();i++)
			{
				String link=olinks.get(i).getText();
				System.out.println(link);
			}
			int count=olinks.size();
			System.out.println(count);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}