package PopUpsFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {
	
	static WebDriver driver;

		public static void main(String[] args) throws InterruptedException  {
			
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://safenote.co/upload-file");
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//div[@class='dz-message']")).sendKeys("C:\\Users\\ramakrishna.p\\Desktop");

}
	}
