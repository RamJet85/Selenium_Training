package WindowHandles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WH_List {

	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://popuptest.com/goodpopups.html");
		
		driver.findElement(By.xpath("//a[text()='Good PopUp #2']//parent::b//a[text()='Good PopUp #1']")).click();
		
		Set<String> handles =driver.getWindowHandles();
		//we can convert the list into set
		ArrayList<String> list = new ArrayList<String>(handles);
		System.out.println(list.size());
		
		String parentID = list.get(0);
		System.out.println(parentID);
		
		String childID = list.get(1);
		System.out.println(childID);
		
		System.out.println(driver.switchTo().window(childID).getTitle());
		driver.close();
		System.out.println(driver.switchTo().window(parentID).getTitle());
		driver.quit();
		
		WH_List wh = new WH_List();
		wh.switchToChildBrowserWindow(childID);
		

		
	}
	
	public String switchToChildBrowserWindow(String childWindId) {
		driver.switchTo().window(childWindId);
		String title= driver.getTitle();
		driver.close();
		return title;		
	}
	public static String switchToParentBrowserWindow(String parentWindId) {
		driver.switchTo().window(parentWindId); //driver come back to parent window
		return driver.getTitle();
			
	}	
	}


