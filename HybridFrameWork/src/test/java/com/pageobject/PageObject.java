package com.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObject extends PageBase {

	public PageObject(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//*[@id=\"email\"]")
	public WebElement email;
	public WebElement getEmail() {
		return email;
	}

	
	
	@FindBy(xpath="//*[@id=\"pass\"]")
	public WebElement password;
	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(xpath="//*[@id=\"loginbutton\"]")
	public WebElement login;
	public WebElement getLogin() {
		return login;
}
}