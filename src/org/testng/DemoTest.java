package org.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Parameters({"URL"})
	@Test(priority = 1)
	public void DemoTest(String url) {
		System.out.println(" Welcome to TestNG Demo");
		System.out.println(url);
		Assert.assertTrue(false);
	}
	
	@Test
	public void DemoTes() {
		System.out.println(" Welcome to TestNG_A Demo");
	}
}
