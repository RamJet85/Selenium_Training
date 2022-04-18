package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdowns_Multi {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jquery-az.com/jquery/demo.php?ex=48.0_1");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		By dpValues = By.xpath("//div[@class='ms-options-wrap']");
		
		By list = By.xpath("//div[@class='ms-options']/ul/li");
		
		driver.findElement(dpValues).click();
		//multiSelectDropDown(list, "California","Kentucky");
		multiSelectDropDown(list, "all");
		
	
	}
	
		
	public static void multiSelectDropDown(By locator, String... value) {
		
		List<WebElement> list = driver.findElements(locator);
		
		if(! value[0].equalsIgnoreCase("all")){
		int size = list.size();
		
		for(int i=0;i<size;i++) {
			
			String text = list.get(i).getText();
			System.out.println(text);
			for(int j=0;j<value.length;j++) {
				
				if(text.equalsIgnoreCase(value[j])) {
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
