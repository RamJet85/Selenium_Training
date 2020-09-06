package Parallel_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
WebDriver driver;
	
//In cross browser execution better to maintain test blocks 

// parameter we should give parameter name and parametrer value parameter = "browser" value = "chrome"
	
    @Parameters("browser")// parameter name name = browser in xml file
    @BeforeTest
	public void setup(String browserName) {
    	
    	if(browserName.equalsIgnoreCase("chrome")) {
    		WebDriverManager.chromedriver().setup();
    		driver = new ChromeDriver();
    	}
    	else if(browserName.equalsIgnoreCase("firefox")) {
    		WebDriverManager.firefoxdriver().setup();
    		driver = new FirefoxDriver();
    	}
    	else if(browserName.equalsIgnoreCase("ie")) {
    		WebDriverManager.iedriver().setup();
    		driver = new InternetExplorerDriver();
    	}
    	else {
    		System.out.println(browserName  + "is not found");
    	}
		
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		

	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
