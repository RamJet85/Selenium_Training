package Synchronization_Waits;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait_ListofElements {

static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.freshworks.com/");
		
		By links = By.xpath("//ul[@class='footer-nav']/li/a");
		
		Wait_ListofElements wt = new Wait_ListofElements();
		/*List<WebElement> list = wt.visibilityOfAllElements(links, 5);
		for (WebElement ele : list) {
			String text = ele.getText();
			System.out.println(text);*/
			
			
		wt.getAllPagerLinksText(links, 4);
		
		
	}
	
	public List<WebElement> visibilityOfAllElements(By locator, int timeOut) {
		
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
		
	}
	public void getAllPagerLinksText(By locator, int timeOut) {
		
		List<WebElement>list =visibilityOfAllElements(locator, timeOut);
		for (WebElement ele : list) {
			String text = ele.getText();
			System.out.println(text);
			
		}
		
	}

}
