package GenericDummyCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	//This util is not responsible for webdriver creation
	
	WebDriver driver;
	// to get the drive to this class we created a const, We need driver here to use these below methods
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
		
	}

    public WebElement doLogin(By locator) {
		/*WebElement element = driver.findElement(locator);
		return element;*/
		return driver.findElement(locator);
	}

	
	public String getText(By locator) {
		return doLogin(locator).getText(); // do login method
		//return driver.findElement(locator);
	}
	
	public boolean isDisplayed(By locator) {
		return doLogin(locator).isDisplayed();
		
	
	
	
	
	
	}
	
}
