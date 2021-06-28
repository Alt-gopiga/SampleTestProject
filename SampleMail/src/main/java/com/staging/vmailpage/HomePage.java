package com.staging.vmailpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(xpath="//a[@class='btn btn-primary sign-up sign-in']")
	private WebElement LoginBtn ;

	public void getLoginBtn()
	{
		LoginBtn.click();
	}
	

}
