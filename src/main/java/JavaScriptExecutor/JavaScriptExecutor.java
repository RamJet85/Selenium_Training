package JavaScriptExecutor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutor {
	static WebDriver driver;

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");

		//Some actions we can't do with selenium like scroll down, Inner page text, highlighting text boxes with some colors
		
		/*JavascriptExecutor js = (JavascriptExecutor)driver; // Converting driver into js
		String title = js.executeScript("return document.title;").toString(); // return.do.title is js scrpt 
		System.out.println(title);*/
		
		
		JavaScriptUtils Utils = new JavaScriptUtils(driver);
//		System.out.println(Utils.getTilteByJS());
//		
//		Utils.scrollPagedown();
//		System.out.println(Utils.getPageInnerText());
		
			
		Utils.generateAlert("This is Ram");
		
		
		//Utils.drawBorder(driver.findElement(By.xpath("//input[@id='login-email']")));
		
		//Utils.scrollPagedown();
			
		
		
	}

}
