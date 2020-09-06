package Links_Dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		List<WebElement> list = driver.findElements(By.xpath("//div[@id='Form_submitForm_Industry_Holder']//div[@class='middleColumn']"));
		int size = list.size();
		System.out.println(size);

		for(WebElement ele : list) {
			String text = ele.getText();
			System.out.println(text);
			if(text.equals("Computer/Technology-Manufacturer")) {
				ele.click();
				break;
			}
				
			}
		/*
		for(int i=0;i<size;i++) {
			
			String text = list.get(i).getText();
			System.out.println(text);
			if(list.get(i).getText().contains("Education")) {
				list.get(i).click();
				break;
			}*/
			
			
			
		}
		}
	

	
