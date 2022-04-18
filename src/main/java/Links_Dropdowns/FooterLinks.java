package Links_Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterLinks {
	
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		driver.manage().window().maximize();
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='footer-nav']/li/a"));
		System.out.println(list.size());
		System.out.println(list.get(0).getText());
		
		for (WebElement ele : list) {
			
			String text = ele.getText();
			System.out.println(text);
			
			if(text.equalsIgnoreCase("partNers")) {
				ele.click();
				break;
			
			}
			
		}
		
	}}	
		
		
		
	


