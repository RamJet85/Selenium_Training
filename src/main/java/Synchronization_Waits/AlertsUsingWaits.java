package Synchronization_Waits;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsUsingWaits {

	static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		By loc = By.xpath("//button[(text()='Click for JS Alert')]");
		//Using webdriver wait class we can accept the pop up without switching
		
//		org.openqa.selenium.support.ui.WebDriverWait wait = new org.openqa.selenium.support.ui.WebDriverWait(driver, 10);
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		System.out.println(alert.getText());
//		alert.accept();
//      handle alert using explicitly wait, Don't need to switch, alertIsPresent will internally check and accept the alert
		
		AlertsUsingWaits wt = new AlertsUsingWaits();
		Alert alert = wt.waitForAlertToBePresent(loc, 5);
		System.out.println(alert.getText());
		alert.accept();
		

		
    }
	
	public WebElement getElement(By locator) { 

		WebElement element = driver.findElement(locator); 
		return element; 

	}
	public Alert waitForAlertToBePresent(By locator, int timeOut) {
		
		getElement(locator).click();
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.alertIsPresent());
		 		
	}

}
