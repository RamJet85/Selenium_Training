package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartGeneric {
	
	 WebDriver driver;
	 //static String browserName ="chrome";

	public static void main(String[] args) throws InterruptedException {
	
        By FirstloginBtn = By.xpath("//a[@class='_3Ep39l']");
		By userName = By.xpath("//input[@class='_2zrpKA _1dBPDZ']");
		By passWord = By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']");
		By Lgnbtn = By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']//span[contains(text(),'Login')]");
		By closeBtn = By.xpath("//button[@class='_2AkmmA _29YdH8']");
		By textsr = By.xpath("//div[contains(text(),'Naidu')]");
		By imgsrc = By.xpath("//img[@class='_1e_EAo']");
		
		FlipkartGeneric fg = new FlipkartGeneric();
		
		fg.launchbrowser("chrome");
		fg.maxmizeWindow();
		fg.launchURL("https://www.flipkart.com/");
		Thread.sleep(5000);
		fg.doLogin(closeBtn).click();
		WebElement el = fg.doLogin(FirstloginBtn);
		el.click();
		fg.doLogin(userName).sendKeys("9492567100");
		fg.doLogin(passWord).sendKeys("naidu@10");
		fg.doLogin(Lgnbtn).click();
		String title =fg.getTitle();
		System.out.println("The title is: "+title);
		if(title.contains("Books & More. Best Offers!")) {
			System.out.println("Title is valid");
		}
		else {
			System.out.println("Title is Invalid");
		}
		Thread.sleep(5000);
		System.out.println(fg.getText(textsr));
		System.out.println(fg.isDisplayed(imgsrc));
		fg.closeBrowser();
		
				
	}
	
	public WebDriver launchbrowser(String browserName) {

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
			System.out.println(browserName + "Browsername is not available ");
		}

		return driver;
	}

	public void maxmizeWindow() {
		driver.manage().window().maximize();
	}

	public void launchURL(String url) {
		driver.get(url);
	}
	
	public WebElement doLogin(By locator) {
		/*WebElement element = driver.findElement(locator);// give me the by locator and based the given locator will return the webelement
		return element;*/
		return driver.findElement(locator);
	}

	public String getText(By locator) {
		return doLogin(locator).getText(); // do login method
		//return driver.findElement(locator);
	}
	
	public boolean isDisplayed(By locator) {
		return doLogin(locator).isDisplayed();
		
	}
	
	public String getTitle() {
		// return driver.getTitle();
		String title = driver.getTitle();
		return title;
	}

	public void closeBrowser() {
		driver.close();
	}
	
	
	
	
}
