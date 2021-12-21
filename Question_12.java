package org.testng;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Question_12 extends BaseClass{

	@BeforeClass
	private void launchingChrome() {
		launchChrome();
		loadUrl("https://www.toolsqa.com/selenium-training/#enroll-form");
		winMax();
	}
	
	@Test(groups="Smoke")
	private void tc1() throws IOException {
		
		PojoClass_DemoQa p = new PojoClass_DemoQa();
		fill(p.getFirstName(),getData(1,1));
	
	}
	
	@Test(groups="Sanity")
	private void tc2() throws IOException {
		PojoClass_DemoQa p = new PojoClass_DemoQa();
		fill(p.getLastName(),getData(1, 2));
		
	}
 	
	@Test(groups="Sanity")
	private void tc3() throws IOException {
		PojoClass_DemoQa p = new PojoClass_DemoQa();
		fill(p.getEmail(),getData(1, 3));
		
	}
	
	@Test(groups="Smoke")
	private void tc4() throws IOException {
		PojoClass_DemoQa p = new PojoClass_DemoQa();
		fill(p.getMobile(),getData(1, 4));
		
	}
	
	@Test(groups="Smoke")
	private void tc5() throws IOException {
		PojoClass_DemoQa p = new PojoClass_DemoQa();
		dropDown(p.getCountry(), "194");
	
	}
	
	@Test(groups="Smoke")
	private void tc6() throws IOException {
		PojoClass_DemoQa p = new PojoClass_DemoQa();
		fill(p.getCity(),getData(1, 5));
	
	}
	
	@Test(groups="Sanity")
	private void tc7() throws IOException{
		PojoClass_DemoQa p = new PojoClass_DemoQa();
		fill(p.getMessage(), getData(1, 6));
	}
	
}
