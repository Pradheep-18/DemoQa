package org.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question_6 {

	public WebDriver driver;
	
	@Parameters({"browser"})
	@Test
	private void tc1(String name) {
		if(name.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(name.equals("ff")) {
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		
		driver.get("http://www.greenstechnologys.com/");
		
	}
	
}
