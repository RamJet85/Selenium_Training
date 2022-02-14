package Array_List;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextAttribute {
	
	static WebDriver driver;

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		String text = driver.findElement(By.xpath("//input[@id='Form_submitForm_JobTitle']")).getAttribute("placeholder");
		System.out.println(text);
		driver.close();
		
		
		//Get text will give us the text of a particular element
		//Get Attribute will give us attribute value of a particular element, 
		//Get the value of the given attribute of the element
		
		//equals Compares two strings. Returns true if the strings are equal, and false if not
		//Contains Checks whether a string contains a sequence of characters
		//Split Splits a string into an array of substrings boolean
	}
	
	public void selectRadioButtonFromList(By locator, String attribute, String value) {

		List<WebElement> list = getElements(locator);
		System.out.println("Size is: " + list.size());

		for (WebElement ele : list) {
			String Att_Value = ele.getAttribute(attribute);
			//System.out.println(Att_Value);
			if (Att_Value.equalsIgnoreCase(value)) {
				ele.click();
				break;
			}

		}

	}

	private List<WebElement> getElements(By locator) {
		// TODO Auto-generated method stub
		return null;
	}

}
