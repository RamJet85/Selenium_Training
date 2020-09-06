package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlipkartTest {
	

	public static void main(String[] args) throws InterruptedException {
		
		String browserName = "chrome";
		//By locators 
		By closeBtn = By.xpath("//button[@class='_2AkmmA _29YdH8']");
		By Email = By.xpath("//input[@class='_2zrpKA _1dBPDZ']");
		By password = By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']");
		By logiBtn = By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']//span[contains(text(),'Login')]");
		By image = By.xpath("//img[@class='_1e_EAo']");
		By text = By.xpath("//span[contains(text(),'Electronics')]");
		By Login = By.xpath("//a[@class='_3Ep39l']");
		
		BrowserUtils br = new BrowserUtils();
		WebDriver driver = br.launchBrowser(browserName);
		br.maximizeBrowser();
		br.launchURL("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		
		String title = br.getPageTitle();
		System.out.println("The title is: "+title);
		
		System.out.println("The URL is: "+br.getPageURL());
		
		
		ElementUtils elu = new ElementUtils(driver);// this driver is responsible to call element util methods
		
		elu.doClick(closeBtn);
		elu.doClick(Login);
		elu.doSendKeys(Email, "9492567100");
		elu.doSendKeys(password, "naidu@10");
		elu.doClick(logiBtn);
		
		System.out.println(br.getPageURL());
		System.out.println(elu.isDisplayed(image));
		
		System.out.println(elu.getText(text));
	}

}
