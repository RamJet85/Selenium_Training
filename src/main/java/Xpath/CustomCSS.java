package Xpath;

import org.openqa.selenium.By;

public class CustomCSS {

	public static void main(String[] args) {
		// One of the important differences between XPath and CSS is, with XPath we can
		// search elements backward or forward in the DOM hierarchy while CSS works only
		// in a forward direction. This means that with XPath we can locate a parent element using a child element.
		//Use CSS Selectors for doing simple queries based on the attributes of the element. CSS Selectors tend to perform better, 
		//faster and more reliable than XPath in most browsers
		// the main limitation in CSS is doesn't have contains functions 
		
		//for id use #id(value) like #username or use input#idvalue   input#username
		
		//for class use .class like . .form-control.private-form__control.login-email
		// tagname.class value    input.form-control.private-form__control.login-email
		//  input#username.login-email
		//htmltag[attribute='value']
		// input[id='username']
		
		
		By.cssSelector("input[id='username']");
		// input[id='username'][type='email']
		
		// ul.add-ons-tab li a
		// ul.footer-nav>li>a 
		// ul.footer-nav li a
		// in CSS we have a contains in different form * means contains
		//contains input[id*='username']
		
		//Starts with 
		//input[id^='user']
		// Ends with  input[id$='name']  /  input[type$='ail'] foe email
		//comma in CSS
		//input#username, input#password, button, button#loginBtn  collections driver.finelements
		
		
	//	div.private-form__input-wrapper input[id='username']

	}

}
