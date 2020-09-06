package DropDownSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basicDropdown {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
     // WebElement Industry = driver.findElement(By.xpath("//select[@id='Form_submitForm_Industry']"));
	//Industry.sendKeys("Education");
		
		
		//Select select = new Select(Industry);
		//select.selectByIndex(3);
		//select.selectByVisibleText("Education");
		//select.selectByValue("Electronics");
		
		//how to get the text from a tool tip, https://jqueryui.com/tooltip/ go to inspect hover on the particular element press f8 
		//get the location
		
		
		By noOfEmp = By.xpath("//select[@id='Form_submitForm_NoOfEmployees']");
		By Industry = By.xpath("//select[@id='Form_submitForm_Industry']");
		By Country = By.xpath("//select[@id='Form_submitForm_Country']");
		
		basicDropdown bd = new basicDropdown();
		bd.slectDrodownbyIndex(noOfEmp, 4);
		bd.slectDrodownbyValue(Industry, "Business Services / Consultancy - Non IT");
		bd.slectDrodownbyVisibleText(Country, "American Samoa");
		
		
		}
	
	public WebElement getElement(By locator) {
		WebElement element = driver.findElement(locator);
		return element;
		
	}
	public void slectDrodownbyIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
		
	}
	
	public void slectDrodownbyValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
		
	}
	
	public void slectDrodownbyVisibleText(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(value);
		
	}

}
