package PopUpsFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/tooltip/");
		Thread.sleep(3000);
		
		// Using index it's default overloading method
		driver.switchTo().frame(0);
		
		//Using frame name or Id or webelement
		//driver.switchTo().frame("age");
		By frame = By.xpath("//input[@id='age']");
		driver.findElement(frame).sendKeys("23");
		driver.switchTo().parentFrame();
		
		System.out.println(driver.findElement(By.xpath("//div[@class='ui-tooltip-content']")).getText());
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//a[text()='Download']")).click();
		

	}
	
	public void navigateToFrame(String name) {
		driver.switchTo().frame(name);
		
	}

}
