package com.staging.vmailpage;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.staging.SampleMail.FileUtils;

public class LoginPage extends FileUtils
{
	
	@FindBy(id="userName")
	private WebElement usernameBtn;
	@FindBy(id="password")
	private WebElement passwdBtn;
	@FindBy(xpath="//button[contains(text(),'Sign In')]")
	private WebElement siginBtn;
	
	
	public void enterCredencials() throws Throwable 
	{
		 FileUtils flib=new FileUtils();
		 Properties pobj=flib.getPropertyFile();
		 usernameBtn.sendKeys(pobj.getProperty("username"));
		 passwdBtn.sendKeys(pobj.getProperty("password"));
	}
	

		public void clickOnSiginBtn()
		{
		 siginBtn.click();
	     }
	

	

}
