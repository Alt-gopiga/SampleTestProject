package com.staging.SampleMail;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.staging.SampleMail.Autoconstant;
import com.staging.SampleMail.FileUtils;

public class BaseTest implements Autoconstant 
{
	static
	{
		System.setProperty(chrome_key,chrome_value);
	}
	FileUtils flib=new FileUtils();
	Properties pobj;
	public WebDriver driver;
	
	@BeforeClass
	public void setup() throws InterruptedException, IOException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		pobj=flib.getPropertyFile();
		driver.get(pobj.getProperty("url"));
	}
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
}