package com.test.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	WebDriver driver;
	@BeforeSuite
	public void launchBrowser() {
//		System.setProperty("webdriver.chrome.driver", value);
	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Browser launched successfully....");
		driver.manage().window().maximize();
		System.out.println("Browser maximized successfully....");
	
	}
	
	@Test
	public void navigateToflipkart() {
		driver.get("https://www.flipkart.com");
		System.out.println("Navigated to "+driver.getCurrentUrl());
	}
	
	@AfterSuite
	public void closeTheBrowser() throws InterruptedException {
		Thread.sleep(3000);;
		driver.close();
		System.out.println("Browser closed successfully.....");
	}
	

}
