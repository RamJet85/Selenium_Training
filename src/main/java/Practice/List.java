package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class List {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		By options = By.xpath("//select[@id='Form_submitForm_Industry']");
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		
		
		List.getDropDownOptionsSelectValues(options, "Education");
		
		
	}
	
	
	public static void getDropDownOptionsSelectValues(By locator, String value) {

		WebElement DropdownList = driver.findElement(locator);
		
		Select select = new Select(DropdownList);
		java.util.List<WebElement> list = select.getOptions();
		
		System.out.println(list.size());
		
		for (WebElement ele : list) {
			
			String text = ele.getText().trim();
			System.out.println(text);
			
			if(text.equalsIgnoreCase(value)){
				
				ele.click();
				break;
				
			}
			
		}
		
		
	}

}
