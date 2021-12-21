package org.testng;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Question_11 extends BaseClass{

	@BeforeClass(alwaysRun = true)
	private void launchingChrome() {
		
	}
	
	@Test(groups="Regression")
	private void tc1() throws IOException {
		launchChrome();
		loadUrl("https://www.facebook.com/");
		winMax();
		PojoClass_Facebook p = new PojoClass_Facebook();
		fill(p.getTxtUser(),getData(1, 1));
		fill(p.getTxtPass(),getData(1, 2));
		System.out.println("Test1");
		btnClick(p.getBtnLogin());
		
	}
	
	@Test(groups="Regression")
	private void tc2() throws IOException {
		launchChrome();
		loadUrl("https://www.facebook.com/");
		winMax();
		PojoClass_Facebook p = new PojoClass_Facebook();
		fill(p.getTxtUser(),getData(2, 1));
		fill(p.getTxtPass(),getData(2, 2));
		System.out.println("Test2");
		btnClick(p.getBtnLogin());
		
	}
	
	@Test(groups="Sanity")
	private void tc3() throws IOException {
		launchChrome();
		loadUrl("https://www.facebook.com/");
		winMax();
		PojoClass_Facebook p = new PojoClass_Facebook();
		fill(p.getTxtUser(),getData(3, 1));
		fill(p.getTxtPass(),getData(3, 2));
		System.out.println("Test3");
		btnClick(p.getBtnLogin());
	}
	
}
