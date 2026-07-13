package com.qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngGroups {
	
	WebDriver driver;
	
	String title="demosite";
	
	@Test
	public void starting_point() {
		
		System.out.println("This is the starting point of the test");
		
		driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		
		
		
	}
	
	@Test(groups= {"demo"})
	public void checkTitle() {
		
		String TestTitle="demosite";
		
		String originalTitle=driver.getTitle();
		
		System.out.print(originalTitle);
		
		Assert.assertEquals(TestTitle, originalTitle);
		
	}
	
	
	
	

}
