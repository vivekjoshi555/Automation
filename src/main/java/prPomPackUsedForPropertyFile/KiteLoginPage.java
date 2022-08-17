package prPomPackUsedForPropertyFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {
	 
	//1. Data member should be declared globally with access level private using @find By Annotation
	
	@FindBy (id="userid") private WebElement userID;
	@FindBy (id="password") private WebElement Password;
	@FindBy (xpath = "//button[@type='submit']") private WebElement loginbutton;
	
	
	
	//2. Initialize within a constructor with access level public using pagefactory
	
	public KiteLoginPage (WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	
	//3. Utilize within a method with access level public
	
	public void senduserID (String UN)
	
	{
		userID.sendKeys(UN);
	}
	
	public void sendpassword(String pass)
	
	{
		Password.sendKeys(pass);
	}
	public void clickOnLoginButton()
	
	{
		loginbutton.click();
	}


		
	}
	
	
	
	
	


