package com.sgtesting.objectmap;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;

public class Objectmapactitimepage {
	public Properties prop=null;
	Objectmapactitimepage(String filename)
	{
		FileInputStream fin=null;
		try
		{
			String path=System.getProperty("user.dir");
			fin=new FileInputStream(path+"\\properties\\"+filename);
			prop=new Properties();
			prop.load(fin);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public By getLocators(String Logicalname)
	{
		By by=null;
		try
		{
			String x=prop.getProperty(Logicalname);
			String []m=x.split(";");
			switch(m[0].toLowerCase())
			{
			case"id":
				by=By.id(m[1]);
				break;
			case"classname":
				by=By.className(m[1]);
				break;
			case"xpath":
				by=By.xpath(m[1]);
				break;
			case"cssSelector":
				by=By.cssSelector(m[1]);
			case"linktext":
				by=By.linkText(m[1]);
				break;
			case"partiallinktext":
				by=By.partialLinkText(m[1]);
				break;
			case"tagname":
				by=By.tagName(m[1]);
				break;
			case"name":
				by=By.name(m[1]);
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

	
	



