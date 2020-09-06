package app.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PimsTest extends BaseTest{

	
	@Test(priority=1)
	public void login() {
		
		driver.get("http://pimsqa.raybiztech.com/Login/Login");
		WebElement ele = driver.findElement(By.cssSelector("input#txtStaffId"));
		ele.sendKeys("9Y7/Y/GAT.");
		ele.sendKeys(Keys.ENTER);
		
		}
	@Test(priority=2)
	public void getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title, "PIMS");
		System.out.println(driver.getCurrentUrl());
	}
}
