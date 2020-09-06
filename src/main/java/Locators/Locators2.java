package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators2 {

	static WebDriver driver;

	public static void main(String[] args) {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--Incognito");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);

		driver.get("https://account.box.com/login");
		// When you click on inspect it should display the dom document object model

		// By Locators, By is class so that's why we called a using class name
		//id,name.classname attributes
		//Input, div, select tagnames or htmltag
		//Xpath is locator
		By Email = By.xpath("//input[@id='login-email']");
		By SubmiBbtn = By.xpath("//button[@id='login-submit']");
		By password = By.xpath("//input[@id='password-login']");
		By logBtn = By.xpath("//button[@id='login-submit-password']");

	}

	public static WebElement getElement(By locator) {

		WebElement element = driver.findElement(locator);
		return element;
	}
	public static void doSendKeys(By locator, String value) {
		getElement(locator);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
