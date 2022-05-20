package Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Generic {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/Default.aspx");
		Thread.sleep(5000);
		By AddOns = By.xpath("//a[@id='highlight-addons']");
		By link = By.xpath("//a[contains(text(),'Travel Insurance')]");
		
		
		Generic g = new Generic();
		//g.getMenuListTwoLevels(driver.findElement(AddOns), locator, value);
		
		

	}
	
	public void getSinglelayer() {
		
	}

	public void getMenuListTwoLevels(WebElement element, By locator, String value) {
		//We to move, locator to move, String to send the value

		Actions action = new Actions(driver);
		
		action.moveToElement(element).perform();
		List<WebElement> addonList = driver.findElements(locator);
		System.out.println(addonList.size());
		for (WebElement ele : addonList) {
			if (!ele.getText().isEmpty()) {
				String addonText = ele.getText();
				System.out.println(addonText);
				if (addonText.equals(value)) {
					ele.click();
					break;
				}
			}
		}

	}
}
