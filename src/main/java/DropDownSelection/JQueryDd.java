package DropDownSelection;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JQueryDd {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jquery-az.com/jquery/demo.php?ex=48.0_1");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);

		By SelectOptions = By.xpath("//div[@class='ms-options-wrap']");

		By ListofOptions = By.xpath("//div[@class='ms-options']/ul/li");

		driver.findElement(SelectOptions).click();
		
		JQueryDd Dropdown = new JQueryDd();
		//multi select
		//Dropdown.Single_Multi_AllSelectDropDown(ListofOptions, "California","Kentucky","Maine");
        //Single select
		//Dropdown.Single_Multi_AllSelectDropDown(ListofOptions, "alaska");

		//All values select
		Dropdown.Single_Multi_AllSelectDropDown(ListofOptions, "all");
		
		
		}

	public List<WebElement> getElements(By locator) {
		List<WebElement> elements = driver.findElements(locator);
		return elements;

	}

	// At a time we can check mult dd's using 3 dot parameter, this String... behave as like String[]
	// The three dots can only be used in a method argument, and are called 'varargs'.
	// It means you can pass in an array of parameters without explicitly creating the array.
	public void Single_Multi_AllSelectDropDown(By locator, String... value) {

		List<WebElement> list = getElements(locator);
       // for single and multi
		if (!value[0].equalsIgnoreCase("all")) {
			System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
				String text = list.get(i).getText();
				System.out.println(text);
				// to iterate String... value we should use one more for loop, for size of array use length
				
				for (int j = 0; j < value.length; j++) {
					if (text.equalsIgnoreCase(value[j])) {
						list.get(i).click();
						break;

					}

				}

			}

		}
		// For all values
		else {
			for (int all = 0; all < list.size(); all++) {
				list.get(all).click();
			}
		}

	}

}
