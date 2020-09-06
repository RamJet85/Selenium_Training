package TestNG;

import org.testng.annotations.Test;

public class DisabledTestNG {
	
	// We can disabled our tc's by default the tc's are in enabled mode 
	// if u want to execute only few tc's out of 10 simple u can put enabled = false
	// or if u want comment any method just put enabled = false
	
	@Test(enabled = false)
	public void homepageTitle() {
		System.out.println("homepageTitle");
	}

	@Test(enabled=true)
	public void error() {
		System.out.println("error");
	}
	@Test(priority=1, enabled=false)
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
