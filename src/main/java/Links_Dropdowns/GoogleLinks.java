package Links_Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLinks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		List<WebElement> language = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		
		System.out.println(language.size());
		System.out.println("The language is: "+language.get(0).getText());
		
		for (WebElement ele : language) {
			String text = ele.getText();
			
			System.out.println(text);
			
			if(text.equals("తెలుగు")) {
				ele.click();
				break;
				
			}
			
			
		}
		
			
		

	}

}
