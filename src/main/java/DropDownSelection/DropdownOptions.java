package DropDownSelection;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownOptions {
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By Country = By.xpath("//select[@id='Form_submitForm_Country']");
		
		By Industry = By.xpath("//select[@id='Form_submitForm_Industry']");

		
		/*WebElement CountryList = driver.findElement(Country);
		
		Select select = new Select(CountryList);
		
		List<WebElement> optionsList = select.getOptions();
		System.out.println(optionsList.size());
		for (WebElement ele : optionsList) {
			String text = ele.getText();
		      	System.out.println(text);
		}
		*/
		DropdownOptions op = new DropdownOptions();
		System.out.println(op.getDropDownOptionsCount(Country));
		System.out.println(op.getDropDownOptionsCount(Industry));
		List<String> list =op.getDropDownOptionsValues(Industry);
		for (String str : list) {
			System.out.println(str);
			
		}
		
			
	}

	public WebElement getElement(By locator) {
		WebElement element = driver.findElement(locator);
		return element;

	}

	public int getDropDownOptionsCount(By locator) {

		Select select = new Select(getElement(locator));
		List<WebElement> OptionsList = select.getOptions();
		return OptionsList.size();

	}

	public List<String> getDropDownOptionsValues(By locator) {

		List<String> textlist = new ArrayList<String>();

		Select select = new Select(getElement(locator));
		List<WebElement> OptionsList = select.getOptions();
		for (WebElement ele : OptionsList) {
			String text = ele.getText();
			textlist.add(text);
		}
		return textlist;

	}

}
		
		
		
		
		
		
		
		
		
		

