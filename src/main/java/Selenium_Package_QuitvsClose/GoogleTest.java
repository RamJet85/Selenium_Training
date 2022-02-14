package Selenium_Package_QuitvsClose;

public class GoogleTest {

	public static void main(String[] args) {
		
		String browser = "chrome";
		
		BrowserUtils br = new BrowserUtils();
		
		br.launchBrowser(browser);// or we can directly pass the browser name instead of creating the variable
		
		br.maxmizeWindow();
		
		br.launchURL("https:www.flipkart.com");
		
		String title = br.getTitle();
		System.out.println("The page title is: "+title);
		
		if(title.contains("Online Shopping Site for Mobiles,")) {
			System.out.println("Title is correct");
		}
		else {
			System.out.println("Invalid title");
		}
		
		String cURL = br.getPageURL();
		System.out.println("The page current URL is: "+cURL);
		
		br.closeBrowser();
		

	}

}
