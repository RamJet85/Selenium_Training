package app.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HubSpotTest extends BaseTest{
	
	
	
	By username = By.cssSelector("input#username");
	By password = By.cssSelector("input#password");
	By logiBtn = By.cssSelector("button#loginBtn");

	@Test(priority=1)
	public void login() {
		
		driver.get("https://app.hubspot.com/login?");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(username).sendKeys("krishna.qa567@gmail.com");
		driver.findElement(password).sendKeys("Ramakrishna@85");
		driver.findElement(logiBtn).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		}
	/*@Test(priority=2)
	public void contacts() {
		
		driver.findElement(By.linkText("Contacts")).click();
		//System.out.println(driver.getTitle());
		
	}
	*/
	
}
