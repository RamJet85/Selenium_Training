package Links_Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AllLinks {

	public static void main(String[] args) {

		// findElement () will return only single WebElement and if that element is not
		// located or we use some wrong selector then it will throw NoSuchElement exception.

		// findElements() will return List of WebElements – for this we need to give
		// locator in such a way that it can find multiple elements and will return you
		// list of web elements then using List we can iterate and perform our operation.
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		List<WebElement> Linkslist = driver.findElements(By.tagName("a"));
		int size = Linkslist.size();
		System.out.println("The total links are: "+size);
		System.out.println("value is: "+Linkslist.get(0).getText());
		//If we have any empty links which are not having text then we should use isempty method,only it will print which are having links
		//Let us assume if text is empty, condition is true ! is make the entire condition as false then it is not print the text
		//Let us assume if text is not empty, condition is false ! is make the entire condition as true then it is print the text ! will make condition is true
       // Equals do the exact comparison
		for(int i=0; i<Linkslist.size(); i++) {
			String text = Linkslist.get(i).getText();
			if(!text.isEmpty()) {
			System.out.println(i +"-->"+text);
			
		}
		
		
		}
		
	}

}

