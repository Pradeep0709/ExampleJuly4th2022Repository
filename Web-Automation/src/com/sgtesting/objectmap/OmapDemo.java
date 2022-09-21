package com.sgtesting.objectmap;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;

public class OmapDemo {
	public Properties prop=null;
	OmapDemo(String Filename)
	{
		FileInputStream fin=null;
		try
		{
			String path=System.getProperty("user.dir");
			fin=new FileInputStream(path+"\\Properties\\"+Filename);
			prop=new Properties();
			prop.load(fin);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	public By getLocators(String Logicalname)
	{
		By by=null;
		try
		{
			String x=System.getProperty(Logicalname);
			String[] a=x.split(";");
			switch(a[0].toLowerCase())
			{
			case"id":
				by=By.id(a[1]);
				break;
			case"name":
				by=By.name(a[1]);
				break;
			case"xpath":
				by=By.xpath(a[1]);
				break;
			case"cssSelector":
				by=By.cssSelector(a[1]);
			case"linktext":
				by=By.linkText(a[1]);
				break;
			case"partiallinktext":
				by=By.partialLinkText(a[1]);
				break;
			case"tagname":
				by=By.tagName(a[1]);
				break;
			case"classname":
				by=By.className(a[1]);
				break;
			default:
				break;
				
				
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return by;
	}
}
	