package org.testng;

import org.testng.annotations.Test;

public class Sample extends BaseClass{
	 @Test(groups = "Valid details")
	  private void tc1() {
	    launchChrome();
	    winMax();
	    loadUrl("https://www.facebook.com/");
	    PojoClass_Facebook p = new PojoClass_Facebook();
	    fill(p.getTxtUser(), "Greens");
	    fill(p.getTxtPass(), "Greens@123");
	  }
	  
	  @Test(groups = "Invalid details")
	  private void tc2() {
	    launchChrome();
	    winMax();
	    loadUrl("https://www.facebook.com/");
	    PojoClass_Facebook p = new PojoClass_Facebook();
	    fill(p.getTxtUser(), "Selenium");
	    fill(p.getTxtPass(), "Java@123");
	  }

	  @Test(groups = "Valid details")
	  private void tc3() {
	    launchChrome();
	    winMax();
	    loadUrl("https://www.facebook.com/");
	    PojoClass_Facebook p = new PojoClass_Facebook();
	    fill(p.getTxtUser(), "Java");
	    fill(p.getTxtPass(), "Java@123");

	  }

	  @Test(groups = "Invalid details")
	  private void tc4() {
	    launchChrome();
	    winMax();
	    loadUrl("https://www.facebook.com/");
	    PojoClass_Facebook p = new PojoClass_Facebook();
	    fill(p.getTxtUser(), "Python");
	    fill(p.getTxtPass(), "Java123");
	  }
}
