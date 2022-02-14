package Selenium_Package_QuitvsClose;

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
		
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		System.out.println(driver.getTitle());
		
        //NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		//when u launch the driver one session ID will be created, 
		//Sending request to browser through selenium, After quit u want to do any action like get title or find element,
		//u can't bcoz session will get null,
		//It is better to use driver.close() when you are dealing with multiple tabs or windows.
	}

}
