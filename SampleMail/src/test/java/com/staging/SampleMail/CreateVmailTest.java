package com.staging.SampleMail;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.staging.vmailpage.*;

import com.staging.SampleMail.BaseTest;

@Listeners
public class CreateVmailTest extends BaseTest {

  FileUtils flib=new FileUtils();
	Properties pobj;		
	@Test
	public void createVmail() throws Throwable
	{
		//click on login button
		HomePage vp = PageFactory.initElements(driver, HomePage.class);
		vp.getLoginBtn();
		Thread.sleep(8000);
		
		// enter username and password
		LoginPage lp=PageFactory.initElements(driver, LoginPage.class);
	    lp.enterCredencials();
	    lp.clickOnSiginBtn();
	    
	    //clickon VmailButton
	    ReferralDashboard rp=PageFactory.initElements(driver, ReferralDashboard.class);
	    rp.clickonVmailBtn();
	    Thread.sleep(5000);
	    //clickon NewButton
	    VmailPage vm=PageFactory.initElements(driver, VmailPage.class);
	    vm.clickonNewBtn();
	    Thread.sleep(5000);
	    //clickOn receiveBtn
	    NewVmailPage np=PageFactory.initElements(driver, NewVmailPage.class);
	    Thread.sleep(7000);
	    np.clickOnreceivebtn();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    //enter participantbox data
	    addParticipantPage ap=PageFactory.initElements(driver, addParticipantPage.class);
	    Thread.sleep(5000);
	    ap.participantTextBox();
	    Thread.sleep(5000);
	    ap.clickOnSearch();
	    Thread.sleep(5000);
	   // ap.clickOnParticipantRadioBtn();
	    ap.clickOnparticipantAddBtn();
	    Thread.sleep(5000);
	    ap.clickOnCloseTeam();
	    Thread.sleep(5000);
	    //enter data to subject textbox and gopi1test
	    np.enterDataToSubjectTextBox();
	    Thread.sleep(2000);
	    np.enterDataTogopi1TextBox();
	    Thread.sleep(2000);
	    	    
	    //enter the data on tag text box
	    np.enterDataToTags();
	    Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		
	   //click on the add button
		np.clickOnTagAddBtn();
		
		//click createvmailbtn
		np.clickOnCreateVmailBtn();
		Thread.sleep(5000);
		
		//verify the vmail creation
		
		String actTitle= driver.getTitle();
		pobj=flib.getPropertyFile();
		String expTitle = pobj.getProperty("expectedtitle");
				
		Assert.assertEquals(actTitle,expTitle );	
		
	    
	    
	}
	

}
