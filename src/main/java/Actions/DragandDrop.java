package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		
		By source = By.xpath("//div[@id='draggable']");
		
		By target = By.xpath("//div[@id='droppable']");
		//In actions class we should pass the driver
		// Drag and drop is only within in the webpage 

		Actions act = new Actions(driver);
		
		Thread.sleep(2000);
		//act.dragAndDrop(driver.findElement(source), driver.findElement(target)).perform();
		
		act.clickAndHold(driver.findElement(source)).moveToElement(driver.findElement(target)).release().build().perform();
		
		
		
	}

}
