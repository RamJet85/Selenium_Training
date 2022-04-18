package WindowHandles;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WH_List {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://smartbear.com/blog/how-to-handle-multiple-tabs-in-selenium-webdriver/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='Selenium 101 Series']")).click();

		
		  Set<String> handles =driver.getWindowHandles(); //we can convert the set into list
		  List<String> list = new ArrayList<String>(handles);
		  System.out.println(list.size());
		  
		  String parentID = list.get(0); 
		  System.out.println(parentID);
		  
		  String childID = list.get(1); 
		  System.out.println(childID);
		  
		  System.out.println(driver.switchTo().window(childID).getTitle());
		  driver.close();
		  System.out.println(driver.switchTo().window(parentID).getTitle());
		  driver.quit();
		  
		  
		 

		// WH_List wh = new WH_List();
		// wh.switchToChildBrowserWindow(childID);

	}

	public String switchToChildBrowserWindow(String childWindId) {
		driver.switchTo().window(childWindId);
		String title = driver.getTitle();
		driver.close();
		return title;
	}

	public static String switchToParentBrowserWindow(String parentWindId) {
		driver.switchTo().window(parentWindId); // driver come back to parent window
		return driver.getTitle();

	}
}
