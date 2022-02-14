package DropDownSelection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithoutSelect {
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By Country = By.xpath("//select[@id='Form_submitForm_Country']/option");
		
		//List<WebElement> options = driver.findElements(Country);
		
		//System.out.println(options.size());
		
		//System.out.println(options.get(4));
		
		/*for (WebElement ele : options) {
			
			String text = ele.getText();
			System.out.println(text);
			
			if(text.equalsIgnoreCase("india")) {
				ele.click();
				break;
			}
			
		}*/
		
		WithoutSelect select = new WithoutSelect();
		select.selectValueFromDropDownWithoutSelect(Country, "india");
		
		

	}
	public List<WebElement> getElements(By locator) {
		List<WebElement> elements = driver.findElements(locator);
		return elements;

	}
	public void selectValueFromDropDownWithoutSelect(By locator, String value) {
		
		List<WebElement> list = getElements(locator);
		
		System.out.println(list.size());
		for (WebElement ele : list) {
			String text = ele.getText();
			System.out.println(text);
			if(text.equalsIgnoreCase(value)) {
				ele.click();
				break;
			}
		}
		

	}

}
