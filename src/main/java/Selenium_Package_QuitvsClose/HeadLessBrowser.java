package Selenium_Package_QuitvsClose;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowser {

	public static void main(String[] args) {
		//Headless browser is nothing but the script is running without any browser, browser is not visible & testing is 
		//happening in background
		//It is fast compared to normal browser execution
		//when to use suppose u have 10 sanity tc's u want to run quickly so at that time we use headless browser

		ChromeOptions co = new ChromeOptions();
		//co.addArguments("--headless");
		//To launch the application in incognito mode
		
		co.addArguments("--Incognito");
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(co);
		
		driver.get("https://www.google.com");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

}
