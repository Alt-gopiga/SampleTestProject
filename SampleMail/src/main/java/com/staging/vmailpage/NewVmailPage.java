package com.staging.vmailpage;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.staging.SampleMail.FileUtils;

public class NewVmailPage {

	FileUtils flib=new FileUtils();
	Properties pobj;
		 
	@FindBy(xpath="//h3[text()='Receiving Team']/following-sibling::div/div/h5")
	private WebElement receiveBtn;
		
	@FindBy(xpath="//div[@class='col-sm-10']/input[@id='subject']")
	private WebElement subjectTextBox;
	
	@FindBy(xpath="//textarea[@id='message']")
	private WebElement gopi1TestTextBox;
	
	@FindBy(xpath="//input[@autocomplete='off']")
	private WebElement tags;
	
	@FindBy(xpath="//button[text()='Add']")
	private WebElement tagaddBtn;
	
	@FindBy(xpath="//h4[text()='Images']/following-sibling::button")
	private WebElement imagesAdd;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-lg']")
	private WebElement createvmailbtn;
	
	@FindBy(xpath="//h4[text()='Files and Medical Records']/following-sibling::button")
	private WebElement filesAndMedicalAddBtn;
	
	@FindBy(xpath="//button[@class='btn btn-primary btn-lg']")
	private WebElement createvmailBtn;
	
	public void clickOnreceivebtn()
	{
		receiveBtn.click();
	}
	
	public void enterDataToSubjectTextBox() throws Throwable
	{
		pobj =flib.getPropertyFile();
		 subjectTextBox.sendKeys(pobj.getProperty("subjecttextdata"));
	}
	public void enterDataTogopi1TextBox() throws IOException
	{
		pobj=flib.getPropertyFile();
		gopi1TestTextBox.sendKeys(pobj.getProperty("gopi1TestTextBox"));
	}
	public void enterDataToTags() throws IOException, InterruptedException
	{
		pobj=flib.getPropertyFile();
		tags.sendKeys(pobj.getProperty("tagdata"));
		Thread.sleep(2000);
		tags.click();
		
	}
	public void clickOnTagAddBtn()
	{
		tagaddBtn.click();
	}
	public void clickOnImgAddBtn()
	{
		imagesAdd.click();
	}
	public void clickOnfilesAddBtn()
	{
		filesAndMedicalAddBtn.click();
	}
	public void clickOnCreateVmailBtn()
	{
		createvmailBtn.click();
	}

}
