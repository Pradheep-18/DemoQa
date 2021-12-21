package org.testng;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Question_15 extends BaseClass{

	@BeforeClass
	private void launchingChrome() {
		
		launchChrome();
		loadUrl("https://mail.google.com/");
		winMax();
	}
	
	@Test(dataProvider = "gmailLogin", dataProviderClass=DataProviderForLogin.class)
	private void tc1(String s1, String s2) {
		
		fill(driver.findElement(By.xpath("//input[@type='email']")),s1);
		btnClick(driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")));
		fill(driver.findElement(By.xpath("//input[@type='password']")),s2);
		btnClick(driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")));
		
	}
	
}
