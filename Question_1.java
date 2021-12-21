package org.testng;

import java.awt.image.DataBufferByte;
import java.io.IOException;
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Question_1 extends BaseClass{

	@BeforeClass
	private void launchingChrome() {
		launchChrome();
		loadUrl("https://www.facebook.com/");
		winMax();
		printTitle();
		printCurrentUrl();
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
	private void tc1() throws IOException {
		PojoClass_Facebook p = new PojoClass_Facebook();
		fill(p.getTxtUser(),getData(3, 1));
		String str = printAttribute(p.getTxtUser());
		SoftAssert s = new SoftAssert();
		s.assertTrue(str.equals(getData(3, 1)), "Invalid Username");
		s.assertAll();
	}
	
	@Test
	private void tc2() throws IOException {
		PojoClass_Facebook p = new PojoClass_Facebook();
		fill(p.getTxtPass(),getData(3, 2));
		String str = printAttribute(p.getTxtUser());
		SoftAssert s = new SoftAssert();
		s.assertTrue(str.equals("sele@123"), "Invalid Password");
		s.assertAll();
	}
	
	@Test
	private void tc3() {
		PojoClass_Facebook p = new PojoClass_Facebook();
		btnClick(p.getBtnLogin());
	}
	
}
