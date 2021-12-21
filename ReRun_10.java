package org.testng;

public class ReRun_10 implements IRetryAnalyzer{

	
	int min = 0, max = 3;
	
	public boolean retry(ITestResult result) {
			
		
		if(min<max) {
			min++;
			return true;
		}

		
		
		return false;
	}

}
