package packFull;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListersProgram implements ITestListener   {
	
	public void onTestStart(ITestResult result) {
		System.out.println("[Test Case Start]"+result.getName());
	  }

	 public void onTestSuccess(ITestResult result) {
		 System.out.println("[Test Case Finished]"+result.getName());
		  }
	 public void onTestFailure(ITestResult result) {
		 System.out.println("[Test Case Failed]"+result.getName());
		  }
	 public void onTestSkipped(ITestResult result) {
		 System.out.println("[Test Case Skipped]"+result.getName());
		  }
	 public void onStart(ITestContext context) {
		 System.out.println("[Test Execution Started]"+context.getName());
		  }
	 public void onFinish(ITestContext context) {
		    System.out.println("[Test Execution Finished]"+context.getName());
		  }
	
	
}
