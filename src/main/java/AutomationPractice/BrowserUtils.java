package AutomationPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtils {
	
	public WebDriver driver;

	public WebDriver launchBrowser(String browserName) {

		System.out.println("Launching: " + browserName);

		if (browserName.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		} else if (browserName.equalsIgnoreCase("IE")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}

		else {
			System.out.println(browserName + "Browser is not available ");
		}

		return driver;
		//return is used to return any method to main method, for reusability purpose we are return the methods
        // the usage of return is we can use no of times with diff values
	}
	public void maximizeBrowser() {
		driver.manage().window().maximize();
	}

	public void launchURL(String url) {
		driver.get(url);
	}

	public String getPageTitle() {
		String title = driver.getTitle();
		return title;

	}
	public String getPageURL() {
		return driver.getCurrentUrl();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
	

}
