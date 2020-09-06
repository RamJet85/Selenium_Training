package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementActions {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.hubspot.com/login?");
		Thread.sleep(3000);
		
		By Email = By.xpath("//input[@id='username']");
		By password = By.xpath("//input[@id='password']");
		By submit = By.xpath("//button[@id='loginBtn']");
		
		//using actions 
//		Actions act = new Actions(driver);
//		
//		act.sendKeys(driver.findElement(Email), "Ram@gmail.com").build().perform();
//		act.sendKeys(driver.findElement(password), "2325525").build().perform();
//		act.click(driver.findElement(submit));
		
		WebElementActions Ac = new WebElementActions();
		Ac.doActionSendKeys(Email, "Ram@gmail.com");
		Ac.doActionSendKeys(password, "1234433df");
		Ac.doActionClick(submit);
	}
	
	
	
	
	public WebElement getElement(By locator) {
		WebElement element = driver.findElement(locator);
		return element;
		
	}
	public void doActionSendKeys(By locator, String value) {
		
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value).perform();
		
	}
	
    public void doActionClick(By locator) {
		
		Actions act = new Actions(driver);
		act.click(getElement(locator)).perform();
		
	}
}
