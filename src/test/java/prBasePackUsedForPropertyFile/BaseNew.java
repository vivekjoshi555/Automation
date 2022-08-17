package prBasePackUsedForPropertyFile;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.Reporter;

import prUtilityPackUsedForPropertyFile.Utilitynew;

public class BaseNew {
	
protected static WebDriver Driver;//while passing parameter in test class this want to make webdriver protected.//step-2:takes static keyword once try for taking screenshot using listner.
public void openapplication() throws IOException
{
	System.setProperty("webdriver.chrome.driver","D:\\Chromedriver\\chromedriver.exe");
	Driver=new ChromeDriver();//WebDriver Driver makes globally so delete Webdriver from here.
	Driver.manage().window().maximize();
	Driver.get(Utilitynew.readDataFromPropertyFile("URL"));
	Reporter.log("Launching kite app",true);
	Driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
}

public static void captureScreenShot(String TCID) throws IOException//for practice of taking screenshot by using listner screenshot method copy paste here.

{
    File src = ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
    File des =new File("D:\\Velocity\\Automation Testing\\selinium\\23.06.2022\\screenshot\\snapshot"+TCID+".png");
    FileHandler.copy(src, des);
    Reporter.log("Taken Screenshot",true);
}



}
