package com.qa;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngAnnotations {
	
	@Test
	public void testCase1() {
		
		System.out.println("This is a normal test case");
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This will execute before method");
	}

	@AfterMethod
	public void afterMethod() {
		
		System.out.println("This will execute after method");
	}
	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("This will execute before class");
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("This will execute After class");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("This will execute before test");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("This will execute after test");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		
		System.out.println("This will execute before suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		
		System.out.println("This will execute after Suite");
	}
	
	
}
