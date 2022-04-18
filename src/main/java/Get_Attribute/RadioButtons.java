package Get_Attribute;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtons {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://materializecss.com/radio-buttons.html");
		Thread.sleep(3000);
		
		By radiolist = By.xpath("//body//form//p");
		
		radioButtons(driver.findElements(radiolist), "Yellow");
		

}
	
	public static void radioButtons(List<WebElement> list, String value) {
		
		System.out.println(list.size());
		for (WebElement ele : list) {
			String text =ele.getText();
			System.out.println(text);
			if(text.equalsIgnoreCase(value)) {
				ele.click();
				break;
			}
			
			
		}
		
		
		
	}
}
