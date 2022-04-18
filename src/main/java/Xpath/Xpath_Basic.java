package Xpath;

public class Xpath_Basic {

	public static void main(String[] args) {

		//Xpath is a locator also called the address of the Webelement
		//2 types 1.Absolute xpath 2. Relative xpath
		//1. It is the direct way to find the element.But the disadvantage is 
		//if any changes are made in the path of the element then the xpath gets failed starts with forward slash /
		//which means you can select the element from the root node
	    //relative: it's a custom Xpath, the path starts from the middle of the HTML dom structure, it starts with // 
		//which means you can search the element anywhere at the webpage
		//Htmltag[@attribute1='value1']
		//Htmltag[@attribute1='value1'and @att2='value2']
		
		//text is a function
		//HtmlTag[text()='value']
		//passing the index in xpath
		//Conditions of Use (//input[@id])[position()='1'], In this we stored all the id properties then passed the index
		//(//a[contains(text(),'PHP')])[position()='1']
		//if u want select the last element use //  (//input[@id])[last()]
	    //(//input[@id]) this is called a collection, here Position is a function
		
		//contains(), will check the sequence of characters, It is used for dynamic attributes
		//htmltag[contains(@attr,'value')] u can pass partial part 
		//htmltag[contains(text(),'value')] u can give partial text or full text
		
		//starts-with()
		//htmtltag[starts-with@attr,'value']
		//a[starts-with(text(),'compareTo()')]
		//Ends with most of the browsers doesn't support
		
	
	    //CSS selector, if don't have a //
	    //TagName[attribute ='value']
	    //input[id='username']
	    // css with 2attributes
        //input[id='username'][id='username']
		
		//while creating the css 
		
		//id--> #id or tag id
		//class--> .className  or tag className
		
		//input#username
		//.form-control.private-form__control.login-email
	    //input#username.login-email
	

}
}