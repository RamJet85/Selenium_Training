package Selenium_Package_QuitvsClose;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtils {
	
	public WebDriver driver;
	

	public WebDriver launchBrowser(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		
		else {
			System.out.println(browserName+ "Browsername is not available ");
		}
		
		return driver;
		
		}
	public void maxmizeWindow() {
		driver.manage().window().maximize();
	}
	
	/**
	 * This method is used to launch the url
	 * @param url
	 */
	public void launchURL(String url) {
		driver.get(url);	
	}
	
	/**
	 * this method is used to get the title
	 * @return page title
	 */
	
	public String getTitle() {
		//return driver.getTitle();
		String title = driver.getTitle();
		return title;
		
	}
	/**
	 * this method is used to get the current page url
	 * @return page url
	 */
	public String getPageURL() {
		return driver.getCurrentUrl();
		
		}
	
	
	public void quitBrowser() {
		driver.quit();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	
	
	
	
	
	

}
