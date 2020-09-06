package Selenium_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingSwitch {

	public static void main(String[] args) {
		WebDriver driver;
		
		String browser = "chrome";
		
		switch (browser) {
		  case "chrome":
			  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramakrishna.p\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
				driver = new ChromeDriver();
				//driver.close();
		    
		  default:
			  System.out.println("None of the above");
		}
		

	}

}
