package prUtilityPackUsedForPropertyFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utilitynew 
{
public static String readDataFromPropertyFile(String key) throws IOException
    {
	Properties prop=new Properties();//Created object of properties class.
	FileInputStream myfile=new FileInputStream("C:\\Users\\malok\\eclipse-workspace\\9thAprilEvening\\myproperty.properties");
	prop.load(myfile);//loaded the file
	String value = prop.getProperty(key);
	return value;
	}
public static void captureScreenShot(WebDriver Driver,String TCID) throws IOException

    {
	File src = ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
    File des =new File("D:\\Velocity\\Automation Testing\\selinium\\23.06.2022\\screenshot\\snapshot"+TCID+".png");
    FileHandler.copy(src, des);
    Reporter.log("Taken Screenshot",true);
    }
}
