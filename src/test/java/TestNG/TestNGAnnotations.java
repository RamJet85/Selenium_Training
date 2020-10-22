package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	//test cases = preconditions + steps + validations (actual vs expected) + post steps
	//Before annotations (setup) + test steps/cases (method calling) + Assertions + close (tear down)
//	@BeforeSuite	The @BeforeSuite annotated method will run before the execution of all the test methods in the suite.
//	@AfterSuite	The @AfterSuite annotated method will run after the execution of all the test methods in the suite.
//	@BeforeTest	The @BeforeTest annotated method will be executed before the execution of all the test methods of 
	//available classes belonging to that folder. it will launch browser only once
//	@AfterTest	The @AfterTest annotated method will be executed after the execution of all the test methods of 
	//available classes belonging to that folder.
//	@BeforeClass	The @BeforeClass annotated method will be executed before the first method of the current class is invoked.
//	@AfterClass	The @AfterClass annotated method will be invoked after the execution of all the test methods of the current class.
//	@BeforeMethod	The @BeforeMethod annotated method will be executed before each test method.
//	@AfterMethod	The @AfterMethod annotated method will run after the execution of each test method.
//	@BeforeGroups	The @BeforeGroups annotated method run only once for a group before the execution of all test cases 
	//belonging to that group.
//	@AfterGroups	The @AfterGroups annotated method run only once for a group after the execution of all test cases 
	//belonging to that group.

	//BeforeTest will be executed before ex of all the test methods of available classes belonging to that folder
	// Before method and after method will execute no of times (pairs) will be executed like 100 
	// Without we mention any priority in tc's it will execute based on alphabetic order
	// all the methods should be in page class in test class only we have tc's
	
	//In BT and AT once u launch the browser and execute all the tc's in same browser and finally close the browser and if u have less no tc's
	// better to go with this approach
	// in BT and AT if any weird thing happen like browser crashed or application crashed at tc no 20 
	//then remaining 80 tc's it will stop the execution automatically 
    // IN BM and AM it will create the pairs of each test case if have 100's of tc's BM and AM, here we are giving imp to each & every method
	//in BM and AM if any weird thing happen like browser crashed or application crashed at tc no 20
	// it will again invoked the browser it will start execution from remaining tc 
	
	// If u want to run all the classes at time use xml file
	// we can run all the test classes at a time using testng.xml file executing the group of tc's
	// if u are using BT & At in base class when u want to execute group tc better split each class as test blocks in xml file
	// Because BT & AT will execute before execution of all tests & for every test we should have different names
	// if u are using BM & AM in the base class u want to execute u can execute all in a group or u can split
	// Verbose is used to based on the verbose count u given it will show the information in the console
	// If u want to see the more info of the execution report max value is 10
	//Suppose if u combine all tc's without test blocks, in BT & AT execution only done in once, so u can't execute combine
	// so can divide into blocks
	// If suppose u have 2 test blocks it will execute in 2 chrome browsers at a time
    // verbose used to if u want to see the more info of the console report on the console verbose range is 1 to 10-->
	
	// in a test block if u have no of classes u should give parallel as classes eg :thread-count ="2" parallel = "classes"
	
	// Parallel Testing--> Executing tc's in a multiple windows at a time 
	// thread-count ="2" parallel = "tests" we have thread count concept it used to execute test blocks in multiple windows at a time
	
	// CrossBrowser Testing--> Executing tc's in multiple browsers at a time
	// To do CBT we should give parameter in xml file like <parameter name = "browser" value ="chrome"
	//plz pick the browser from xml file and give it to setup method
	
	

@BeforeSuite
public void connectDB() {
	System.out.println("BS--connect to DB");
}

@BeforeTest
public void createUser() {
	System.out.println("BT..createUser");
}

@BeforeClass
public void launchBrowser() {
	System.out.println("BC..launchBrowser");
}

@BeforeMethod
public void loginToApp() {
	System.out.println("BM..loginToApp");
}

@Test
public void homepageTitle() {
	System.out.println("homepageTitle");
}

@Test
public void homepageSearch() {
	System.out.println("homepageSearch");
}

@AfterMethod
public void logout() {
	System.out.println("AM..Logout");
}

@AfterClass
public void close() {
	System.out.println("AC..closeBrowser");
}
@AfterTest
public void deleteUser() {
	System.out.println("AT..deleteUser");
}
@AfterSuite
public void didconnectDB() {
	System.out.println("AS--disconnect to DB");
}

}


