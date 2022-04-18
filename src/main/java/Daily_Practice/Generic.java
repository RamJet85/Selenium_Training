package Daily_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Generic {
	
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		

	}
	
	
	
	
	
	
	
	
	
	
	public  WebElement getElement(By locator) {
		
		WebElement element = driver.findElement(locator);
		return element;
		
		
	}
	
	
	public  void doSendKeys(By locator, String value) {
		
	    getElement(locator).sendKeys(value);
		
	}
	
	
	
	
	

}
