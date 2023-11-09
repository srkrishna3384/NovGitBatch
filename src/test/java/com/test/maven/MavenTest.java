package com.test.maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MavenTest {

	@Test
		public void testOne() {
			System.out.println("Test one output");
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			
			
		}
		
	}

