package GenericDummyCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		By FirstloginBtn = By.xpath("//a[@class='_3Ep39l']");
		By userName = By.xpath("//input[@class='_2zrpKA _1dBPDZ']");
		By passWord = By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']");
		By Lgnbtn = By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']//span[contains(text(),'Login')]");
		By closeBtn = By.xpath("//button[@class='_2AkmmA _29YdH8']");
		By textsr = By.xpath("//div[contains(text(),'Naidu')]");
		By imgsrc = By.xpath("//img[@class='_1e_EAo']");

		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.launchBrowser("chrome");
		br.maxmizeWindow();
		br.launchURL("https://www.flipkart.com/");
		Thread.sleep(5000);
		
		ElementUtil util = new ElementUtil(driver);
		
		util.doLogin(closeBtn).click();
		util.doLogin(FirstloginBtn).click();
		util.doLogin(userName).sendKeys("9492567100");
		util.doLogin(passWord).sendKeys("naidu@10");
		util.doLogin(Lgnbtn).click();
		Thread.sleep(5000);
		
		String text = util.doLogin(textsr).getText();
		System.out.println(text);
		boolean flag = util.doLogin(imgsrc).isDisplayed();
		System.out.println(flag);
		
	}

}
