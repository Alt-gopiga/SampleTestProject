package com.staging.SampleMail;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.google.common.io.Files;

public abstract class SampleListerner implements ITestListener {

		WebDriver driver;

		public void onTestFailure(ITestResult result) 
		{
			String tName = result.getMethod().getMethodName();
			TakesScreenshot ts=(TakesScreenshot)driver;
			File srcFile = ts.getScreenshotAs(OutputType.FILE);
			File dstFile = new File("./resources/ScreenShot"+tName+".png");
			try
			{
				Files.copy(srcFile, dstFile);
			}
			catch(IOException e)
			{
				
			}
		}
}
