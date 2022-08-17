package kitetest;

import java.io.IOException;

import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import prBasePackUsedForPropertyFile.BaseNew;
import prPomPackUsedForPropertyFile.KiteHomePage;
import prPomPackUsedForPropertyFile.KiteLoginPage;
import prPomPackUsedForPropertyFile.KitePinPage;
import prUtilityPackUsedForPropertyFile.Utilitynew;

@Listeners(kitetest.Listner.class)
public class ValidateKiteUserID extends BaseNew{
	
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	
    @BeforeClass
    public void launchBrowser() throws IOException
    {
    	openapplication();
    	login=new KiteLoginPage(Driver);
    	pin=new KitePinPage(Driver);
    	home=new KiteHomePage(Driver);
    	
    }
    
    @BeforeMethod
    public void loginToKiteApp() throws EncryptedDocumentException, IOException
    {
    	login.senduserID(Utilitynew.readDataFromPropertyFile("UN"));// Parameter pass: Classname.Methodname()
    	login.sendpassword(Utilitynew.readDataFromPropertyFile("PWD"));
    	login.clickOnLoginButton();
    
    	
    	pin.sendpin(Utilitynew.readDataFromPropertyFile("PIN"));
    	pin.clickOncontinuebutton();
    	Driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
    }
		
	@Test
    public void kiteuserValidation() throws EncryptedDocumentException, IOException
  
    {
	    String TCID="7387";
	    Assert.assertEquals(home.getactualuserID(), Utilitynew.readDataFromPropertyFile("UN"),"Test case failed actual and expected userId Not matching");
	    Utilitynew.captureScreenShot(Driver, TCID);
    }
	
	@AfterMethod
	public void logoutfromkiteapp() throws InterruptedException
	
	{
		 home.clickonLogOutButton();
	}
	
	
	@AfterClass
	public void closeBrower()
	{
		Driver.close();
    }
}
