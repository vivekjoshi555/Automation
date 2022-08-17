package prPomPackUsedForPropertyFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage {
	
	//1. Data member should be declared globally with access level private using @find By Annotation
	
	@FindBy (id="pin") private WebElement Pinbutton;
	@FindBy (xpath = "//button[@type='submit']")private WebElement continuebutton;
	
	//2. Initialize within a constructor with access level public using pagefactory
	
	public KitePinPage (WebDriver Driver)
	
	{
		PageFactory.initElements(Driver, this);
	}
	//3. Utilize within a method with access level public
	
	public void sendpin (String PIN)
	{
	    Pinbutton.sendKeys(PIN);
	}
	
	public void clickOncontinuebutton ()
	{
		continuebutton.click();
	}
	
	
	
	
}
