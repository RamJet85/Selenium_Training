package DropDownSelection;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListofDD {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By Country = By.xpath("//select[@id='Form_submitForm_Country']");
		
		ListofDD li = new ListofDD();
		List<String> list = li.getDropDownOptionsValues(Country);
		for (String str : list) {
			System.out.println(str);
			
		}
	}

	public WebElement getElement(By locator) {
		WebElement element = driver.findElement(locator);
		return element;

	}

	//To verify the dropdown values
	public List<String> getDropDownOptionsValues(By locator) {

		List<String> textList = new ArrayList<String>();

		WebElement DropdownList = getElement(locator);
		Select select = new Select(DropdownList);
		List<WebElement> OptionsList = select.getOptions();

		for (WebElement ele : OptionsList) {
			String text = ele.getText();
			textList.add(text);
		}
		return textList;

	}
}
