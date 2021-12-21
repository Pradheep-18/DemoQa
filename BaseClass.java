package org.testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void launchChrome() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	
	}

	public static void loadUrl(String url) {
		
		driver.get(url);
		
	}

	public static void winMax() {

		driver.manage().window().maximize();
	}

	public static void printTitle() {

		System.out.println(driver.getTitle());
	}

	public static void printCurrentUrl() {

		System.out.println(driver.getCurrentUrl());
	}

	public static void fill(WebElement ele, String value) {

		ele.sendKeys(value);
	}

	public static void btnClick(WebElement ele) {

		ele.click();
	}

	public static void closeChrome() {

		driver.close();
	}

	public static void quitChrome() {

		driver.quit();
	}

	public static void printText(WebElement ele) {

		System.out.println(ele.getText());
	}

	public static String printAttribute(WebElement ele) {

		String str = ele.getAttribute("value");
		return str;
	}

	public static String getData(int rowNumber, int cellNumber) throws IOException {

		File f = new File("D:\\Software\\Eclipse\\Maven\\TestNG\\TestData\\Details.xlsx");
		FileInputStream fIn = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fIn);
		Sheet s = w.getSheet("DemoQa");
		Row r = s.getRow(rowNumber);
		Cell cell = r.getCell(cellNumber);
		int cellType = cell.getCellType();
		String value = "";
		if (cellType == 1) {
			value = cell.getStringCellValue();
		} else if (cellType == 0) {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date d = cell.getDateCellValue();
				SimpleDateFormat sim = new SimpleDateFormat("dd,MMMM,yyyy");
				value = sim.format(d);
				
			} else {
				double d = cell.getNumericCellValue();
				long l = (long) d;
				value = String.valueOf(l);
				
			}
		}
	//	System.out.println(value);
		return value;
	}

	public static void robotTab() throws AWTException {

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);

	}

	public static void robotEnter() throws AWTException {

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
	
	public static void dropDown(WebElement ele, String value) {
		Select s = new Select(ele);
		s.selectByValue(value);
	}
	
	public static void UpdateSheet(int row, int cell, String value) throws IOException {
		File f = new File("D:\\Software\\Eclipse\\Maven\\POM\\TestData\\Details.xlsx");
		FileInputStream fIn = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fIn);
		Sheet s = w.getSheet("Facebook");
		Row r = s.getRow(row);
		r.createCell(cell).setCellValue(value);
		FileOutputStream fOut = new FileOutputStream(f);
		w.write(fOut);
	}
}
