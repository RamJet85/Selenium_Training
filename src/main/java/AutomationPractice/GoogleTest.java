package AutomationPractice;

public class GoogleTest {

	public static void main(String[] args) {
		
		String browserName = "chrome";
		
		BrowserUtils br = new BrowserUtils();
		br.launchBrowser(browserName);
		br.maximizeBrowser();
		br.launchURL("https://www.flipkart.com");
		String title = br.getPageTitle();
		System.out.println("The title is: "+title);
		// Equals method will do the exact comparison
		// Contains will check the given content is available or not
		if(title.contains("Online Shopping Site for Mobiles")) {
			System.out.println("Title is correct");
		}
		else {
			System.out.println("Invalid title");
		}
		
		System.out.println(br.getPageURL());
		
		br.closeBrowser();
		

	}

}
