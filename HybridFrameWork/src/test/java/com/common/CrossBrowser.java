package com.common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	public WebDriver driver;
	@Test
	@Parameters("browser")
	public void getBrowser(String BrowserName) {
		
		if (BrowserName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver");
		driver = new ChromeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Browser/geckodriver");
			driver= new FirefoxDriver();	
		}
		
		else if (BrowserName.equalsIgnoreCase("opera")) {
			System.setProperty("webdriver.opera.driver", "./Browser/operadriver");
			driver= new OperaDriver();
		}
		
		driver.get("https://www.facebook.com/");
		driver.getTitle();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	

}
