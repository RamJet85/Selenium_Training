package TestNG;

     //WhatisTestNG 
	//TestNG is unit testing framework, u should add TestNG plugin to maven 
	//https://dl.bintray.com/testng-team/testng-eclipse-release/6.14.3/ https://github.com/cbeust/testng-eclipse
   //to install test ng in our machine
	//Junit and TestNG both are exactly same
	//used for writing the tc's
	//we can execute the tc's based on priority
	//Sequential order
	//execute group of tc's
	//We can do data driven testing with help of TestNG with (@DataProvider annotation)
	//By using this we can generate html reports and 3rd party reports like extent reports and PDF reports and TEsults(web reports)
	//we can disabled the test cases 
   //Test cases should design under the src test
   //Using TestNg we can maintain suites like regression suite and smoke suits 
//In TestNG, @Test(enabled=false) annotation is used to skip a test case if it is not ready to test.

//Test NG allows us perform to execute different test methods of different classes as a group at a time
//@Test(groups = {"Smoke TEst"}) and after that we have to add <groups> tag into testng.xml file 


//Parallel Testing--> Executing tc's in a multiple windows at a time 
// thread-count ="2" parallel = "tests" we have thread count concept it used to execute test blocks in multiple 
//windows at a time
	