package TestNG;

import org.testng.annotations.Test;

public class ExpectedExceptionTestNG {
	// this method will help us do not stop the execution becoz of the exception
	// here we are bypassing the exception
	//In exp handling will trow the exp and catch the exp, But here we are bypassing the exception
	
	@Test(expectedExceptions=Exception.class) // exception is the super class of all the classes
	public void exceptionTest() {
		System.out.println("****Expected exception****");
		int a =1/0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
