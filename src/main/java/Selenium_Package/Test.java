package Selenium_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramakrishna.p\\Downloads\\chromedriver_win32\\chromedriver.exe");

		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		//driver.navigate().refresh();
		
	//	driver.navigate().back();
		
		//driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		System.out.println(driver.getTitle());

		
	}

}
