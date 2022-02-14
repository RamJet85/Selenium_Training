package HashMap;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hashMapLogins {
	
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://account.box.com/login");
		
		By userName = By.xpath("//input[@id='login-email']");
		By passWord = By.xpath("//input[@id='password-login']");
		By LoginBtn = By.xpath("//button[text()=' Log In']");
		By next = By.xpath("//button[text()=' Next']");
		By Menu = By.xpath("//span[@class='avatar-initials ']");
		By logoutBtn = By.xpath("//span[text()='Log Out']");
		
		String credentials = getCredentials().get("Login1");
		System.out.println(credentials.split(":")[0].trim());	
		System.out.println(credentials.split(":")[1].trim());
		
		//For role base testing like keys as roles and values as users
		//if the app has multiple roles or logins at that time we should go for hashmap
		
		
		
		driver.findElement(userName).sendKeys(credentials.split(":")[0].trim());
		//because username & password combined as 1 string so we should split 
		driver.findElement(next).click();
		
		driver.findElement(passWord).sendKeys(credentials.split(":")[1].trim());
		driver.findElement(LoginBtn).click();
		
		//Splits a string into array of substrings
		
		
		
	}
	
	
	public static HashMap<String, String> getCredentials(){
		
		HashMap<String, String> Hmap = new HashMap<String, String>();
		//because username & password combined as 1 string so we should split 
		Hmap.put("Login1", "ramakrishna@gmail.com : naidu@12");
		Hmap.put("Login2", "ramkrihsh@gmak.com : naidu@123");
		Hmap.put("Login3", "taysghdj@gmail.com : najsgi@123");
		
		return Hmap;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
