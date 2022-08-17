package kitetest;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import prBasePackUsedForPropertyFile.BaseNew;

public class Listner extends BaseNew  implements ITestListener//for taking screenshot of fail method we extend base class.
{
	BaseNew b=new BaseNew();
	public void onTestStart(ITestResult result) 
	{
		Reporter.log("TC Execution is Started "+result.getName(), true);
	}
	
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log("TC Execution is Skipped "+result.getName(), true);
	}
	
	public void onTestFailure(ITestResult result)
	{
		//String fail = result.getName();//by using create Reference variable 
	     Reporter.log("TC Execution is failed "+result.getName(), true);
		//Reporter.log("TC Execution is failed"+fail, true);
	     
	     try 
	     {
			b.captureScreenShot(result.getName());
		 } 
	     catch (Exception e) 
	     {
			e.printStackTrace();
		}
	}

	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("TC Execution is Successful ", true);
	}
}
