package com.staging.SampleMail;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class FileUtils
{
	public Properties getPropertyFile() throws IOException
	{
		FileInputStream fis=new FileInputStream("D:\\Gopiga\\Gopiga\\Automation file\\SampleMail\\resources\\commandata.properties");
		Properties pobj=new Properties();
		pobj.load(fis);
		return pobj;
	}

	public static void getscreenshot(WebDriver driver) throws IOException
	{

	TakesScreenshot ts = (TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
    Files.copy(source,new File("./screenshot/screen.png"));
    System.out.println("the screenshot is taken");
	
	 }
	
	
}	
