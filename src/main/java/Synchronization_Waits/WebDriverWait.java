package Synchronization_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWait {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		/*Synchronization: when two or more components involved to perform any action, 
		we expect those components to work together with the same pace. The co-ordination between 
		these components to run paralelly is called Synchronization.*/
	
	//Inplicit wait	
		
//Thread.sleep is a static wait, If the element is found within 2 seconds u should wait for remaining seconds
//Implicit wait is a dynamic wait
//It's Global wait, Once u applied it will applicable for all the web elements by default, 
//It's not applicable for non web elements like title, Url, alerts it is the disadvantage, title is the browser property
//Imp wait is can't wait for url
//the moment u write FE/FEs find ele or elements the implicit wait is applicable 
//suppose u given 20 seconds wait to find the element but the element found within 5 seconds the rest of the seconds will be ignored
//if not found within the given time it will throw NoSuchelEmentException
//u can override the implicit wait it will become the global wait
				
   //Explicit wait:
		
//Explicit wait is not available in the form of keyword or method, It's not a global wait
//It is available in the form of 2 things webdriver wait it is a child of (FW) and fluent wait-->implements wait interface
// It's a custom wait, webdriver wait it's only applicable for specific webelement
// It is applicable for both Web and non Web elements alert title url's
// It is the custom one. It will be used if we want the execution to wait for some time until some condition achieved..
//presenceOfElementLocated, visibilityOfElement, titleIs, URLtobe, alertIsPresent, elementToBeClickable		
		
   // Fluent wait:
		
	//It waits for a maximum period of time and keeps checking at particular frequency
	//until it reaches an exception of not finding the element..

		/*
		 * Syntax -
		 * 
		 * Wait<WebDriver> wait = new FluentWait<WebDriver>(driver) 
		 * .withTimeout(30,SECONDS) 
		 * .pollingEvery(5, SECONDS) 
		 * .ignoring(NoSuchElementException.class);
		 */
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.hubspot.com/login?");
		WebDriverWait wt = new WebDriverWait();
		
//		org.openqa.selenium.support.ui.WebDriverWait wait = new org.openqa.selenium.support.ui.WebDriverWait(driver, 10);
//		System.out.println(wait.until(ExpectedConditions.titleContains("Login")));
//		System.out.println(wait.until(ExpectedConditions.titleIs("HubSpot Login")));
//		System.out.println(driver.getTitle());
		
		System.out.println(wt.waitForTitlePresent("HubSpot Login", 5));
		
		By Email = By.xpath("//input[@id='username']");
		By password = By.xpath("//input[@id='password']");
		By submit = By.xpath("//button[@id='loginBtn']");
		By SignUp = By.linkText("Sign up");
		By firstName = By.xpath("//input[@id='uid-firstName-5']");
		
		
//      To create ex wait, we have 1 class i.e, webdriverwait, this is also dynamic wait
//		org.openqa.selenium.support.ui.WebDriverWait wait = new org.openqa.selenium.support.ui.WebDriverWait(driver, 10);
//		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(Email));
//		ele.sendKeys("retet@gmail.com");
		
		
		wt.waitForElementToBeVisible(Email, 10).sendKeys("fhgfhgfh@gmail.com");
//		WebElement ele =wt.waitForElementPresent(Email,10);
//		ele.sendKeys("gjgjhgjg@gmail.com");
		driver.findElement(password).sendKeys("dgdfhhfghf");
		driver.findElement(submit).click();
		driver.findElement(SignUp).click();
		boolean b =wt.waitForUrl("https://app.hubspot.com/signup/crm/step/user-info", 5);
		System.out.println(b);
		
		wt.waitForElementPresent(firstName, 5).sendKeys("Ram");
		
	}
	
	public WebElement getElement(By locator) { // give me the by locator i'll give u the web element

		WebElement element = driver.findElement(locator); // based on the given locator it will create the web element
		return element; // this method is for find the web element

	}
	public WebElement waitForElementPresent(By locator,int timeUnit) {
		
		org.openqa.selenium.support.ui.WebDriverWait wait = new org.openqa.selenium.support.ui.WebDriverWait(driver, timeUnit);
		//WebDriverWait wait = new WebDriverWait(driver, timeUnit);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		//until method returns webelement
		
		
	}
	public String waitForTitlePresent(String titleValue, int timeUnit) {
		
		org.openqa.selenium.support.ui.WebDriverWait wait = new org.openqa.selenium.support.ui.WebDriverWait(driver, timeUnit);
		wait.until(ExpectedConditions.titleIs(titleValue));
		return driver.getTitle();
		
	}
	public WebElement waitForElementToBeVisible(By locator,int timeUnit) {
		WebElement element = getElement(locator);
		org.openqa.selenium.support.ui.WebDriverWait wait = new org.openqa.selenium.support.ui.WebDriverWait(driver, timeUnit);
		
		return wait.until(ExpectedConditions.visibilityOf(element)); // getelement 
	}
	
	public boolean waitForUrl(String url,int timeUnit ) {
		
		org.openqa.selenium.support.ui.WebDriverWait wait = new org.openqa.selenium.support.ui.WebDriverWait(driver, timeUnit);
		return wait.until(ExpectedConditions.urlToBe(url));
	}
	
	
	}
