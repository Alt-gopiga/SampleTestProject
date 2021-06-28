package com.staging.vmailpage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReferralDashboard {

	@FindBy(xpath="//a[text()='VMAIL']")
	private WebElement vmailBtn;
	
	public void clickonVmailBtn()
	{
		vmailBtn.click();
	}

}
