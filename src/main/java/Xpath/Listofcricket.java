package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Listofcricket {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/23256/eng-vs-ire-3rd-odi-ireland-tour-of-england-2020");
		
		List<WebElement> list = driver.findElements(By.xpath("//a[text()=' Moeen ']//parent::div//following-sibling::div"));
		
		List<WebElement> xpath = getList("Roy");
		
		for (WebElement ele : xpath) {
			System.out.println(ele.getText());
			
		}
		
		/*int size =list.size();
		System.out.println(size);
		
		for(int i=1;i<size;i++) {

			String text =list.get(i).getText();
			System.out.println(text);
			
		}*/
	}
	
	public static List<WebElement> getList(String playerName) {
		
		return driver.findElements(By.xpath("//a[text()=' "+playerName+" ']//parent::div//following-sibling::div"));
	}

}
