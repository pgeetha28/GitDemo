package org.Udemy;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CarLoan {

	@Parameters({"URL"})
	@Test(groups= {"smoke"})
	public void CarSmokeLogin(String url) {
		System.out.println("Car Smoke Login");
		System.out.println(url);
	}
	
	@Parameters({"URL","APIKey"})
	@Test
	public void CarLogin(String url, String key) {
		System.out.println("Car Login");
		System.out.println(url);
		System.out.println(key);
	}
		@Test(dependsOnMethods={"HomeLogin","BikeLogin"})
	public void CarModelName() {
		System.out.println("Car Name");
	}
	
	@Test
	public void CarModelYear() {
		System.out.println("Car Year");
	}
}
