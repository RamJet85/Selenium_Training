package DropDownSelection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSuggestions {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Ramcharan");
		Thread.sleep(3000);
		
		By suggestions = By.xpath("//div[@class='OBMEnb']/ul/li");
		
		List<WebElement> list = driver.findElements(suggestions);
		
		System.out.println(list.size());
		
		for (WebElement ele : list) {
			String text = ele.getText();
			System.out.println(text);
			if(text.equalsIgnoreCase("ram charan age")) {
				ele.click();
				break;
			}
			
		}
//		GoogleSuggestions gs = new GoogleSuggestions();
//		gs.partialSuggestions(suggestions, "Ram charan");
//		
		
	}
	
	/*public void partialSuggestions(By suggestions, String value) {
		
		System.out.println(suggestions.size());
		for (WebElement ele : suggestions) {
			String text = ele.getText();
			System.out.println(text);
			if(text.equalsIgnoreCase(value)) {
				ele.click();
				break;
			}
			
		*/
}
	