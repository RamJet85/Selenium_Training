package Synchronization_Waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {
	static WebDriver driver;

	public static void main(String[] args) {

		//Thread.sleep is a static wait, If the element is found within 2 seconds u should wait for remaining seconds
		//Implicit wait is a dynamic wait
		//It's Global wait, Once u applied it will applicable for all the web elements by default, 
		//It's not applicable for non web elements like title, Url, alerts it is the disadvantage, title is the browser property
		//Imp wait is can't wait for url
		//the moment u write FE/FEs find ele or elements the implicit wait is applicable 
		//suppose u given 20 seconds wait to find the element but the element found within 5 seconds the rest of the seconds will be ignored
		//if not found within the given time it will throw NoSuchelEmentException
		//u can override the implicit wait it will become the global wait
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		driver.get("https://app.hubspot.com/login?");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		By SignUp = By.linkText("Sign up");
		System.out.println(driver.getTitle());
		
		driver.findElement(SignUp).click();
		System.out.println(driver.getCurrentUrl());
	}

}
