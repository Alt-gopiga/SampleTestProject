package com.staging.vmailpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VmailPage {

	@FindBy(xpath="//a[@class='btn newButtonMsg']")
	private WebElement newBtn;
	
	public void clickonNewBtn()
	{
		newBtn.click();
	}
}
