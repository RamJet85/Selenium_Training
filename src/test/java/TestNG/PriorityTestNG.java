package TestNG;

import org.testng.annotations.Test;

public class PriorityTestNG {
	
	// Suppose if u give few are priority and few are non priority, It will execute first non priority based on alphabetic order
	// then next priority based
	
	
	@Test
	public void homepageTitle() {
		System.out.println("homepageTitle");
	}

	@Test(priority=0)
	public void error() {
		System.out.println("error");
	}
	@Test
	public void login() {
		System.out.println("login");
	}

	@Test(priority=1)
	public void page() {
		System.out.println("page");
	}
	@Test(priority=2)
	public void test() {
		System.out.println("test");
	}

	@Test(priority=3)
	public void homepageSearch() {
		System.out.println("homepageSearch");
	}
	
	
	
	
	
	
	
	
	

}
