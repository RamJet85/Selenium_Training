package Get_Attribute;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Get_Attribute {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		By account = By.xpath("test");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		Get_Attribute att = new Get_Attribute();
		att.radioButton(account, "id", "text");

	}

	
	public List<WebElement> getElements(By locator) {
		
		List<WebElement> element = driver.findElements(locator);
		return element;
		
	}

	public void radioButton(By locator, String attribute,String value) {
		
		List<WebElement> list = getElements(locator);
		System.out.println(list.size());
		
		for (WebElement ele : list) {
			
			String att_value = ele.getAttribute(attribute);
			if(att_value.equalsIgnoreCase(value)) {
				ele.click();
				break;
			}
			
		}
		
		
	}
	
}
