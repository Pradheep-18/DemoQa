package org.testng;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question_7 extends BaseClass{
	
	public WebDriver driver;
	
	@Parameters({"browser"})
	@Test
	private void tc1(String name) throws IOException, InterruptedException {
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
		
		driver.get("https://www.flipkart.com/account/login");
		Thread.sleep(4000);

		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("Greens");
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("greens@123");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
	}

}
