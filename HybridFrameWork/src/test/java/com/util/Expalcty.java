package com.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Expalcty {
	public static void main(String[] args) {
WebDriver driver;
System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver");
driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
WebDriverWait waiting= new WebDriverWait(driver, 15);
waiting.until(ExpectedConditions.elementToBeClickable(By.xpath("")));

	}

}
