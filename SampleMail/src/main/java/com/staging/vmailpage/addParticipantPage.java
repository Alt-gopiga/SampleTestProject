package com.staging.vmailpage;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.staging.SampleMail.FileUtils;

public class addParticipantPage {
	@FindBy(id="addPartSearchTxt")
	private WebElement participantTextBox;

	
	@FindBy(xpath="//label[text()='Participant']/following-sibling::div[@class='row']/div[2]/input")
	private WebElement participantSearchBtn;
	
	@FindBy(xpath="//table[@class='table table-striped']/tbody//td/input")
	private WebElement participantRadioBtn; 
	
	@FindBy(xpath="//input[@ng-disabled='isSavingConcersationParticipant']")
	private WebElement participantAddBtn;
	
	
	@FindBy(xpath="//*[@id=\"addParticipantModal\"]/div/div/div[1]/button/span")
	private WebElement closeParticipant;
	
	@FindBy(xpath="/html/body/div[4]/div[1]/div/div[1]/div/div[2]/div[2]/div/div/div[2]/h5")
	private WebElement receivingAddBtn;
	
	public void participantTextBox() throws IOException
	{
	 FileUtils flib=new FileUtils();
	 Properties pobj=flib.getPropertyFile();
	 participantTextBox.sendKeys(pobj.getProperty("participantboxdata"));
	}
	
	public void clickOnCloseTeam()
	{
		closeParticipant.click();
		
	}
	
	public void clickOnSearch()
	{
		participantSearchBtn.click();
	}
//	public void clickOnParticipantRadioBtn()
//	{
//		participantRadioBtn.click();
//	}
	public void clickOnparticipantAddBtn()
	{
		participantAddBtn.click();
	}
	
	

}
