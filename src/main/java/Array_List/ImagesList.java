package Array_List;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImagesList {

	public static void main(String[] args) {
	
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> imagelist = driver.findElements(By.tagName("img"));
		
		System.out.println(imagelist.size());
		
		for (WebElement ele : imagelist) {
			System.out.println(ele.getAttribute("src"));
			
		}
	
	
	}

}
