package org.testng;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Question_14 extends BaseClass{

	@BeforeClass
	private void launchingChrome() {
		launchChrome();
		loadUrl("https://mail.google.com/");
		winMax();
	}
	
	@Parameters({"dhoni", "vira"})
	@Test
	private void tc1(@Optional("Java")String s1, @Optional("java@123")String s2) {
		
		fill(driver.findElement(By.xpath("//input[@type='email']")),s1);
		btnClick(driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")));
		fill(driver.findElement(By.xpath("//input[@type='password']")),s2);
		btnClick(driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")));
	}
	
}
