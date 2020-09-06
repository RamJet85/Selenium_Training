package Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericforActions {

	
		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.spicejet.com/Default.aspx");
			Thread.sleep(5000);
			
			By Menu = By.xpath("//a[@id='highlight-addons']");
			By ele = By.xpath("//a[contains(text(),'Travel Insurance')]");
			//by.linktext is only for a//
			GenericforActions Ac = new GenericforActions();
			//Ac.Actions(Menu, "Travel Insurance");
			
	}
		

		public WebElement getElement(By locator) {
			WebElement element = driver.findElement(locator);
			return element;

		}
		public List<WebElement> getElements(By locator) {
			List<WebElement> elements = driver.findElements(locator);
			return elements;

		}
		
		public void Actions(By locator, String value) {
			
			Actions act = new Actions(driver);
			act.moveToElement(getElement(locator)).perform();
			List<WebElement> list = getElements(locator);
			System.out.println(list.size());
			for (WebElement ele : list) {
				String text = ele.getText();
				if(text.equalsIgnoreCase(value)) {
					ele.click();
					break;
				}
				
			}
			
		   
			
			
}
}
