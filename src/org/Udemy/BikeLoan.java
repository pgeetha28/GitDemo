package org.Udemy;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BikeLoan {

	@Parameters({"URL"})
	@Test(groups= {"smoke"})
	public void BikeSmokeLogin(String url) {
		System.out.println("Bike Smoke Login");
		System.out.println(url);
	} 
	
	@Parameters({"URL","APIKey"})
	@Test
	public void BikeLogin(String url,String key) {
		System.out.println("Bike Login");
		System.out.println(url);
		System.out.println(key);
	}
	
	@Test(dependsOnMethods={"BikeLogin"})
	public void BikeModelName() {
		System.out.println("Bike Name");
	}
}
