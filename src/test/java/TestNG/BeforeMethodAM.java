package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BeforeMethodAM {

	
WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

	}
	
	@Test(priority=1)
	public void googleTitleTest() {
		String title =driver.getTitle();
		System.out.println("The title is: "+title);
		
		Assert.assertEquals(title, "Google");
	}
	
	@Test(priority=2)
	public void Enter() {
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Ram");
	}
	
	
	@Test(priority=3)
	public void getCurrentUrl() {
		String url =driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://www.google.com/?gws_rd=ssl");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	
	
}
