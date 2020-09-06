package Actions;

import java.util.List;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElement {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/Default.aspx");
		Thread.sleep(5000);
		
		By Menu = By.xpath("//a[@id='highlight-addons']");

		Actions act = new Actions(driver);

		act.moveToElement(driver.findElement(Menu)).perform();
		

		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='add-ons-tab']/li/a"));
		
		System.out.println(list.size());
		
	    for (WebElement ele : list) {
	    	String text = ele.getText();
	    	System.out.println(text);
	    	
	    	/*if(text.equalsIgnoreCase("Travel Insurance")) {
	    		ele.click();
	    		break;
	    	}
	    	
	    	
			
		}

	    System.out.println(driver.getTitle());*/

		
		
		
		
	}
	}
}
