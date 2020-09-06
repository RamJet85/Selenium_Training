package TestNG;

import org.testng.annotations.Test;

public class InvocationCountTestNG {
	// If u want to execute one tc for multiple times then we should use invocationcount method
	
	@Test(invocationCount=10,priority=1,enabled=false)
	public void creteUserTest() {
		System.out.println("User creation");
	}
	
	@Test(priority=2)
	public void loginTest() {
		System.out.println("Login Test");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
