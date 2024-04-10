package org.Udemy;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomeLoan {
	
	@Parameters({"URL"})
	@Test(groups= {"smoke"})
	public void CarSmokeLogin(String url) {
		System.out.println("Home Smoke Login");
		System.out.println(url);
	}
		
	@Parameters({"URL","APIKey"})
	@Test()
	public void HomeLogin(String Url,String key) {
		System.out.println("Home Login");
		System.out.println(Url);
		System.out.println(key);
	}
	
	
	@Test(dataProvider="getData")
	public void HomeModelName(String user, String pwd) {
		System.out.println("Home Name");
		System.out.println(user);
		System.out.println(pwd);
	}
	
	@Test(enabled=false)
	public void HomeModelType() {
		System.out.println("Home Type");
	}
	
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data= new Object[3][2];
		
		data[0][0]= "FirstUser"; data[0][1]= "FirstPwd";
		data[1][0]= "SecondUser"; data[1][1]= "SecondPwd";
		data[2][0]= "ThirdUser"; data[2][1]= "ThirdPwd";
		
		return data;
		
	}
}












