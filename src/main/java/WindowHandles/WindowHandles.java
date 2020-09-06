package WindowHandles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles { // browser pop up tabs

	static WebDriver driver;

	public static void main(String[] args) {
		
		// to switch to child window or new tab we use getwindowhandles method
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://popuptest.com/goodpopups.html");
		
		driver.findElement(By.xpath("//a[text()='Good PopUp #2']//parent::b//a[text()='Good PopUp #1']")).click();
		// set will contain unique value, window id's are unique values
		Set<String> windows = driver.getWindowHandles(); // return window id's of the available windows
		//windowhandles fetch window id's
		//set don't have proper order it will automatically pick the first window 
		Iterator<String> it = windows.iterator();
		//whenever we are going to fetch the values from the non ordered collection we should use iterator
		//set is not order based but list is order based so we use for loop to get the values
		//iterator is pointing to set 
		String parentWindowID = it.next(); // iterator plz go to the next location & fetch the value, moving we use next method
		System.out.println("parent window ID is: "+parentWindowID);
		
		String childWindowID = it.next();
		System.out.println("child window ID is: "+childWindowID);
		
		driver.switchTo().window(childWindowID);
		System.out.println("child window title is: "+ driver.getTitle());
		driver.close(); // close the child window close the current instance of the driver
		
		driver.switchTo().window(parentWindowID); //Again parent window switch back to the parent window
		System.out.println("parent window title is: "+ driver.getTitle());
		driver.quit(); // close the child & parent close the all instances of the driver
		
		// capturing window id's and switching part 
		
		
	}
		
	}


