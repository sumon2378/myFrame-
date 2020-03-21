package com.util;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver");
	WebDriver	driver= new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.getTitle();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(33, TimeUnit.SECONDS);
	
	
	Actions ac= new Actions(driver);
	WebElement main=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[2]"));
	WebElement local=driver.findElement(By.xpath("//*[@id=\"nav-al-wishlist\"]/a[2]"));
	ac.moveToElement(main).moveToElement(local).click().build().perform();
	Screenshot.Shot(driver, "Find a gift");
	
	
	
	
	
	
	
}

}
