package DropDownSelection;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelect {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jquery-az.com/jquery/demo.php?ex=48.0_1");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		By list = By.xpath("//div[@class='ms-options-wrap']");
		
		By ListofOptions = By.xpath("//div[@class='ms-options']/ul/li");
		
	    driver.findElement(list).click();
		
		MultiSelect.multiSelectDropdowns(ListofOptions, "all");
		
		//multi select
		//Dropdown.Single_Multi_AllSelectDropDown(ListofOptions, "California","Kentucky","Maine");
		//Single select
		//Dropdown.Single_Multi_AllSelectDropDown(ListofOptions, "alaska");
		
	
		

	}
	
	public static void multiSelectDropdowns(By locator, String... value ){
		
		
		List<WebElement> list = driver.findElements(locator);
		
		
		if(!value[0].equalsIgnoreCase("all")){
		
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++){
			String text = list.get(i).getText();
			System.out.println(text);
			
			for(int j =0; j<value.length;j++){
				if(text.equalsIgnoreCase(value[j])){
					list.get(i).click();
					break;
					
			}
			
		}
		
		}
	
		}
		
		else {
			for (int all = 0; all < list.size(); all++) {
				list.get(all).click();
			}
			
		}
	
	}

}
