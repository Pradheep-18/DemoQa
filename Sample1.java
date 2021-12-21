package org.testng;

import java.util.Date;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample1 extends BaseClass{

	@BeforeClass
	  private void launchbrowser() {
	    launchChrome();
	    winMax();
	      }

	  @AfterClass
	  private void closebrowser() {
	    System.out.println("success");
	  }

	  @BeforeMethod
	  private void url() {
	    loadUrl("https://mail.google.com/");
	  }

	  @AfterMethod
	  private void date() {
	    System.out.println(new Date());

	  }

	  @Parameters({ "email", "password" })
	  @Test
	  private void tc(String s1, String s2) throws InterruptedException {
	   	    fill(driver.findElement(By.xpath("//input[@type='email']")), s1);
	    Thread.sleep(3000);
	    btnClick(driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d']")));
	    Thread.sleep(2000);
	    fill(driver.findElement(By.xpath("//input[@type='password']")), s2);
	  }
	
}
