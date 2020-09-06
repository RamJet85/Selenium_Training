package DropDownSelection;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class returnList {

	static WebDriver driver;

	public static void main(String[] args)  {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By data = By.xpath("//select[@id='Form_submitForm_Country']/option");
		
		returnList rs = new returnList();
		List<String> str =rs.getList(driver.findElements(data));
		for (String string : str) {
			System.out.println(string);
			
		}
		
		
	}
	public List<WebElement> getElements(By locator) {
		List<WebElement> elements = driver.findElements(locator);
		return elements;

	}
	public WebElement getElement(By locator) {
		WebElement element = driver.findElement(locator);
		return element;

	}
	public List<String> getList(List<WebElement> list) {
		
		List<String> textList = new ArrayList<String>();
		System.out.println(list.size());
		for (WebElement ele : list) {
			String text = ele.getText();
			textList.add(text);
		}
		return textList;
		
		}
}

