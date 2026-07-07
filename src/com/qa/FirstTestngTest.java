package com.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTestngTest {
	
	WebDriver driver;
	
	@Test
	public void func1() {
		
		String baseUrl="https://www.toolsqa.com/";
		
		System.out.println("launching Google chrome browser");
		
		driver=new ChromeDriver();
		
		driver.get(baseUrl);
		
		String testTitle="Tools QA";
		String originalTitle=driver.getTitle();
		
		Assert.assertEquals(testTitle, originalTitle);
		
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("starting test on chrome browser");
	}

	@AfterMethod
	public void afterMethod() {
		
		System.out.println("Finished test on chrome browser");
	}
}
