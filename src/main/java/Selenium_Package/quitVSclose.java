package Selenium_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class quitVSclose {

	public static void main(String[] args) {
		
		// Quit will make the session ID as null
		// Close will make the session ID as invalid
		// Control + Shift+ o to import all the packages in one shot
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www,google.com");
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		System.out.println(driver.getTitle());

	}

}
