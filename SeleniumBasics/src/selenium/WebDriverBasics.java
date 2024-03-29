package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/suresh/eclipse-workspace/bin/bin/driver/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.cognizant.com");

		String title = driver.getTitle();

		System.out.println(title);

		String currentURL = driver.getCurrentUrl();

		System.out.println(currentURL);
		
		String pageSource = driver.getPageSource();
		
		System.out.println(pageSource);
		
		driver.get("http://www.yahoo.com");
		
		 title = driver.getTitle();

		System.out.println(title);

		currentURL = driver.getCurrentUrl();

		System.out.println(currentURL);
		
		 pageSource = driver.getPageSource();
		
		System.out.println(pageSource);
		
		driver.navigate().back();
		
		driver.navigate().forward();

		driver.quit();

	}

}
