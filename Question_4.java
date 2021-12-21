package org.testng;

import java.io.IOException;
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Question_4 extends BaseClass{

	@BeforeClass
	public static void launchingChrome() {
		launchChrome();
		loadUrl("https://www.flipkart.com/account/login");
		winMax();
	}
	
	@AfterClass
	private void closingChrome() {
		//closeChrome();
	}
	
	@BeforeMethod
	private void startTime() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@AfterMethod
	private void endTime() {
		System.out.println(new Date());
	}
	@Test
	public void tc1() throws IOException {
		PojoClass_Flipkart p = new PojoClass_Flipkart();
		fill(p.getUser(),getData(1,1));
		fill(p.getPass(),getData(1,2));
	}
	@Test
	public void tc2() throws IOException  {
		PojoClass_Flipkart p = new PojoClass_Flipkart();
		btnClick(p.getLogin());
	}
}
