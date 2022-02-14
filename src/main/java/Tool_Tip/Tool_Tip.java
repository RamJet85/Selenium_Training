package Tool_Tip;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tool_Tip {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://get.foundation/sites/docs/tooltip.html");
		
		By tl = By.xpath("//span[text()='JavaScript']");
	
		
		By TPtext = By.xpath("//div[contains(text(),'Requires a JavaScript library.')]");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//System.out.println(Tool_Tip.getToolTipText(driver.findElement(tl), TPtext));
		
		// f8 sources 
		
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(tl)).build().perform();
		System.out.println(driver.findElement(TPtext).getText());


	}
	
	public static String getToolTipText(WebElement element, By locator){
		
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		return driver.findElement(locator).getText();
		
			
		//return elementutils.getTextFromToolTip(elementutils.getElement(addressToolTip), addressExportText);
			
			
		}
			
		
	}


