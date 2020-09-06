package Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		WebElement RightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
        
		Actions act = new Actions(driver);
		act.contextClick(RightClick).perform();
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li"));
		
		// To get only text without separator use //ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-icon')]
		
		System.out.println(list.size());
		
		for (WebElement ele : list) {
			System.out.println(ele.getText());
			if(ele.getText().equalsIgnoreCase("Copy")) {
				ele.click();
				break;
			}
		}
}
}