package org.testng;

import java.awt.AWTException;
import java.util.Date;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Question_2 extends BaseClass{

	@BeforeClass
	private void launchingChrome() {
		launchChrome();
		loadUrl("https://www.redbus.in/");
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
	private void tc1() throws InterruptedException {
		btnClick(driver.findElement(By.xpath("//div[@id='signin-block']")));
		btnClick(driver.findElement(By.xpath("//div[@id='hc']")));
		Thread.sleep(1000);
	}
	@Test
	private void tc2() throws InterruptedException {
		driver.switchTo().frame(1);
		fill(driver.findElement(By.xpath("//input[@id='mobileNoInp']")),"9632587410");
		Assert.assertTrue(printAttribute(driver.findElement(By.xpath("//input[@id='mobileNoInp']"))).equals("9632587410"),"Please Enter a valid PhoneNumber");
		Thread.sleep(1000);
	}
	@Test
	private void tc3() throws AWTException, InterruptedException {
		robotTab();
		Thread.sleep(1000);
		robotEnter();
	}
	@Test
	private void tc4() {
		btnClick(driver.findElement(By.xpath("//div[@id='otp-container']")));
	}
	
}
