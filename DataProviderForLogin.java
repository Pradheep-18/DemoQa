package org.testng;

import org.testng.annotations.DataProvider;

public class DataProviderForLogin {

	@DataProvider(name="gmailLogin")
	public Object[][] gettingData(){
		return new Object[][] {
			
			{"sql", "sql@123"},
			{"java", "jav@123"},
			{"python", "python@123"},
			{"selenium", "selenium@123"}
			
			
		};
		
	}
	
}
