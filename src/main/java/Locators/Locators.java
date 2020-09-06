package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// We have 8 locators in selenium
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--Incognito");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		
		driver.get("https://account.box.com/login");
		// When you click on inspect it should display the dom document object model
		
		//By Locators, By is class so that's why we called a using class name
		By Email = By.xpath("//input[@id='login-email']");
		By SubmiBbtn = By.xpath("//button[@id='login-submit']");
		By password = By.xpath("//input[@id='password-login']");
		By logBtn = By.xpath("//button[@id='login-submit-password']");
		

		//getElement(Email).sendKeys("ramkrishna.perabathula@gmail.com");
		WebElement ele =getElement(Email);
		ele.sendKeys("ramkrishna.perabathula@gmail.com");
		getElement(SubmiBbtn).click();
		getElement(password).sendKeys("naidu@10");
		getElement(logBtn).click();
		Thread.sleep(7000);
		//System.out.println(getTitle());
		String titl = getTitle();
		System.out.println(titl);
		
		
		
	}

	// generic method
	public static WebElement getElement(By locator) {

		WebElement Element = driver.findElement(locator);
		return Element;
	}

	public static String getTitle() {
		return driver.getTitle();

	}
	
	public static void doSendKeys(By locator, String data) {
		
		WebElement el1 = driver.findElement(locator);
		el1.sendKeys(data);
		
	}
	
	public void doClick(By locator) {
		WebElement ele2 = driver.findElement(locator);
		ele2.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
