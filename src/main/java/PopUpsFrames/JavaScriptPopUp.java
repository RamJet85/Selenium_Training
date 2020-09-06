package PopUpsFrames;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptPopUp {
	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		By SignUpBtn = By.xpath("//input[@name='proceed']");
		
		driver.findElement(SignUpBtn).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		driver.switchTo().defaultContent();
		
		// click on dismiss to cancel 
		
		//JavaScriptPopUp js = new JavaScriptPopUp();
		

	}
	
//	public WebElement getElement(By locator) {
//		WebElement element = driver.findElement(locator);
//		return element;
//
//	}
//
//	
	/*public void JavaScriptPopUp(By locator) {
		
		WebElement ele = driver.findElement(locator);
	    ele.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
				
	}
*/
}
