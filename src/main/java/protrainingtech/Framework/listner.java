package protrainingtech.Framework;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listner extends Utilities implements ITestListener{
	public void onTestStart(ITestResult resut) {
		
	}
	
	public void onTestSuccess(ITestResult result) {
		try {
			screenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void onTestFailure(ITestResult result) {
		try {
			screenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void onTestSkipped(ITestResult result) {
		
	}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}
}

	


