package Daily_Practice;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriver {
	
	static org.openqa.selenium.WebDriver driver;

	public static void main(String[] args) {
		
		//we have dependency called web manager 
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		

	}

}
