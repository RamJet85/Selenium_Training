package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getElementvalue {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.hubspot.com/login?");
		Thread.sleep(5000);
		
		By Email = By.xpath("//input[@id='username']");
		By password = By.xpath("//input[@id='password']");
		By submit = By.xpath("//button[@id='loginBtn']");
		
		By text = By.xpath("//i18n-string[contains(text(),\"Don't have an account?\")]");
		
		By image = By.xpath("//i18n-string[contains(text(),'Sign up')]");
		
		//Webelement method we can print like this
		/*WebElement name = getElement(firstname);
		name.sendKeys("Ram");
		
		getElement(email).sendKeys("nani@gmail.com");// internally it will create the webelement
		
		getElement(submit).click();*/
		
		getElementvalue value = new getElementvalue();
		System.out.println(value.getTitle());
		
		value.doSendKeys(Email, "ram@gmail.com");
		value.doSendKeys(password, "ram@1234");
		Thread.sleep(2000);
		value.doClick(submit);
		//Thread.sleep(2000);
		System.out.println(value.getText(text));
		System.out.println(value.isDisplayed(image));		
	}
	   /**
    * This is method is used to create the webelement on the basis of given by locator
    * @param locator
    * @return webelement
    */
    public WebElement getElement(By locator) { // give me the by locator i'll give u the web element
    	
    	WebElement element = driver.findElement(locator); // based on the given locator it will create the web element
    	return element; // this method is for find the webelement
    	
    }
    public void doSendKeys(By locator, String value) {
    
    	getElement(locator).sendKeys(value); // getEle method return Webelement and perform action with sendkeys
    		//in this get element return webelement based on locator and send keys to enter the value
    }
    public void doClick(By locator) {
    	getElement(locator).click();
    }
    public boolean isDisplayed(By locator) {
    	return getElement(locator).isDisplayed();
    }
    
    public String getText(By locator) {
    	return getElement(locator).getText();
    }
    public String getTitle() {
    	return driver.getTitle();
    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}