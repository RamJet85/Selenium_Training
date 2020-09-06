package Xpath;

public class Xpath_Advanced {

	public static void main(String[] args) {
		
		// / slash will give only direct child elements single slash is always used for to capture the direct child elements associated with parent
		// // it will both direct & indirect child elements which are associated with parents
		
		// backward travering //div//a[text()='Scorecard']/../.. cricbuzz
		//input[@id='continue']//parent::span
		// to do the backward simple use /.. it is not available in CSS
		//input[@id='username']/../../.. backward traversing immediately it will go to it's parent 
		//Child to parent
		//input[@id='username']//parent::div
		//label[text()='Populate the dummy data for this instance.']//parent::div//input[@id='Form_submitForm_SetDummyData']
		
		
		//parent to child
		//div[@class='a-section']//input[@id='continue']
		//div[@class='a-section']//child::input[@id='continue']
		//child keyword is only used for direct child 

	}
	
	//input[@id='continue']//ancestor::div acestor will give us all the grand parents and parents
	
	//span[text()='Ram']//ancestor::td//preceding-sibling::td//input[@type='checkbox']/..
	
	//span[text()='Ram']//ancestor::td//following-sibling::td//a[text()='rrr@gmail.com']
	
	
	
	// parent means direct parent and ancestor means all the parents 
	
	//a[text()='Build Tools']//ancestor::li//following-sibling::li//a[text()='Mocking']
	
	//td[text()='ravi efefdf']//following-sibling::td
	
	//td[text()='ravi efefdf']//preceding-sibling::td//input
	//div[text()='Vinay']/parent::div//preceding-sibling::div/child::div[text()='vinaysakamuri8@gmail.com']
	//div[text()='Vinay']/parent::div//following-sibling::div//div[text()='Male']
	

}

