package Array_List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextAttribute {
	
	static WebDriver driver;

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		String text =driver.findElement(By.xpath("//input[@id='Form_submitForm_JobTitle']")).getAttribute("type");
		System.out.println(text);
		
		
		//Get text will give us the text of a particular element
		//Get Attribute will give us attribute value of a particular element, Get the value of the given attribute of the element
		
		//equals Compares two strings. Returns true if the strings are equal, and false if not
		//Contains Checks whether a string contains a sequence of characters
		//Split Splits a string into an array of substrings boolean
	}

}
