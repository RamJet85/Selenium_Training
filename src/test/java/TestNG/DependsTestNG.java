package TestNG;

import org.testng.annotations.Test;

public class DependsTestNG {

	//let's take any application in the app we have some login dashboard product pages are there, if u run the tc's it will execute based
	//on alphabetic order, without login method how can u go to home page 
	// In this either u can give the priority or depends method, u can give multiple method coz dependsonmethod return String[] array
	// Suppose if the login method is failed remaining tc's will be skipped
	
	@Test
	public void loginTest() {
		System.out.println("login");
		//int a =1/0;
	}
	@Test
	public void browserTest() {
		System.out.println("Browser Test");
		
	}
	
	@Test(dependsOnMethods= {"loginTest","browserTest"})
	public void Home() {
		System.out.println("Home");
	}
	@Test(dependsOnMethods="loginTest")
	public void Registration() {
		System.out.println("Registration");
	}
	@Test(dependsOnMethods="loginTest")
	public void dashboard() {
		System.out.println("dashboard");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
