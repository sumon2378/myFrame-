package com.other;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ABC {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.jqueryui.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	
	
	
	
	// delele cooke from website,.
	
	driver.manage().deleteAllCookies();
	
	
	
	
	
// all browser
	
	
	
ChromeOptions options = new ChromeOptions(); // crome notificartion 
options.addArguments("disable-infobars");
WebDriver player = new ChromeDriver(options);

//DesiredCapabilities  
DesiredCapabilities desiredCapability = DesiredCapabilities.chrome();
 // swithe frame

driver.switchTo().frame("");
driver.switchTo().window("");




}}