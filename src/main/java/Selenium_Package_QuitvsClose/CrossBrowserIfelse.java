package Selenium_Package_QuitvsClose;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserIfelse {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramakrishna.p\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriverManager.chromedriver().setup(); // to automatically download the browser into your system
			
			driver = new ChromeDriver();
			driver.get("https://www.google.com");
			driver.close();
		}
		
		else if(browser.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			
			driver = new FirefoxDriver();
			driver.get("https://www.google.com");
			driver.close();
		}
		
		else {
			System.out.println("Please launch the valid browser");
		}
		

	}

}
