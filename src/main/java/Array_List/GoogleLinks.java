package Array_List;

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
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		
		GoogleLinks links = new GoogleLinks();
		links.doLinkClick(list, "తెలుగు");

	}
	
	
	
	
	public void doLinkClick(List<WebElement> linklist, String value) {

		System.out.println(linklist.size());

		for (WebElement ele : linklist) {
			String linktext = ele.getText();
			System.out.println(linktext);
			if (linktext.equals(value)) {
				ele.click();
				break;
			}
			
			
		}
		
	}
	
	
	
	
	
	
	
	
	

}
