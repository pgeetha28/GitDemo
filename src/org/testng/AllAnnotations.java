package org.testng;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class AllAnnotations {

	@BeforeSuite
	public void LaunchBrowser() {
		System.out.println("Post Git");
		System.out.println("Main Branch");
		System.out.println("BeforeSuite");
	}

	@BeforeTest
	public void BeforeTest() {
		System.out.println("BeforeTest");
	}

	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("BeforeMethod");
	}

	@BeforeClass
	public void BeforeClass() {
		System.out.println("BeforeClass");
	}

	@Test(priority = -1)
	public void Test() {
		System.out.println("Test");
	}

	@Test(priority = 1)
	public void Test1() {
		System.out.println("Test1");
	}

	@Test(priority = 3)
	public void Test3() {
		System.out.println("Test3");
	}

	@Test
	public void Test2() {
		System.out.println("Test2");
	}
	
	@Test
	public void DemoTest() {
		System.out.println("DemoTest");
	}

	@AfterClass
	public void AfterClass() {
		System.out.println("AfterClass");
	}

	@AfterMethod
	public void AfterMethod() {
		System.out.println("AfterMethod");
	}

	@AfterTest
	public void AfterTest() {
		System.out.println("AfterTest");
	}

	@AfterSuite
	public void AfterSuite() {
		System.out.println("AfterSuite");
	}

}
