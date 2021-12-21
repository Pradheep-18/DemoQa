package org.testng;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Question_10 extends BaseClass{

	@BeforeClass
	private void launchingChrome() {
		launchChrome();
		loadUrl("https://www.toolsqa.com/selenium-training/#enroll-form");
		winMax();
	}
	
	@Test(retryAnalyzer=ReRun_10.class)
	private void tc1() throws IOException {
		
		PojoClass_DemoQa p = new PojoClass_DemoQa();
		fill(p.getFirstName(),getData(1,1));
		System.out.println("Test1");
		Assert.assertTrue(true);
	
	}
	
	@Test(retryAnalyzer=ReRun_10.class)
	private void tc2() throws IOException {
		PojoClass_DemoQa p = new PojoClass_DemoQa();
		fill(p.getLastName(),getData(1, 2));
		System.out.println("Test2");
		Assert.assertTrue(true);
	}
 	
	@Test(retryAnalyzer=ReRun_10.class)
	private void tc3() throws IOException {
		PojoClass_DemoQa p = new PojoClass_DemoQa();
		fill(p.getEmail(),getData(1, 3));
		System.out.println("Test3");
		Assert.assertTrue(true);
		
	}
	
	@Test(retryAnalyzer=ReRun_10.class)
	private void tc4() throws IOException {
		PojoClass_DemoQa p = new PojoClass_DemoQa();
		fill(p.getMobile(),getData(1, 4));
		System.out.println("Test4");
		Assert.assertTrue(false);
		
	}
	
	@Test(retryAnalyzer=ReRun_10.class)
	private void tc5() throws IOException {
		PojoClass_DemoQa p = new PojoClass_DemoQa();
		dropDown(p.getCountry(), "194");
		System.out.println("Test5");
		Assert.assertTrue(true);
	
	}
	
	@Test(retryAnalyzer=ReRun_10.class)
	private void tc6() throws IOException {
		PojoClass_DemoQa p = new PojoClass_DemoQa();
		fill(p.getCity(),getData(1, 5));
		System.out.println("Test6");
		Assert.assertTrue(true);
	
	}
	
	@Test(retryAnalyzer=ReRun_10.class)
	private void tc7() throws IOException, InterruptedException {
		PojoClass_DemoQa p = new PojoClass_DemoQa();
		fill(p.getMessage(), getData(1, 6));
		System.out.println("Test7");
		Assert.assertTrue(true);
	}
	
}
