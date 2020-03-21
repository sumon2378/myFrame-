package com.util;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) throws IOException {
	    WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.getTitle();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);

	
	
	List<WebElement>linklist=driver.findElements(By.tagName("a"));
	for (int i=0;i<linklist.size();i++) {
	 WebElement element= linklist.get(i);
	 String url= element.getAttribute("herf");  
	 verifilink(url);
	 
	}}
	 
	 public static void  verifilink(String urllink)  { try {
		 
		 URL url= new URL(urllink);
		 HttpURLConnection huc= (HttpURLConnection)url.openConnection();
		 huc.setConnectTimeout(2000);
		 
		 huc.connect();
		 
		 
		 if(huc.getResponseCode()==200) {
			 System.out.println(urllink+"_"+huc.getResponseMessage());
		 }
	 if (huc.getResponseCode()==404) {
		 System.out.println(urllink+"-"+huc.getResponseMessage());
	 }
	 
	 }
	 
	 
	catch (Exception e) {
			
		}
}
} 
	 
	

