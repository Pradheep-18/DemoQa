package org.testng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass_Flipkart extends BaseClass{
	
	public PojoClass_Flipkart() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
	private WebElement txtuser;
	
	@FindBy(xpath="//input[@class='_2IX_2- _3mctLh VJZDxU']")
	private WebElement txtPass;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement btnLogin;
	
	public WebElement getUser() {
		return txtuser;
	}
	
	public WebElement getPass() {
		return txtPass;
	}
	
	public WebElement getLogin() {
		return btnLogin;
	}
}
