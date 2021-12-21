package org.testng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass_DemoQa extends BaseClass {

	public PojoClass_DemoQa() {
		
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement txtFirstName;
	
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement txtLastName;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='mobile']")
	private WebElement txtMobile;
	
	@FindBy(xpath="//select[@name='country']")
	private WebElement txtCountry;

	@FindBy(xpath="//input[@id='city']")
	private WebElement txtCity;
	
	@FindBy(xpath="//textarea[@name='message']")
	private WebElement txtMessage;
	
	@FindBy(xpath="//button[@class='btn btn-block btn-primary']")
	private WebElement btnSubmit;
	
	public WebElement getFirstName() {
		return txtFirstName;				
	}
	public WebElement getLastName() {
		return txtLastName;
	}
	public WebElement getEmail() {
		return txtEmail;
	}
	public WebElement  getMobile() {
		return txtMobile;
	}
	public WebElement getCountry() {
		return txtCountry;
	}
	public WebElement getCity() {
		return txtCity;
	}
	public WebElement getMessage() {
		return txtMessage;
	}
	public WebElement getSubmit() {
		return btnSubmit;
	}
	
	
}
