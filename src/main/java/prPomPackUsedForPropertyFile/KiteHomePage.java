package prPomPackUsedForPropertyFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	

	//1. Data member should be declared globally with access level private using @find By Annotation
	
	
	@FindBy (xpath="//span[@class='user-id']") private WebElement UID;
	@FindBy (xpath="//a[@target='_self']")private WebElement Logout;
	
	//2. Initialize within a constructor with access level public using pagefactory
	
	
	public KiteHomePage (WebDriver Driver)
	
	{
		
		PageFactory.initElements(Driver,this);
	}
	
	//3. Utilize within a method with access level public
	
	//public void  validateUserID (String expectedUID)
	
//	{
//		String Actualuid = UID.getText();
//		
//		if(Actualuid.equals(expectedUID))
//		{
//			System.out.println(" If actual used id is equal to Expected user id then test case is Pass");
//		}
//		else
//		{
//			System.out.println(" If actual used id is not equal to Expected user id then test case is fail");
//		}
//	}
	
	public String getactualuserID()
	{
		String actualuserID=UID.getText();
		return actualuserID;// gettext() return type is string so in our matter instead of void given string, beacause void means no return type.
	}
	
	
	
	public void clickonLogOutButton () throws InterruptedException
	{
		UID.click();
		Thread.sleep(2000);
		Logout.click();
	}

}
