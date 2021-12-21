package org.testng;

import java.io.IOException;
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Question_3 extends BaseClass {

	@BeforeClass
	private void launchinChrome() {
		launchChrome();
		loadUrl("https://www.toolsqa.com/selenium-training/#enroll-form");
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
	private void tc1() throws IOException {
		
		PojoClass_DemoQa p = new PojoClass_DemoQa();
		fill(p.getFirstName(),getData(1,1));
		String str = printAttribute(p.getEmail());
		SoftAssert s = new SoftAssert();
		s.assertTrue(str.equals(getData(1, 1)), "Check the First Name");
	
	}
	
	@Test
	private void tc2() throws IOException {
		PojoClass_DemoQa p = new PojoClass_DemoQa();
		fill(p.getLastName(),getData(1, 2));
		String str = printAttribute(p.getEmail());
		SoftAssert s = new SoftAssert();
		s.assertTrue(str.equals(getData(1, 2)), "Check the Last Name");
	}
 	
	@Test
	private void tc3() throws IOException {
		PojoClass_DemoQa p = new PojoClass_DemoQa();
		fill(p.getEmail(),getData(1, 3));
		String str = printAttribute(p.getEmail());
		SoftAssert s = new SoftAssert();
		s.assertTrue(str.equals(getData(1, 3)), "Invalid Email ID");
		
	}
	
	@Test
	private void tc4() throws IOException {
		PojoClass_DemoQa p = new PojoClass_DemoQa();
		fill(p.getMobile(),getData(1, 4));
		String str = printAttribute(p.getEmail());
		SoftAssert s = new SoftAssert();
		s.assertTrue(str.equals(getData(1, 4)), "Invalid Mobile Number");
		
	}
	
	@Test
	private void tc5() throws IOException {
		PojoClass_DemoQa p = new PojoClass_DemoQa();
		dropDown(p.getCountry(), "194");
		fill(p.getCity(),getData(1, 5));
		String str = printAttribute(p.getCity());
		SoftAssert s = new SoftAssert();
		s.assertTrue(str.equals(getData(1, 5)), "Check the City");
	}
	
	@Test 
	private void tc6() throws IOException, InterruptedException {
		PojoClass_DemoQa p = new PojoClass_DemoQa();
		fill(p.getMessage(), getData(1, 6));
		Thread.sleep(10000);
		btnClick(p.getSubmit());
	}
		
	
}
