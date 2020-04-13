package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	WebDriver driver;

	public Main() {

		System.setProperty("webdriver.chrome.driver", "/Users/suresh/eclipse-workspace/bin/bin/driver/chromedriver");

		driver = new ChromeDriver();

	}

	public void loadFaceBookPage() {

		driver.get("https://www.facebook.com/");

	}

	public void loadSalesForceLoginPage() {

		driver.get("https://login.salesforce.com/");

	}
	
	public void quitAll() {
		driver.quit();
	}

}
