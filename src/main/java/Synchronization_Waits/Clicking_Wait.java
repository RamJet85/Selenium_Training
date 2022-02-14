package Synchronization_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Clicking_Wait {

static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://app.hubspot.com/login?");
		
		By SignUp = By.linkText("Sign up");

		
		
		Clicking_Wait wt = new Clicking_Wait();
		//wt.waitForElementToBeClickable(SignUp, 5).click();
		wt.clickWhenReady(SignUp, 5);
		
		
	}
	// This method is used only for which are clickable it could be button, image, Link
	// using this method u can click or sendkeys or displayed 
	public WebElement waitForElementToBeClickable(By locator, int timeOut) {
		
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public void clickWhenReady(By locator, int timeOut) {
		
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		element.click();
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
