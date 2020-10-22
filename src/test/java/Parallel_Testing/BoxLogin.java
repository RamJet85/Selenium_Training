package Parallel_Testing;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BoxLogin extends BaseTest{
	
	
	By username = By.cssSelector("#login-email");
	By password = By.cssSelector("#password-login");
	By submit = By.cssSelector("#login-submit");
	By logiBtn = By.cssSelector("#login-submit-password");

	@Test(priority=1)
	public void login() {
		
		driver.get("https://account.box.com/login?redirect_url=%2F");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(username).sendKeys("ramkrishna.p@gmail.com");
//		driver.findElement(submit).click();
//		driver.findElement(password).sendKeys("naidu@10");
//		driver.findElement(logiBtn).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		}

}
