package Links_Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		List<WebElement> language = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		
		test t = new test();
		t.doLinkClick(language, "తెలుగు");
		
		
			
	}
	public void doLinkClick(List<WebElement> linklist, String value) {
		
		System.out.println(linklist.size());
		for (WebElement ele : linklist) {
			
			String text = ele.getText();
			System.out.println(text);
			if(text.equalsIgnoreCase(value)) {
				ele.click();
				break;
			}
			
		}
		
			
	}
	}


