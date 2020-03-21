package com.util;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./Browser/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		
		WebElement custom=driver.findElement(By.xpath("//*[@id=\"u_0_z\"]/span[1]/label"));


		custom.click();


		boolean a =custom.isSelected();
		System.out.println(a);


		boolean b =custom.isEnabled();
		System.out.println(b);

		boolean c= custom.isDisplayed();
		System.out.println(c);



		Screenshot.Shot(driver, "Radio Button");
		
	}

}
