package DatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Date_Calendar {
	
	//static WebDriver driver;

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.trujet.com/#/home");
	driver.manage().window().maximize();
	
	
	By date = By.xpath("//input[@placeholder='Departure']");
	String dateValue = "9/14/2020";
	//driver.findElement(date).click();
	Date_Calendar.dateSelectByJs(driver, date, dateValue);
	

	
	}

	public static void dateSelectByJs( WebDriver driver, By element, String dateValue) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].setAttribute('value','"+dateValue+"');", element);

	}

}
