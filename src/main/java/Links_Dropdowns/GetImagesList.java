package Links_Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetImagesList {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
		List<WebElement> imageslist = driver.findElements(By.tagName("img"));
		int size = imageslist.size();
		System.out.println("The images size is: "+size);
		System.out.println("The value is: "+imageslist.get(0).getText());
		
		for (WebElement ele : imageslist) {
			System.out.println(ele.getAttribute("src"));
			
		}
		

		
		
		
		
		
		
		
	}

}
