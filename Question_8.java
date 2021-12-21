package org.testng;

import org.testng.annotations.Test;

public class Question_8 extends BaseClass{

	@Test
	private void tc1() {
		
		launchChrome();
		loadUrl("http://www.greenstechnologys.com/");
		winMax();
	}
	
}
